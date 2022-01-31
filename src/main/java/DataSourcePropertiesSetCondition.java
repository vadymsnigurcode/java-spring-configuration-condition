import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DataSourcePropertiesSetCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        System.out.println("Condition property veryfication.");
        return conditionContext.getEnvironment()
                .containsProperty("spring.datasource.url")
                && conditionContext.getEnvironment().containsProperty("spring.datasource.driver-class-name");

    }
}
