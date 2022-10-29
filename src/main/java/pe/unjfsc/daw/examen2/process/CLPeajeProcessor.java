package pe.unjfsc.daw.examen2.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import pe.unjfsc.daw.examen2.entity.CEPeajeDTOEntrada;
import pe.unjfsc.daw.examen2.entity.CEPeajeDTOSalida;


public class CLPeajeProcessor implements ItemProcessor<CEPeajeDTOEntrada, CEPeajeDTOSalida>{

	private static final Logger MOLOG = LoggerFactory.getLogger(CLPeajeProcessor.class);

	@Override
	@Nullable
	public CEPeajeDTOSalida process(@NonNull CEPeajeDTOEntrada item) throws Exception {
		MOLOG.info("[DAW] =====[ Start process ]=====");
        MOLOG.info("[DAW] Data received input : {} ", item.toString());
        CEPeajeDTOSalida oPeajeSalida = new CEPeajeDTOSalida();
       
        oPeajeSalida.setId(item.getId());
        oPeajeSalida.setEmpresa(item.getEmpresa());
        oPeajeSalida.setUc(item.getUc());
        oPeajeSalida.setDireccion(item.getDireccion());
        oPeajeSalida.setUbicacion(item.getUbicacion());
        oPeajeSalida.setFechaPeaje(item.getFechaPeaje());
        oPeajeSalida.setHoraPeaje(item.getHoraPeaje());
        oPeajeSalida.setTipoComprobante(item.getTipoComprobante());
        oPeajeSalida.setImporte(item.getImporte());
        oPeajeSalida.setNumeroComprobante(item.getNumeroComprobante());
        oPeajeSalida.setIgv(item.getImporte() * (18/100));
        oPeajeSalida.setTotalMasIGV(item.getImporte() + oPeajeSalida.getIgv());
        MOLOG.info("[DAW] Mapper to CECompraDTOEntrada : {}", oPeajeSalida.toString());
        return oPeajeSalida;
	}
	
}
