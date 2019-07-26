package zkemkeeper;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import zkemkeeper.*;

public interface _IZKEMEvents_OnAttTransactionEx_NewEventHandler {
  /** Method */
  @MethodTypeAnnotation(type = "DelegateMethod")
  public void Invoke(
      java.lang.String EnrollNumber,
      java.lang.Integer IsInValid,
      java.lang.Integer AttState,
      java.lang.Integer VerifyMethod,
      java.lang.Integer Year,
      java.lang.Integer Month,
      java.lang.Integer Day,
      java.lang.Integer Hour,
      java.lang.Integer Minute,
      java.lang.Integer Second,
      java.lang.String WorkCode);
}
