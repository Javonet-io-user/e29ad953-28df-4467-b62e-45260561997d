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

public interface _IZKEMEvents_Event {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnAttTransaction(_IZKEMEvents_OnAttTransactionEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAttTransaction(_IZKEMEvents_OnAttTransactionEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnKeyPress(_IZKEMEvents_OnKeyPressEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnKeyPress(_IZKEMEvents_OnKeyPressEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnEnrollFinger(_IZKEMEvents_OnEnrollFingerEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnEnrollFinger(_IZKEMEvents_OnEnrollFingerEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnNewUser(_IZKEMEvents_OnNewUserEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnNewUser(_IZKEMEvents_OnNewUserEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnEMData(_IZKEMEvents_OnEMDataEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnEMData(_IZKEMEvents_OnEMDataEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnConnected(_IZKEMEvents_OnConnectedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnConnected(_IZKEMEvents_OnConnectedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnDisConnected(_IZKEMEvents_OnDisConnectedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnDisConnected(_IZKEMEvents_OnDisConnectedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnFinger(_IZKEMEvents_OnFingerEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnFinger(_IZKEMEvents_OnFingerEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnVerify(_IZKEMEvents_OnVerifyEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnVerify(_IZKEMEvents_OnVerifyEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnFingerFeature(_IZKEMEvents_OnFingerFeatureEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnFingerFeature(_IZKEMEvents_OnFingerFeatureEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnHIDNum(_IZKEMEvents_OnHIDNumEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnHIDNum(_IZKEMEvents_OnHIDNumEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnDoor(_IZKEMEvents_OnDoorEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnDoor(_IZKEMEvents_OnDoorEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnAlarm(_IZKEMEvents_OnAlarmEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAlarm(_IZKEMEvents_OnAlarmEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnWriteCard(_IZKEMEvents_OnWriteCardEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnWriteCard(_IZKEMEvents_OnWriteCardEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnEmptyCard(_IZKEMEvents_OnEmptyCardEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnEmptyCard(_IZKEMEvents_OnEmptyCardEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnDeleteTemplate(_IZKEMEvents_OnDeleteTemplateEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnDeleteTemplate(_IZKEMEvents_OnDeleteTemplateEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnAttTransactionEx(_IZKEMEvents_OnAttTransactionExEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAttTransactionEx(_IZKEMEvents_OnAttTransactionExEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnEnrollFingerEx(_IZKEMEvents_OnEnrollFingerExEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnEnrollFingerEx(_IZKEMEvents_OnEnrollFingerExEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnGeneralEvent(_IZKEMEvents_OnGeneralEventEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnGeneralEvent(_IZKEMEvents_OnGeneralEventEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnAttTransactionEx_New(_IZKEMEvents_OnAttTransactionEx_NewEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAttTransactionEx_New(_IZKEMEvents_OnAttTransactionEx_NewEventHandler param0);
}
