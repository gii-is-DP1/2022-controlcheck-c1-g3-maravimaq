package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*Crear una consulta personalizada que pueda invocarse a través del repositorio de habitaciones de 
recuperación que obtenga un tipo de habitación de recuperación por su nombre. Exponerlo a través del 
servicio de gestión de habitaciones de recuperación mediante el método “getRecoveryRoomType(String 
name)*/

@Service
public class RecoveryRoomService {
	
	private RecoveryRoomRepository recoveryRoomRepository;
	
	@Autowired
	public RecoveryRoomService(RecoveryRoomRepository recoveryRoomRepository) {
		this.recoveryRoomRepository=recoveryRoomRepository;
	}
	
    public List<RecoveryRoom> getAll(){
        return recoveryRoomRepository.findAll();
    }

    public List<RecoveryRoomType> getAllRecoveryRoomTypes(){
        return recoveryRoomRepository.findAllRecoveryRoomTypes();
    }

    public RecoveryRoomType getRecoveryRoomType(String typeName) {
       return recoveryRoomRepository.getRecoveryRoomType(typeName);
    }

    public RecoveryRoom save(RecoveryRoom p) throws DuplicatedRoomNameException {
        return null;       
    }

    
}
