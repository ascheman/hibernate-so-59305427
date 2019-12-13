package net.aschemann.demo.spring.boot.hibernateproblem;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import java.io.Serializable;

public class UseIdOrGenerate extends SequenceStyleGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session,
                                 Object obj) {

        if (obj instanceof Identifier) {
            Identifier identifiable = (Identifier) obj;
            Long id = identifiable.getId();
            if (id != null) {
                return id;
            }
        }

        return super.generate(session, obj);
    }
}
