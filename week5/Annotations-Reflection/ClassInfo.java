package week5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Retention(RetentionPolicy.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassInfo {
	String author();

	String date();

	int currentRevision() default 1;
	
	Class<?>[] relatedClasses();
	
	boolean cheked() default true;

	String lastModified() default "N/A";

	String lastModifiedBy() default "N/A";

	String[] reviewers();

}
