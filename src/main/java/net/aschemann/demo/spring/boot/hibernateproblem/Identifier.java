package net.aschemann.demo.spring.boot.hibernateproblem;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class Identifier {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hilo_sequence_generator")
    @GenericGenerator(
            name = "hilo_sequence_generator",
            strategy = "net.aschemann.demo.spring.boot.hibernateproblem.UseIdOrGenerate",
            parameters = {
                    @Parameter(name = "sequence_name", value = "XXX_SEQUENCE"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "10"),
                    @Parameter(name = "optimizer", value = "hilo")
            })
    private Long id;

}
