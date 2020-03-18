package bio.terra.TEMPLATE.common.exception;

// This base class has data that corresponds to the ErrorReport model generated from
// the OpenAPI yaml. The global exception handler auto-magically converts exceptions
// of this base class into the appropriate ErrorReport REST response.

import java.util.List;
import org.springframework.http.HttpStatus;

public abstract class ConflictException extends ErrorReportException {
  private static final HttpStatus thisStatus = HttpStatus.CONFLICT;

  public ConflictException(String message) {
    super(message, null, thisStatus);
  }

  public ConflictException(String message, Throwable cause) {
    super(message, cause, null, thisStatus);
  }

  public ConflictException(Throwable cause) {
    super(null, cause, null, thisStatus);
  }

  public ConflictException(String message, List<String> causes) {
    super(message, causes, thisStatus);
  }

  public ConflictException(String message, Throwable cause, List<String> causes) {
    super(message, cause, causes, thisStatus);
  }
}
