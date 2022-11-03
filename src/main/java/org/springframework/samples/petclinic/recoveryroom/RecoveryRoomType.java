package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/*Modificar la clase denominada “RecoveryRoomType” alojada en el paquete 
“org.springframework.samples.petclinic.recoveryroom” para que sea una Entidad. Esta entidad debe 
tener los siguientes atributos y restricciones:
• Un atributo de tipo Integer llamado “Id” que actúe como clave primaria en la tabla de la base de 
datos relacional asociada a la entidad.
• Un atributo “name” de tipo cadena obligatorio, y cuya longitud minima son 5 carácteres y la 
máxima 50.
Se debe descomentar y anotar el método findAllRecoveryRoomTypes, del repositorio de habitaciones de 
recuperación, para que ejecute una consulta que permita obtener todos los tipos de habitaciones de 
recuperación existentes*/

@Getter
@Setter
@Entity
@Table(name = "recovery_room_type")
public class RecoveryRoomType extends BaseEntity{
    //Integer id;
	@NotBlank
	@Length(min = 5, max = 50)
	@Column(unique = true, name = "name")
	String name;
}
