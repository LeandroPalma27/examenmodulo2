package pe.unjfsc.daw.examen2.writer;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

import pe.unjfsc.daw.examen2.entity.CEPeajeDTOSalida;


public class CDPeajeWriter implements ItemWriter<CEPeajeDTOSalida>{

	private static final Logger LOG = LoggerFactory.getLogger(CDPeajeWriter.class);
	
	@Override
	public void write(List<? extends CEPeajeDTOSalida> items) throws Exception {
		LOG.info("[DAW] =====[ Start write ]=====");
        LOG.info("[DAW] Object output : {} ", items.toString());
        for (CEPeajeDTOSalida item : items) {
            LOG.info("[DAW] Item read  : {}", item.toString());
        }
        convertirJson(items);
	}
	
	public void convertirJson(List<? extends CEPeajeDTOSalida> items) {
		String path = "src/main/resources/fuente/output/".concat(java.time.LocalDate.now().toString()).concat(".json");
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File(path), items);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
