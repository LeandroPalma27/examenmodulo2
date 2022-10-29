package pe.unjfsc.daw.examen2.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import pe.unjfsc.daw.examen2.entity.CEPeajeDTOEntrada;


public class CLPeajeMapper implements FieldSetMapper<CEPeajeDTOEntrada>{

	private static final Logger MOLOG = LoggerFactory.getLogger(CLPeajeMapper.class);
	
	@Override
	public CEPeajeDTOEntrada mapFieldSet(FieldSet fieldSet) throws BindException {
		MOLOG.info("[DAW] =====[ Start mapFieldSet ]=====");
        MOLOG.info("[DAW] read record : {} ", fieldSet.toString());
       
        CEPeajeDTOEntrada oPeajeEntrada = new CEPeajeDTOEntrada();
        oPeajeEntrada.setId(fieldSet.readInt("id"));
        oPeajeEntrada.setEmpresa(fieldSet.readString("EMPRESA"));
        oPeajeEntrada.setUc(fieldSet.readLong("UC"));
        oPeajeEntrada.setDireccion(fieldSet.readString("DIRECCION"));
        oPeajeEntrada.setUbicacion(fieldSet.readString("UBICACION"));
        oPeajeEntrada.setFechaPeaje(fieldSet.readString("FECHA"));
        oPeajeEntrada.setHoraPeaje(fieldSet.readString("HORA"));
        oPeajeEntrada.setTipoComprobante(fieldSet.readString("TIPOCOMPROBANTE"));
        oPeajeEntrada.setNumeroComprobante(fieldSet.readString("NUMEROCOMPROBANTE"));
        oPeajeEntrada.setImporte(fieldSet.readDouble("IMPORTE"));
        MOLOG.info("[DAW] Mapper to CECompraDTOEntrada : {}", oPeajeEntrada.toString());
        return oPeajeEntrada;
	}

	
	
}
