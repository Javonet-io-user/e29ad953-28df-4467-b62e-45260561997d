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

public class _IZKEMEvents_SinkHelper implements _IZKEMEvents {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnAttTransactionEventHandler getm_OnAttTransactionDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnAttTransactionDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnAttTransactionDelegate(_IZKEMEvents_OnAttTransactionEventHandler param) {
    try {
      javonetHandle.set("m_OnAttTransactionDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnKeyPressEventHandler getm_OnKeyPressDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnKeyPressDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnKeyPressDelegate(_IZKEMEvents_OnKeyPressEventHandler param) {
    try {
      javonetHandle.set("m_OnKeyPressDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnEnrollFingerEventHandler getm_OnEnrollFingerDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnEnrollFingerDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnEnrollFingerDelegate(_IZKEMEvents_OnEnrollFingerEventHandler param) {
    try {
      javonetHandle.set("m_OnEnrollFingerDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnNewUserEventHandler getm_OnNewUserDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnNewUserDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnNewUserDelegate(_IZKEMEvents_OnNewUserEventHandler param) {
    try {
      javonetHandle.set("m_OnNewUserDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnEMDataEventHandler getm_OnEMDataDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnEMDataDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnEMDataDelegate(_IZKEMEvents_OnEMDataEventHandler param) {
    try {
      javonetHandle.set("m_OnEMDataDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnConnectedEventHandler getm_OnConnectedDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnConnectedDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnConnectedDelegate(_IZKEMEvents_OnConnectedEventHandler param) {
    try {
      javonetHandle.set("m_OnConnectedDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnDisConnectedEventHandler getm_OnDisConnectedDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnDisConnectedDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnDisConnectedDelegate(_IZKEMEvents_OnDisConnectedEventHandler param) {
    try {
      javonetHandle.set("m_OnDisConnectedDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnFingerEventHandler getm_OnFingerDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnFingerDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnFingerDelegate(_IZKEMEvents_OnFingerEventHandler param) {
    try {
      javonetHandle.set("m_OnFingerDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnVerifyEventHandler getm_OnVerifyDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnVerifyDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnVerifyDelegate(_IZKEMEvents_OnVerifyEventHandler param) {
    try {
      javonetHandle.set("m_OnVerifyDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnFingerFeatureEventHandler getm_OnFingerFeatureDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnFingerFeatureDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnFingerFeatureDelegate(_IZKEMEvents_OnFingerFeatureEventHandler param) {
    try {
      javonetHandle.set("m_OnFingerFeatureDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnHIDNumEventHandler getm_OnHIDNumDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnHIDNumDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnHIDNumDelegate(_IZKEMEvents_OnHIDNumEventHandler param) {
    try {
      javonetHandle.set("m_OnHIDNumDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnDoorEventHandler getm_OnDoorDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnDoorDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnDoorDelegate(_IZKEMEvents_OnDoorEventHandler param) {
    try {
      javonetHandle.set("m_OnDoorDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnAlarmEventHandler getm_OnAlarmDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnAlarmDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnAlarmDelegate(_IZKEMEvents_OnAlarmEventHandler param) {
    try {
      javonetHandle.set("m_OnAlarmDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnWriteCardEventHandler getm_OnWriteCardDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnWriteCardDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnWriteCardDelegate(_IZKEMEvents_OnWriteCardEventHandler param) {
    try {
      javonetHandle.set("m_OnWriteCardDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnEmptyCardEventHandler getm_OnEmptyCardDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnEmptyCardDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnEmptyCardDelegate(_IZKEMEvents_OnEmptyCardEventHandler param) {
    try {
      javonetHandle.set("m_OnEmptyCardDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnDeleteTemplateEventHandler getm_OnDeleteTemplateDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnDeleteTemplateDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnDeleteTemplateDelegate(_IZKEMEvents_OnDeleteTemplateEventHandler param) {
    try {
      javonetHandle.set("m_OnDeleteTemplateDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnAttTransactionExEventHandler getm_OnAttTransactionExDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnAttTransactionExDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnAttTransactionExDelegate(_IZKEMEvents_OnAttTransactionExEventHandler param) {
    try {
      javonetHandle.set("m_OnAttTransactionExDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnEnrollFingerExEventHandler getm_OnEnrollFingerExDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnEnrollFingerExDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnEnrollFingerExDelegate(_IZKEMEvents_OnEnrollFingerExEventHandler param) {
    try {
      javonetHandle.set("m_OnEnrollFingerExDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnGeneralEventEventHandler getm_OnGeneralEventDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnGeneralEventDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnGeneralEventDelegate(_IZKEMEvents_OnGeneralEventEventHandler param) {
    try {
      javonetHandle.set("m_OnGeneralEventDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IZKEMEvents_OnAttTransactionEx_NewEventHandler getm_OnAttTransactionEx_NewDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnAttTransactionEx_NewDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnAttTransactionEx_NewDelegate(
      _IZKEMEvents_OnAttTransactionEx_NewEventHandler param) {
    try {
      javonetHandle.set("m_OnAttTransactionEx_NewDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getm_dwCookie() {
    try {
      java.lang.Integer res = javonetHandle.get("m_dwCookie");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_dwCookie(java.lang.Integer param) {
    try {
      javonetHandle.set("m_dwCookie", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public _IZKEMEvents_SinkHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnAttTransaction(
      java.lang.Integer param0,
      java.lang.Integer param1,
      java.lang.Integer param2,
      java.lang.Integer param3,
      java.lang.Integer param4,
      java.lang.Integer param5,
      java.lang.Integer param6,
      java.lang.Integer param7,
      java.lang.Integer param8,
      java.lang.Integer param9) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents")
          .invoke(
              "OnAttTransaction",
              param0,
              param1,
              param2,
              param3,
              param4,
              param5,
              param6,
              param7,
              param8,
              param9);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnKeyPress(java.lang.Integer param0) {
    try {
      javonetHandle.explicitInterface("zkemkeeper._IZKEMEvents").invoke("OnKeyPress", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnEnrollFinger(
      java.lang.Integer param0,
      java.lang.Integer param1,
      java.lang.Integer param2,
      java.lang.Integer param3) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents")
          .invoke("OnEnrollFinger", param0, param1, param2, param3);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnNewUser(java.lang.Integer param0) {
    try {
      javonetHandle.explicitInterface("zkemkeeper._IZKEMEvents").invoke("OnNewUser", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnEMData(
      java.lang.Integer param0, java.lang.Integer param1, AtomicReference<java.lang.Byte> param2) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents")
          .invoke("OnEMData", param0, param1, new NRef(param2));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnConnected() {
    try {
      javonetHandle.explicitInterface("zkemkeeper._IZKEMEvents").invoke("OnConnected");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDisConnected() {
    try {
      javonetHandle.explicitInterface("zkemkeeper._IZKEMEvents").invoke("OnDisConnected");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnFinger() {
    try {
      javonetHandle.explicitInterface("zkemkeeper._IZKEMEvents").invoke("OnFinger");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnVerify(java.lang.Integer param0) {
    try {
      javonetHandle.explicitInterface("zkemkeeper._IZKEMEvents").invoke("OnVerify", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnFingerFeature(java.lang.Integer param0) {
    try {
      javonetHandle.explicitInterface("zkemkeeper._IZKEMEvents").invoke("OnFingerFeature", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnHIDNum(java.lang.Integer param0) {
    try {
      javonetHandle.explicitInterface("zkemkeeper._IZKEMEvents").invoke("OnHIDNum", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDoor(java.lang.Integer param0) {
    try {
      javonetHandle.explicitInterface("zkemkeeper._IZKEMEvents").invoke("OnDoor", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnAlarm(
      java.lang.Integer param0, java.lang.Integer param1, java.lang.Integer param2) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents")
          .invoke("OnAlarm", param0, param1, param2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnWriteCard(
      java.lang.Integer param0, java.lang.Integer param1, java.lang.Integer param2) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents")
          .invoke("OnWriteCard", param0, param1, param2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnEmptyCard(java.lang.Integer param0) {
    try {
      javonetHandle.explicitInterface("zkemkeeper._IZKEMEvents").invoke("OnEmptyCard", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDeleteTemplate(java.lang.Integer param0, java.lang.Integer param1) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents")
          .invoke("OnDeleteTemplate", param0, param1);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnAttTransactionEx(
      java.lang.String param0,
      java.lang.Integer param1,
      java.lang.Integer param2,
      java.lang.Integer param3,
      java.lang.Integer param4,
      java.lang.Integer param5,
      java.lang.Integer param6,
      java.lang.Integer param7,
      java.lang.Integer param8,
      java.lang.Integer param9,
      java.lang.Integer param10) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents")
          .invoke(
              "OnAttTransactionEx",
              param0,
              param1,
              param2,
              param3,
              param4,
              param5,
              param6,
              param7,
              param8,
              param9,
              param10);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnEnrollFingerEx(
      java.lang.String param0,
      java.lang.Integer param1,
      java.lang.Integer param2,
      java.lang.Integer param3) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents")
          .invoke("OnEnrollFingerEx", param0, param1, param2, param3);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnGeneralEvent(java.lang.String param0) {
    try {
      javonetHandle.explicitInterface("zkemkeeper._IZKEMEvents").invoke("OnGeneralEvent", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnAttTransactionEx_New(
      java.lang.String param0,
      java.lang.Integer param1,
      java.lang.Integer param2,
      java.lang.Integer param3,
      java.lang.Integer param4,
      java.lang.Integer param5,
      java.lang.Integer param6,
      java.lang.Integer param7,
      java.lang.Integer param8,
      java.lang.Integer param9,
      java.lang.String param10) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents")
          .invoke(
              "OnAttTransactionEx_New",
              param0,
              param1,
              param2,
              param3,
              param4,
              param5,
              param6,
              param7,
              param8,
              param9,
              param10);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
