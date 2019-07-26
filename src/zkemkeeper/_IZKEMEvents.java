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

public interface _IZKEMEvents {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnAttTransaction(
      java.lang.Integer EnrollNumber,
      java.lang.Integer IsInValid,
      java.lang.Integer AttState,
      java.lang.Integer VerifyMethod,
      java.lang.Integer Year,
      java.lang.Integer Month,
      java.lang.Integer Day,
      java.lang.Integer Hour,
      java.lang.Integer Minute,
      java.lang.Integer Second);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnKeyPress(java.lang.Integer Key);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnEnrollFinger(
      java.lang.Integer EnrollNumber,
      java.lang.Integer FingerIndex,
      java.lang.Integer ActionResult,
      java.lang.Integer TemplateLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnNewUser(java.lang.Integer EnrollNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnEMData(
      java.lang.Integer DataType,
      java.lang.Integer DataLen,
      AtomicReference<java.lang.Byte> DataBuffer);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnConnected();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnDisConnected();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnFinger();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnVerify(java.lang.Integer UserID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnFingerFeature(java.lang.Integer Score);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnHIDNum(java.lang.Integer CardNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnDoor(java.lang.Integer EventType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnAlarm(
      java.lang.Integer AlarmType, java.lang.Integer EnrollNumber, java.lang.Integer Verified);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnWriteCard(
      java.lang.Integer EnrollNumber, java.lang.Integer ActionResult, java.lang.Integer Length);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnEmptyCard(java.lang.Integer ActionResult);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnDeleteTemplate(java.lang.Integer EnrollNumber, java.lang.Integer FingerIndex);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnAttTransactionEx(
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
      java.lang.Integer WorkCode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnEnrollFingerEx(
      java.lang.String EnrollNumber,
      java.lang.Integer FingerIndex,
      java.lang.Integer ActionResult,
      java.lang.Integer TemplateLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnGeneralEvent(java.lang.String DataStr);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnAttTransactionEx_New(
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
