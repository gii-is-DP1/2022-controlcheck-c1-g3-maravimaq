package org.springframework.samples.petclinic.recoveryroom;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

/* debe obtener un tipo de habitación de recuperación dado su nombre buscándolo en la BD. 
Recuerde que, si el formatter no puede parsear un valor apropiado a partir del texto proporcionado, 
debe lanzar una excepción de tipo ParseException*/

@Component
public class RecoveryRoomTypeFormatter implements Formatter<RecoveryRoomType>{
	
	private RecoveryRoomService recoveryRoomService;
	
	@Autowired
	public RecoveryRoomTypeFormatter(RecoveryRoomService recoveryRoomService) {
		this.recoveryRoomService=recoveryRoomService;
	}

    @Override
    public String print(RecoveryRoomType object, Locale locale) {
        return object.getName();
    }

    @Override
    public RecoveryRoomType parse(String text, Locale locale) throws ParseException {
        List<RecoveryRoomType> recoveryRoomType = recoveryRoomService.getAllRecoveryRoomTypes();
        for (RecoveryRoomType r:recoveryRoomType) {
			if (r.getName().equals(text)) {
				return r;
			}
		} throw new ParseException("ProductType not found"+ text, 0);
    }
  }
