package Utils.Interfaces.Factory;


import Bio.Animals.Predator.Predator;
import org.reflections.Reflections;
import org.reflections.util.ConfigurationBuilder;

import java.util.HashSet;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class PrototypeBioFactory {

    public PrototypeBioFactory() {}

    public Set<Class<?>> createPredators() {
        Set<String> subtypesPredator = PrototypeBioFactory.getSubTypes(Predator.class);
        Set result = new HashSet<>();
        for (String typeName : subtypesPredator) {

        }
        return result;
    }

    private static Set<String> getSubTypes(Class<?> parentClazz) {
        Reflections reflections = new Reflections(
                new ConfigurationBuilder().
                forPackages(parentClazz.getName()).addScanners(SubTypes));
        return reflections.get(SubTypes.of(parentClazz));
    }
}
