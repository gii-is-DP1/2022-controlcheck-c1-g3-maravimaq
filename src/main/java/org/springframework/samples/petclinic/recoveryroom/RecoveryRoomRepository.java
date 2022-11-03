package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/*
 * Crear una consulta personalizada que pueda invocarse a través del repositorio de habitaciones de 
recuperación que obtenga un tipo de habitación de recuperación por su nombre. Exponerlo a través del 
servicio de gestión de habitaciones de recuperación mediante el método “getRecoveryRoomType(String 
name)”.
*/


public interface RecoveryRoomRepository extends CrudRepository<RecoveryRoom, Integer> {
    List<RecoveryRoom> findAll();
    Optional<RecoveryRoom> findById(int id);
    RecoveryRoom save(RecoveryRoom p);
    @Query("SELECT rt FROM RecoveryRoomType rt")
    List<RecoveryRoomType> findAllRecoveryRoomTypes();
    @Query("SELECT rt FROM RecoveryRoomType rt WHERE rt.name = ?1")
    RecoveryRoomType getRecoveryRoomType(String name);
}
