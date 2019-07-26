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
import jio.System.*;
import zkemkeeper.*;

public class CZKEMClass extends __ComObject implements IZKEM, CZKEM, _IZKEMEvents_Event {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setReadMark(java.lang.Boolean pVal) {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("set_ReadMark", pVal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getReadMark() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_ReadMark");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCommPort(java.lang.Integer pVal) {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("set_CommPort", pVal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCommPort() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_CommPort");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setConvertBIG5(java.lang.Integer pVal) {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("set_ConvertBIG5", pVal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getConvertBIG5() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_ConvertBIG5");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBASE64(java.lang.Integer pVal) {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("set_BASE64", pVal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getBASE64() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_BASE64");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPIN2(java.lang.Long pVal) {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("set_PIN2", pVal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getPIN2() {
    try {
      java.lang.Long res = javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_PIN2");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAccGroup(java.lang.Integer pVal) {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("set_AccGroup", pVal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getAccGroup() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_AccGroup");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "Method")
  public void setAccTimeZones(java.lang.Integer Index, java.lang.Integer pVal) {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("set_AccTimeZones", Index, pVal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer getAccTimeZones(java.lang.Integer Index) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_AccTimeZones", Index);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "Method")
  public void setCardNumber(java.lang.Integer Index, java.lang.Integer pVal) {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("set_CardNumber", Index, pVal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer getCardNumber(java.lang.Integer Index) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_CardNumber", Index);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPINWidth() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_PINWidth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMachineNumber(java.lang.Integer pVal) {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("set_MachineNumber", pVal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMachineNumber() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_MachineNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "Method")
  public void setSTR_CardNumber(java.lang.Integer Index, java.lang.String pVal) {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("set_STR_CardNumber", Index, pVal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String getSTR_CardNumber(java.lang.Integer Index) {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_STR_CardNumber", Index);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSSRPin() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_SSRPin");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPullMode(java.lang.Integer pVal) {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("set_PullMode", pVal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPullMode() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_PullMode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMaxP4PConnect() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_MaxP4PConnect");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBatchDataMode(java.lang.Integer pVal) {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("set_BatchDataMode", pVal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getBatchDataMode() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("get_BatchDataMode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public CZKEMClass() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("zkemkeeper.CZKEMClass");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "OnAttTransaction",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnAttTransactionEventHandler handler : _OnAttTransactionListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.Integer.class),
                    Convert(objects[3], java.lang.Integer.class),
                    Convert(objects[4], java.lang.Integer.class),
                    Convert(objects[5], java.lang.Integer.class),
                    Convert(objects[6], java.lang.Integer.class),
                    Convert(objects[7], java.lang.Integer.class),
                    Convert(objects[8], java.lang.Integer.class),
                    Convert(objects[9], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnKeyPress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnKeyPressEventHandler handler : _OnKeyPressListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnEnrollFinger",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnEnrollFingerEventHandler handler : _OnEnrollFingerListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.Integer.class),
                    Convert(objects[3], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnNewUser",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnNewUserEventHandler handler : _OnNewUserListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnEMData",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnEMDataEventHandler handler : _OnEMDataListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    new AtomicReference(objects[2]));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnConnected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnConnectedEventHandler handler : _OnConnectedListeners) {
                handler.Invoke();
              }
            }
          });
      javonetHandle.addEventListener(
          "OnDisConnected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnDisConnectedEventHandler handler : _OnDisConnectedListeners) {
                handler.Invoke();
              }
            }
          });
      javonetHandle.addEventListener(
          "OnFinger",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnFingerEventHandler handler : _OnFingerListeners) {
                handler.Invoke();
              }
            }
          });
      javonetHandle.addEventListener(
          "OnVerify",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnVerifyEventHandler handler : _OnVerifyListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnFingerFeature",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnFingerFeatureEventHandler handler : _OnFingerFeatureListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnHIDNum",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnHIDNumEventHandler handler : _OnHIDNumListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnDoor",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnDoorEventHandler handler : _OnDoorListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnAlarm",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnAlarmEventHandler handler : _OnAlarmListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnWriteCard",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnWriteCardEventHandler handler : _OnWriteCardListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnEmptyCard",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnEmptyCardEventHandler handler : _OnEmptyCardListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnDeleteTemplate",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnDeleteTemplateEventHandler handler : _OnDeleteTemplateListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnAttTransactionEx",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnAttTransactionExEventHandler handler :
                  _OnAttTransactionExListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.String.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.Integer.class),
                    Convert(objects[3], java.lang.Integer.class),
                    Convert(objects[4], java.lang.Integer.class),
                    Convert(objects[5], java.lang.Integer.class),
                    Convert(objects[6], java.lang.Integer.class),
                    Convert(objects[7], java.lang.Integer.class),
                    Convert(objects[8], java.lang.Integer.class),
                    Convert(objects[9], java.lang.Integer.class),
                    Convert(objects[10], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnEnrollFingerEx",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnEnrollFingerExEventHandler handler : _OnEnrollFingerExListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.String.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.Integer.class),
                    Convert(objects[3], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnGeneralEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnGeneralEventEventHandler handler : _OnGeneralEventListeners) {
                handler.Invoke(Convert(objects[0], java.lang.String.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnAttTransactionEx_New",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IZKEMEvents_OnAttTransactionEx_NewEventHandler handler :
                  _OnAttTransactionEx_NewListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.String.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.Integer.class),
                    Convert(objects[3], java.lang.Integer.class),
                    Convert(objects[4], java.lang.Integer.class),
                    Convert(objects[5], java.lang.Integer.class),
                    Convert(objects[6], java.lang.Integer.class),
                    Convert(objects[7], java.lang.Integer.class),
                    Convert(objects[8], java.lang.Integer.class),
                    Convert(objects[9], java.lang.Integer.class),
                    Convert(objects[10], java.lang.String.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CZKEMClass(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearAdministrators(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ClearAdministrators", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteEnrollData(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "DeleteEnrollData",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwEMachineNumber,
                  dwBackupNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadSuperLogData(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadSuperLogData", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAllSLogData(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadAllSLogData", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadGeneralLogData(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadGeneralLogData", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAllGLogData(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadAllGLogData", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EnableUser(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber,
      java.lang.Boolean bFlag) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "EnableUser",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwEMachineNumber,
                  dwBackupNumber,
                  bFlag);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EnableDevice(
      java.lang.Integer dwMachineNumber, java.lang.Boolean bFlag) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("EnableDevice", dwMachineNumber, bFlag);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceStatus(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwStatus,
      AtomicReference<java.lang.Integer> dwValue) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetDeviceStatus",
                  dwMachineNumber,
                  dwStatus,
                  new NOut(dwValue, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwInfo,
      AtomicReference<java.lang.Integer> dwValue) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetDeviceInfo",
                  dwMachineNumber,
                  dwInfo,
                  new NOut(dwValue, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceInfo(
      java.lang.Integer dwMachineNumber, java.lang.Integer dwInfo, java.lang.Integer dwValue) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetDeviceInfo", dwMachineNumber, dwInfo, dwValue);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceTime(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetDeviceTime", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PowerOnAllDevice() {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("PowerOnAllDevice");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean PowerOffDevice(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("PowerOffDevice", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ModifyPrivilege(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber,
      java.lang.Integer dwMachinePrivilege) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "ModifyPrivilege",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwEMachineNumber,
                  dwBackupNumber,
                  dwMachinePrivilege);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetLastError(AtomicReference<java.lang.Integer> dwErrorCode) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper.IZKEM")
          .invoke(
              "GetLastError",
              new NOut(dwErrorCode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetEnrollData(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber,
      AtomicReference<java.lang.Integer> dwMachinePrivilege,
      AtomicReference<java.lang.Integer> dwEnrollData,
      AtomicReference<java.lang.Integer> dwPassWord) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetEnrollData",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwEMachineNumber,
                  dwBackupNumber,
                  new NOut(
                      dwMachinePrivilege,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwEnrollData, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwPassWord, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetEnrollData(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber,
      java.lang.Integer dwMachinePrivilege,
      AtomicReference<java.lang.Integer> dwEnrollData,
      java.lang.Integer dwPassWord) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetEnrollData",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwEMachineNumber,
                  dwBackupNumber,
                  dwMachinePrivilege,
                  new NRef(dwEnrollData),
                  dwPassWord);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceTime(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwYear,
      AtomicReference<java.lang.Integer> dwMonth,
      AtomicReference<java.lang.Integer> dwDay,
      AtomicReference<java.lang.Integer> dwHour,
      AtomicReference<java.lang.Integer> dwMinute,
      AtomicReference<java.lang.Integer> dwSecond) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetDeviceTime",
                  dwMachineNumber,
                  new NOut(dwYear, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMonth, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwDay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwHour, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMinute, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwSecond, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetGeneralLogData(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwTMachineNumber,
      AtomicReference<java.lang.Integer> dwEnrollNumber,
      AtomicReference<java.lang.Integer> dwEMachineNumber,
      AtomicReference<java.lang.Integer> dwVerifyMode,
      AtomicReference<java.lang.Integer> dwInOutMode,
      AtomicReference<java.lang.Integer> dwYear,
      AtomicReference<java.lang.Integer> dwMonth,
      AtomicReference<java.lang.Integer> dwDay,
      AtomicReference<java.lang.Integer> dwHour,
      AtomicReference<java.lang.Integer> dwMinute) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetGeneralLogData",
                  dwMachineNumber,
                  new NOut(
                      dwTMachineNumber,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwEnrollNumber, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwEMachineNumber,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwVerifyMode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwInOutMode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwYear, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMonth, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwDay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwHour, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMinute, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetSuperLogData(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwTMachineNumber,
      AtomicReference<java.lang.Integer> dwSEnrollNumber,
      AtomicReference<java.lang.Integer> Params4,
      AtomicReference<java.lang.Integer> Params1,
      AtomicReference<java.lang.Integer> Params2,
      AtomicReference<java.lang.Integer> dwManipulation,
      AtomicReference<java.lang.Integer> Params3,
      AtomicReference<java.lang.Integer> dwYear,
      AtomicReference<java.lang.Integer> dwMonth,
      AtomicReference<java.lang.Integer> dwDay,
      AtomicReference<java.lang.Integer> dwHour,
      AtomicReference<java.lang.Integer> dwMinute) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetSuperLogData",
                  dwMachineNumber,
                  new NOut(
                      dwTMachineNumber,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwSEnrollNumber, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params4, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params1, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params2, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwManipulation, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NRef(Params3),
                  new NOut(dwYear, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMonth, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwDay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwHour, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMinute, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllSLogData(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwTMachineNumber,
      AtomicReference<java.lang.Integer> dwSEnrollNumber,
      AtomicReference<java.lang.Integer> Params4,
      AtomicReference<java.lang.Integer> Params1,
      AtomicReference<java.lang.Integer> Params2,
      AtomicReference<java.lang.Integer> dwManipulation,
      AtomicReference<java.lang.Integer> Params3,
      AtomicReference<java.lang.Integer> dwYear,
      AtomicReference<java.lang.Integer> dwMonth,
      AtomicReference<java.lang.Integer> dwDay,
      AtomicReference<java.lang.Integer> dwHour,
      AtomicReference<java.lang.Integer> dwMinute) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetAllSLogData",
                  dwMachineNumber,
                  new NOut(
                      dwTMachineNumber,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwSEnrollNumber, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params4, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params1, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params2, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwManipulation, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params3, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwYear, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMonth, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwDay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwHour, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMinute, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllGLogData(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwTMachineNumber,
      AtomicReference<java.lang.Integer> dwEnrollNumber,
      AtomicReference<java.lang.Integer> dwEMachineNumber,
      AtomicReference<java.lang.Integer> dwVerifyMode,
      AtomicReference<java.lang.Integer> dwInOutMode,
      AtomicReference<java.lang.Integer> dwYear,
      AtomicReference<java.lang.Integer> dwMonth,
      AtomicReference<java.lang.Integer> dwDay,
      AtomicReference<java.lang.Integer> dwHour,
      AtomicReference<java.lang.Integer> dwMinute) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetAllGLogData",
                  dwMachineNumber,
                  new NOut(
                      dwTMachineNumber,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwEnrollNumber, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwEMachineNumber,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwVerifyMode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwInOutMode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwYear, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMonth, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwDay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwHour, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMinute, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertPassword(
      java.lang.Integer dwSrcPSW,
      AtomicReference<java.lang.Integer> dwDestPSW,
      java.lang.Integer dwLength) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper.IZKEM")
          .invoke(
              "ConvertPassword",
              dwSrcPSW,
              new NOut(dwDestPSW, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
              dwLength);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAllUserID(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadAllUserID", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllUserID(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwEnrollNumber,
      AtomicReference<java.lang.Integer> dwEMachineNumber,
      AtomicReference<java.lang.Integer> dwBackupNumber,
      AtomicReference<java.lang.Integer> dwMachinePrivilege,
      AtomicReference<java.lang.Integer> dwEnable) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetAllUserID",
                  dwMachineNumber,
                  new NOut(
                      dwEnrollNumber, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwEMachineNumber,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwBackupNumber, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwMachinePrivilege,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwEnable, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetSerialNumber(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> dwSerialNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetSerialNumber",
                  dwMachineNumber,
                  new NOut(
                      dwSerialNumber, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearKeeperData(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ClearKeeperData", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetBackupNumber(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("GetBackupNumber", dwMachineNumber);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetProductCode(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> lpszProductCode) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetProductCode",
                  dwMachineNumber,
                  new NOut(
                      lpszProductCode, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetFirmwareVersion(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> strVersion) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetFirmwareVersion",
                  dwMachineNumber,
                  new NOut(strVersion, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetSDKVersion(AtomicReference<java.lang.String> strVersion) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetSDKVersion",
                  new NOut(strVersion, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearGLog(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("ClearGLog", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetFPTempLength(AtomicReference<java.lang.Byte> dwEnrollData) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("GetFPTempLength", new NRef(dwEnrollData));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Connect_Com(
      java.lang.Integer ComPort, java.lang.Integer MachineNumber, java.lang.Integer BaudRate) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("Connect_Com", ComPort, MachineNumber, BaudRate);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Connect_Net(java.lang.String IPAdd, java.lang.Integer Port) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("Connect_Net", IPAdd, Port);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Disconnect() {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("Disconnect");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.String Name,
      java.lang.String Password,
      java.lang.Integer Privilege,
      java.lang.Boolean Enabled) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetUserInfo",
                  dwMachineNumber,
                  dwEnrollNumber,
                  Name,
                  Password,
                  Privilege,
                  Enabled);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      AtomicReference<java.lang.String> Name,
      AtomicReference<java.lang.String> Password,
      AtomicReference<java.lang.Integer> Privilege,
      AtomicReference<java.lang.Boolean> Enabled) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserInfo",
                  dwMachineNumber,
                  dwEnrollNumber,
                  new NOut(Name, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Password, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Privilege, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Enabled, JavonetHelper.JavaToDotnetType.get(java.lang.Boolean.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceIP(java.lang.Integer dwMachineNumber, java.lang.String IPAddr) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetDeviceIP", dwMachineNumber, IPAddr);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceIP(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> IPAddr) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetDeviceIP",
                  dwMachineNumber,
                  new NOut(IPAddr, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserTmp(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Byte> TmpData,
      AtomicReference<java.lang.Integer> TmpLength) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserTmp",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwFingerIndex,
                  new NOut(TmpData, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(TmpLength, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserTmp(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Byte> TmpData) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetUserTmp", dwMachineNumber, dwEnrollNumber, dwFingerIndex, new NRef(TmpData));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllUserInfo(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwEnrollNumber,
      AtomicReference<java.lang.String> Name,
      AtomicReference<java.lang.String> Password,
      AtomicReference<java.lang.Integer> Privilege,
      AtomicReference<java.lang.Boolean> Enabled) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetAllUserInfo",
                  dwMachineNumber,
                  new NOut(
                      dwEnrollNumber, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Name, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Password, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Privilege, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Enabled, JavonetHelper.JavaToDotnetType.get(java.lang.Boolean.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DelUserTmp(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwFingerIndex) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DelUserTmp", dwMachineNumber, dwEnrollNumber, dwFingerIndex);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean RefreshData(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("RefreshData", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FPTempConvert(
      AtomicReference<java.lang.Byte> TmpData1,
      AtomicReference<java.lang.Byte> TmpData2,
      AtomicReference<java.lang.Integer> Size) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "FPTempConvert",
                  new NRef(TmpData1),
                  new NOut(TmpData2, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(Size, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetCommPassword(java.lang.Integer CommKey) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("SetCommPassword", CommKey);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserGroup(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      AtomicReference<java.lang.Integer> UserGrp) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserGroup",
                  dwMachineNumber,
                  dwEnrollNumber,
                  new NOut(UserGrp, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserGroup(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer UserGrp) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetUserGroup", dwMachineNumber, dwEnrollNumber, UserGrp);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetTZInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer TZIndex,
      AtomicReference<java.lang.String> TZ) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetTZInfo",
                  dwMachineNumber,
                  TZIndex,
                  new NOut(TZ, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetTZInfo(
      java.lang.Integer dwMachineNumber, java.lang.Integer TZIndex, java.lang.String TZ) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetTZInfo", dwMachineNumber, TZIndex, TZ);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUnlockGroups(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> Grps) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUnlockGroups",
                  dwMachineNumber,
                  new NOut(Grps, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUnlockGroups(
      java.lang.Integer dwMachineNumber, java.lang.String Grps) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetUnlockGroups", dwMachineNumber, Grps);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetGroupTZs(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer GroupIndex,
      AtomicReference<java.lang.Integer> TZs) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetGroupTZs",
                  dwMachineNumber,
                  GroupIndex,
                  new NOut(TZs, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetGroupTZs(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer GroupIndex,
      AtomicReference<java.lang.Integer> TZs) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetGroupTZs", dwMachineNumber, GroupIndex, new NRef(TZs));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserTZs(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      AtomicReference<java.lang.Integer> TZs) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserTZs",
                  dwMachineNumber,
                  dwEnrollNumber,
                  new NOut(TZs, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserTZs(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      AtomicReference<java.lang.Integer> TZs) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetUserTZs", dwMachineNumber, dwEnrollNumber, new NRef(TZs));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ACUnlock(java.lang.Integer dwMachineNumber, java.lang.Integer Delay) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ACUnlock", dwMachineNumber, Delay);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetACFun(AtomicReference<java.lang.Integer> ACFun) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetACFun",
                  new NOut(ACFun, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetGeneralLogDataStr(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwEnrollNumber,
      AtomicReference<java.lang.Integer> dwVerifyMode,
      AtomicReference<java.lang.Integer> dwInOutMode,
      AtomicReference<java.lang.String> TimeStr) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetGeneralLogDataStr",
                  dwMachineNumber,
                  new NOut(
                      dwEnrollNumber, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwVerifyMode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwInOutMode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(TimeStr, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserTmpStr(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.String> TmpData,
      AtomicReference<java.lang.Integer> TmpLength) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserTmpStr",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwFingerIndex,
                  new NOut(TmpData, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(TmpLength, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserTmpStr(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      java.lang.String TmpData) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetUserTmpStr", dwMachineNumber, dwEnrollNumber, dwFingerIndex, TmpData);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetEnrollDataStr(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber,
      AtomicReference<java.lang.Integer> dwMachinePrivilege,
      AtomicReference<java.lang.String> dwEnrollData,
      AtomicReference<java.lang.Integer> dwPassWord) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetEnrollDataStr",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwEMachineNumber,
                  dwBackupNumber,
                  new NOut(
                      dwMachinePrivilege,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwEnrollData, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(
                      dwPassWord, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetEnrollDataStr(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber,
      java.lang.Integer dwMachinePrivilege,
      java.lang.String dwEnrollData,
      java.lang.Integer dwPassWord) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetEnrollDataStr",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwEMachineNumber,
                  dwBackupNumber,
                  dwMachinePrivilege,
                  dwEnrollData,
                  dwPassWord);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetGroupTZStr(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer GroupIndex,
      AtomicReference<java.lang.String> TZs) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetGroupTZStr",
                  dwMachineNumber,
                  GroupIndex,
                  new NOut(TZs, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetGroupTZStr(
      java.lang.Integer dwMachineNumber, java.lang.Integer GroupIndex, java.lang.String TZs) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetGroupTZStr", dwMachineNumber, GroupIndex, TZs);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserTZStr(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      AtomicReference<java.lang.String> TZs) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserTZStr",
                  dwMachineNumber,
                  dwEnrollNumber,
                  new NOut(TZs, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserTZStr(
      java.lang.Integer dwMachineNumber, java.lang.Integer dwEnrollNumber, java.lang.String TZs) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetUserTZStr", dwMachineNumber, dwEnrollNumber, TZs);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FPTempConvertStr(
      java.lang.String TmpData1,
      AtomicReference<java.lang.String> TmpData2,
      AtomicReference<java.lang.Integer> Size) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "FPTempConvertStr",
                  TmpData1,
                  new NOut(TmpData2, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NRef(Size));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetFPTempLengthStr(java.lang.String dwEnrollData) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("GetFPTempLengthStr", dwEnrollData);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserInfoByPIN2(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> Name,
      AtomicReference<java.lang.String> Password,
      AtomicReference<java.lang.Integer> Privilege,
      AtomicReference<java.lang.Boolean> Enabled) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserInfoByPIN2",
                  dwMachineNumber,
                  new NOut(Name, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Password, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Privilege, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Enabled, JavonetHelper.JavaToDotnetType.get(java.lang.Boolean.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserInfoByCard(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> Name,
      AtomicReference<java.lang.String> Password,
      AtomicReference<java.lang.Integer> Privilege,
      AtomicReference<java.lang.Boolean> Enabled) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserInfoByCard",
                  dwMachineNumber,
                  new NOut(Name, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Password, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Privilege, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Enabled, JavonetHelper.JavaToDotnetType.get(java.lang.Boolean.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean CaptureImage(
      java.lang.Boolean FullImage,
      AtomicReference<java.lang.Integer> Width,
      AtomicReference<java.lang.Integer> Height,
      AtomicReference<java.lang.Byte> Image,
      java.lang.String ImageFile) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "CaptureImage",
                  FullImage,
                  new NOut(Width, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Height, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Image, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  ImageFile);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UpdateFirmware(java.lang.String FirmwareFile) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("UpdateFirmware", FirmwareFile);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean StartEnroll(java.lang.Integer UserID, java.lang.Integer FingerID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("StartEnroll", UserID, FingerID);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean StartVerify(java.lang.Integer UserID, java.lang.Integer FingerID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("StartVerify", UserID, FingerID);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean StartIdentify() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("StartIdentify");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean CancelOperation() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("CancelOperation");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean QueryState(AtomicReference<java.lang.Integer> State) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "QueryState",
                  new NOut(State, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean BackupData(java.lang.String DataFile) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("BackupData", DataFile);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean RestoreData(java.lang.String DataFile) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("RestoreData", DataFile);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean WriteLCD(
      java.lang.Integer Row, java.lang.Integer Col, java.lang.String Text) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("WriteLCD", Row, Col, Text);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearLCD() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("ClearLCD");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Beep(java.lang.Integer DelayMS) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("Beep", DelayMS);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean PlayVoice(java.lang.Integer Position, java.lang.Integer Length) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("PlayVoice", Position, Length);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean PlayVoiceByIndex(java.lang.Integer Index) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("PlayVoiceByIndex", Index);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EnableClock(java.lang.Integer Enabled) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("EnableClock", Enabled);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserIDByPIN2(
      java.lang.Integer PIN2, AtomicReference<java.lang.Integer> UserID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserIDByPIN2",
                  PIN2,
                  new NOut(UserID, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetPIN2(
      java.lang.Integer UserID, AtomicReference<java.lang.Integer> PIN2) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetPIN2",
                  UserID,
                  new NOut(PIN2, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FPTempConvertNew(
      AtomicReference<java.lang.Byte> TmpData1,
      AtomicReference<java.lang.Byte> TmpData2,
      AtomicReference<java.lang.Integer> Size) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "FPTempConvertNew",
                  new NRef(TmpData1),
                  new NOut(TmpData2, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(Size, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FPTempConvertNewStr(
      java.lang.String TmpData1,
      AtomicReference<java.lang.String> TmpData2,
      AtomicReference<java.lang.Integer> Size) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "FPTempConvertNewStr",
                  TmpData1,
                  new NOut(TmpData2, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Size, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAllTemplate(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadAllTemplate", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DisableDeviceWithTimeOut(
      java.lang.Integer dwMachineNumber, java.lang.Integer TimeOutSec) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DisableDeviceWithTimeOut", dwMachineNumber, TimeOutSec);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceTime2(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwYear,
      java.lang.Integer dwMonth,
      java.lang.Integer dwDay,
      java.lang.Integer dwHour,
      java.lang.Integer dwMinute,
      java.lang.Integer dwSecond) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetDeviceTime2",
                  dwMachineNumber,
                  dwYear,
                  dwMonth,
                  dwDay,
                  dwHour,
                  dwMinute,
                  dwSecond);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearSLog(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("ClearSLog", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean RestartDevice(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("RestartDevice", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceMAC(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> sMAC) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetDeviceMAC",
                  dwMachineNumber,
                  new NOut(sMAC, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceMAC(java.lang.Integer dwMachineNumber, java.lang.String sMAC) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetDeviceMAC", dwMachineNumber, sMAC);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetWiegandFmt(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> sWiegandFmt) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetWiegandFmt",
                  dwMachineNumber,
                  new NOut(
                      sWiegandFmt, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetWiegandFmt(
      java.lang.Integer dwMachineNumber, java.lang.String sWiegandFmt) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetWiegandFmt", dwMachineNumber, sWiegandFmt);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearSMS(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("ClearSMS", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetSMS(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer ID,
      AtomicReference<java.lang.Integer> Tag,
      AtomicReference<java.lang.Integer> ValidMinutes,
      AtomicReference<java.lang.String> StartTime,
      AtomicReference<java.lang.String> Content) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetSMS",
                  dwMachineNumber,
                  ID,
                  new NOut(Tag, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      ValidMinutes, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(StartTime, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Content, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetSMS(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer ID,
      java.lang.Integer Tag,
      java.lang.Integer ValidMinutes,
      java.lang.String StartTime,
      java.lang.String Content) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetSMS", dwMachineNumber, ID, Tag, ValidMinutes, StartTime, Content);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteSMS(java.lang.Integer dwMachineNumber, java.lang.Integer ID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DeleteSMS", dwMachineNumber, ID);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserSMS(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer SMSID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetUserSMS", dwMachineNumber, dwEnrollNumber, SMSID);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteUserSMS(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer SMSID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DeleteUserSMS", dwMachineNumber, dwEnrollNumber, SMSID);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetCardFun(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.Integer> CardFun) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetCardFun",
                  dwMachineNumber,
                  new NOut(CardFun, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearUserSMS(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ClearUserSMS", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceCommPwd(
      java.lang.Integer dwMachineNumber, java.lang.Integer CommKey) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetDeviceCommPwd", dwMachineNumber, CommKey);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDoorState(
      java.lang.Integer MachineNumber, AtomicReference<java.lang.Integer> State) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetDoorState",
                  MachineNumber,
                  new NOut(State, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetVendor(AtomicReference<java.lang.String> strVendor) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetVendor",
                  new NOut(strVendor, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetSensorSN(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> SensorSN) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetSensorSN",
                  dwMachineNumber,
                  new NOut(SensorSN, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadCustData(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> CustData) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "ReadCustData",
                  dwMachineNumber,
                  new NOut(CustData, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean WriteCustData(
      java.lang.Integer dwMachineNumber, java.lang.String CustData) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("WriteCustData", dwMachineNumber, CustData);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean BeginBatchUpdate(
      java.lang.Integer dwMachineNumber, java.lang.Integer UpdateFlag) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("BeginBatchUpdate", dwMachineNumber, UpdateFlag);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean BatchUpdate(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("BatchUpdate", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearData(
      java.lang.Integer dwMachineNumber, java.lang.Integer DataFlag) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ClearData", dwMachineNumber, DataFlag);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDataFile(
      java.lang.Integer dwMachineNumber, java.lang.Integer DataFlag, java.lang.String FileName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("GetDataFile", dwMachineNumber, DataFlag, FileName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean WriteCard(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwFingerIndex1,
      AtomicReference<java.lang.Byte> TmpData1,
      java.lang.Integer dwFingerIndex2,
      AtomicReference<java.lang.Byte> TmpData2,
      java.lang.Integer dwFingerIndex3,
      AtomicReference<java.lang.Byte> TmpData3,
      java.lang.Integer dwFingerIndex4,
      AtomicReference<java.lang.Byte> TmpData4) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "WriteCard",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwFingerIndex1,
                  new NRef(TmpData1),
                  dwFingerIndex2,
                  new NRef(TmpData2),
                  dwFingerIndex3,
                  new NRef(TmpData3),
                  dwFingerIndex4,
                  new NRef(TmpData4));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetGeneralExtLogData(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwEnrollNumber,
      AtomicReference<java.lang.Integer> dwVerifyMode,
      AtomicReference<java.lang.Integer> dwInOutMode,
      AtomicReference<java.lang.Integer> dwYear,
      AtomicReference<java.lang.Integer> dwMonth,
      AtomicReference<java.lang.Integer> dwDay,
      AtomicReference<java.lang.Integer> dwHour,
      AtomicReference<java.lang.Integer> dwMinute,
      AtomicReference<java.lang.Integer> dwSecond,
      AtomicReference<java.lang.Integer> dwWorkCode,
      AtomicReference<java.lang.Integer> dwReserved) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetGeneralExtLogData",
                  dwMachineNumber,
                  new NOut(
                      dwEnrollNumber, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwVerifyMode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwInOutMode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwYear, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMonth, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwDay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwHour, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMinute, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwSecond, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwWorkCode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwReserved, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EmptyCard(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("EmptyCard", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceStrInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwInfo,
      AtomicReference<java.lang.String> Value) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetDeviceStrInfo",
                  dwMachineNumber,
                  dwInfo,
                  new NOut(Value, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetSysOption(
      java.lang.Integer dwMachineNumber,
      java.lang.String Option,
      AtomicReference<java.lang.String> Value) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetSysOption",
                  dwMachineNumber,
                  Option,
                  new NOut(Value, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserInfoEx(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer VerifyStyle,
      AtomicReference<java.lang.Byte> Reserved) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetUserInfoEx",
                  dwMachineNumber,
                  dwEnrollNumber,
                  VerifyStyle,
                  new NRef(Reserved));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserInfoEx(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      AtomicReference<java.lang.Integer> VerifyStyle,
      AtomicReference<java.lang.Byte> Reserved) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserInfoEx",
                  dwMachineNumber,
                  dwEnrollNumber,
                  new NOut(
                      VerifyStyle, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Reserved, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteUserInfoEx(
      java.lang.Integer dwMachineNumber, java.lang.Integer dwEnrollNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DeleteUserInfoEx", dwMachineNumber, dwEnrollNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetGeneralLogData(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> dwEnrollNumber,
      AtomicReference<java.lang.Integer> dwVerifyMode,
      AtomicReference<java.lang.Integer> dwInOutMode,
      AtomicReference<java.lang.Integer> dwYear,
      AtomicReference<java.lang.Integer> dwMonth,
      AtomicReference<java.lang.Integer> dwDay,
      AtomicReference<java.lang.Integer> dwHour,
      AtomicReference<java.lang.Integer> dwMinute,
      AtomicReference<java.lang.Integer> dwSecond,
      AtomicReference<java.lang.Integer> dwWorkCode) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetGeneralLogData",
                  dwMachineNumber,
                  new NOut(
                      dwEnrollNumber, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(
                      dwVerifyMode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwInOutMode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwYear, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMonth, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwDay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwHour, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMinute, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwSecond, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwWorkCode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetAllUserInfo(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> dwEnrollNumber,
      AtomicReference<java.lang.String> Name,
      AtomicReference<java.lang.String> Password,
      AtomicReference<java.lang.Integer> Privilege,
      AtomicReference<java.lang.Boolean> Enabled) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetAllUserInfo",
                  dwMachineNumber,
                  new NOut(
                      dwEnrollNumber, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Name, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Password, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Privilege, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Enabled, JavonetHelper.JavaToDotnetType.get(java.lang.Boolean.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetUserInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      AtomicReference<java.lang.String> Name,
      AtomicReference<java.lang.String> Password,
      AtomicReference<java.lang.Integer> Privilege,
      AtomicReference<java.lang.Boolean> Enabled) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetUserInfo",
                  dwMachineNumber,
                  dwEnrollNumber,
                  new NOut(Name, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Password, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Privilege, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Enabled, JavonetHelper.JavaToDotnetType.get(java.lang.Boolean.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetUserTmp(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Byte> TmpData,
      AtomicReference<java.lang.Integer> TmpLength) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetUserTmp",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwFingerIndex,
                  new NOut(TmpData, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(TmpLength, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetUserTmpStr(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.String> TmpData,
      AtomicReference<java.lang.Integer> TmpLength) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetUserTmpStr",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwFingerIndex,
                  new NOut(TmpData, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(TmpLength, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DeleteEnrollData(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwBackupNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_DeleteEnrollData", dwMachineNumber, dwEnrollNumber, dwBackupNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetUserInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.String Name,
      java.lang.String Password,
      java.lang.Integer Privilege,
      java.lang.Boolean Enabled) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_SetUserInfo",
                  dwMachineNumber,
                  dwEnrollNumber,
                  Name,
                  Password,
                  Privilege,
                  Enabled);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetUserTmp(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Byte> TmpData) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_SetUserTmp",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwFingerIndex,
                  new NRef(TmpData));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetUserTmpStr(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      java.lang.String TmpData) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_SetUserTmpStr", dwMachineNumber, dwEnrollNumber, dwFingerIndex, TmpData);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DelUserTmp(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_DelUserTmp", dwMachineNumber, dwEnrollNumber, dwFingerIndex);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetWorkCode(java.lang.Integer WorkCodeID, java.lang.Integer AWorkCode) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetWorkCode", WorkCodeID, AWorkCode);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetWorkCode(
      java.lang.Integer WorkCodeID, AtomicReference<java.lang.Integer> AWorkCode) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetWorkCode",
                  WorkCodeID,
                  new NOut(AWorkCode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteWorkCode(java.lang.Integer WorkCodeID) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("DeleteWorkCode", WorkCodeID);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearWorkCode() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("ClearWorkCode");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAttRule(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadAttRule", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadDPTInfo(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadDPTInfo", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SaveTheDataToFile(
      java.lang.Integer dwMachineNumber, java.lang.String TheFilePath, java.lang.Integer FileFlag) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SaveTheDataToFile", dwMachineNumber, TheFilePath, FileFlag);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadTurnInfo(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadTurnInfo", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_OutPutHTMLRep(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.String AttFile,
      java.lang.String UserFile,
      java.lang.String DeptFile,
      java.lang.String TimeClassFile,
      java.lang.String AttruleFile,
      java.lang.Integer BYear,
      java.lang.Integer BMonth,
      java.lang.Integer BDay,
      java.lang.Integer BHour,
      java.lang.Integer BMinute,
      java.lang.Integer BSecond,
      java.lang.Integer EYear,
      java.lang.Integer EMonth,
      java.lang.Integer EDay,
      java.lang.Integer EHour,
      java.lang.Integer EMinute,
      java.lang.Integer ESecond,
      java.lang.String TempPath,
      java.lang.String OutFileName,
      java.lang.Integer HTMLFlag,
      java.lang.Integer resv1,
      java.lang.String resv2) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_OutPutHTMLRep",
                  dwMachineNumber,
                  dwEnrollNumber,
                  AttFile,
                  UserFile,
                  DeptFile,
                  TimeClassFile,
                  AttruleFile,
                  BYear,
                  BMonth,
                  BDay,
                  BHour,
                  BMinute,
                  BSecond,
                  EYear,
                  EMonth,
                  EDay,
                  EHour,
                  EMinute,
                  ESecond,
                  TempPath,
                  OutFileName,
                  HTMLFlag,
                  resv1,
                  resv2);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAOptions(
      java.lang.String AOption, AtomicReference<java.lang.String> AValue) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "ReadAOptions",
                  AOption,
                  new NOut(AValue, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadRTLog(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("ReadRTLog", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetRTLog(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("GetRTLog", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetHIDEventCardNumAsStr(
      AtomicReference<java.lang.String> strHIDEventCardNum) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetHIDEventCardNumAsStr",
                  new NOut(
                      strHIDEventCardNum,
                      JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetStrCardNumber(AtomicReference<java.lang.String> ACardNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetStrCardNumber",
                  new NOut(
                      ACardNumber, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetStrCardNumber(java.lang.String ACardNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetStrCardNumber", ACardNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean RegEvent(
      java.lang.Integer dwMachineNumber, java.lang.Integer EventMask) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("RegEvent", dwMachineNumber, EventMask);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean CancelBatchUpdate(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("CancelBatchUpdate", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetSysOption(
      java.lang.Integer dwMachineNumber, java.lang.String Option, java.lang.String Value) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetSysOption", dwMachineNumber, Option, Value);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Connect_Modem(
      java.lang.Integer ComPort,
      java.lang.Integer MachineNumber,
      java.lang.Integer BaudRate,
      java.lang.String Telephone) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("Connect_Modem", ComPort, MachineNumber, BaudRate, Telephone);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UseGroupTimeZone() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("UseGroupTimeZone");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetHoliday(java.lang.Integer dwMachineNumber, java.lang.String Holiday) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetHoliday", dwMachineNumber, Holiday);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetHoliday(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> Holiday) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetHoliday",
                  dwMachineNumber,
                  new NOut(Holiday, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDaylight(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer Support,
      java.lang.String BeginTime,
      java.lang.String EndTime) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetDaylight", dwMachineNumber, Support, BeginTime, EndTime);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDaylight(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> Support,
      AtomicReference<java.lang.String> BeginTime,
      AtomicReference<java.lang.String> EndTime) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetDaylight",
                  dwMachineNumber,
                  new NOut(Support, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(BeginTime, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(EndTime, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetUnLockGroup(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer CombNo,
      java.lang.Integer Group1,
      java.lang.Integer Group2,
      java.lang.Integer Group3,
      java.lang.Integer Group4,
      java.lang.Integer Group5) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_SetUnLockGroup",
                  dwMachineNumber,
                  CombNo,
                  Group1,
                  Group2,
                  Group3,
                  Group4,
                  Group5);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetUnLockGroup(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer CombNo,
      AtomicReference<java.lang.Integer> Group1,
      AtomicReference<java.lang.Integer> Group2,
      AtomicReference<java.lang.Integer> Group3,
      AtomicReference<java.lang.Integer> Group4,
      AtomicReference<java.lang.Integer> Group5) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetUnLockGroup",
                  dwMachineNumber,
                  CombNo,
                  new NOut(Group1, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Group2, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Group3, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Group4, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Group5, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetGroupTZ(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer GroupNo,
      java.lang.Integer Tz1,
      java.lang.Integer Tz2,
      java.lang.Integer Tz3,
      java.lang.Integer VaildHoliday,
      java.lang.Integer VerifyStyle) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_SetGroupTZ",
                  dwMachineNumber,
                  GroupNo,
                  Tz1,
                  Tz2,
                  Tz3,
                  VaildHoliday,
                  VerifyStyle);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetGroupTZ(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer GroupNo,
      AtomicReference<java.lang.Integer> Tz1,
      AtomicReference<java.lang.Integer> Tz2,
      AtomicReference<java.lang.Integer> Tz3,
      AtomicReference<java.lang.Integer> VaildHoliday,
      AtomicReference<java.lang.Integer> VerifyStyle) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetGroupTZ",
                  dwMachineNumber,
                  GroupNo,
                  new NOut(Tz1, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Tz2, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Tz3, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      VaildHoliday, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      VerifyStyle, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetHoliday(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer HolidayID,
      AtomicReference<java.lang.Integer> BeginMonth,
      AtomicReference<java.lang.Integer> BeginDay,
      AtomicReference<java.lang.Integer> EndMonth,
      AtomicReference<java.lang.Integer> EndDay,
      AtomicReference<java.lang.Integer> TimeZoneID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetHoliday",
                  dwMachineNumber,
                  HolidayID,
                  new NOut(BeginMonth, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(BeginDay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(EndMonth, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(EndDay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      TimeZoneID, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetHoliday(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer HolidayID,
      java.lang.Integer BeginMonth,
      java.lang.Integer BeginDay,
      java.lang.Integer EndMonth,
      java.lang.Integer EndDay,
      java.lang.Integer TimeZoneID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_SetHoliday",
                  dwMachineNumber,
                  HolidayID,
                  BeginMonth,
                  BeginDay,
                  EndMonth,
                  EndDay,
                  TimeZoneID);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetPlatform(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> Platform) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetPlatform",
                  dwMachineNumber,
                  new NOut(Platform, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetUserSMS(
      java.lang.Integer dwMachineNumber, java.lang.String dwEnrollNumber, java.lang.Integer SMSID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_SetUserSMS", dwMachineNumber, dwEnrollNumber, SMSID);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DeleteUserSMS(
      java.lang.Integer dwMachineNumber, java.lang.String dwEnrollNumber, java.lang.Integer SMSID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_DeleteUserSMS", dwMachineNumber, dwEnrollNumber, SMSID);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsTFTMachine(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("IsTFTMachine", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_EnableUser(
      java.lang.Integer dwMachineNumber, java.lang.String dwEnrollNumber, java.lang.Boolean bFlag) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_EnableUser", dwMachineNumber, dwEnrollNumber, bFlag);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SendCMDMsg(
      java.lang.Integer dwMachineNumber, java.lang.Integer Param1, java.lang.Integer Param2) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SendCMDMsg", dwMachineNumber, Param1, Param2);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SendFile(java.lang.Integer dwMachineNumber, java.lang.String FileName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SendFile", dwMachineNumber, FileName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetLanguageByID(
      java.lang.Integer dwMachineNumber, java.lang.Integer LanguageID, java.lang.String Language) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetLanguageByID", dwMachineNumber, LanguageID, Language);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadFile(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.String FilePath) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadFile", dwMachineNumber, FileName, FilePath);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetLastCount(java.lang.Integer count) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("SetLastCount", count);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetCustomizeAttState(
      java.lang.Integer dwMachineNumber, java.lang.Integer StateID, java.lang.Integer NewState) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetCustomizeAttState", dwMachineNumber, StateID, NewState);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DelCustomizeAttState(
      java.lang.Integer dwMachineNumber, java.lang.Integer StateID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DelCustomizeAttState", dwMachineNumber, StateID);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EnableCustomizeAttState(
      java.lang.Integer dwMachineNumber, java.lang.Integer StateID, java.lang.Integer Enable) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("EnableCustomizeAttState", dwMachineNumber, StateID, Enable);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetCustomizeVoice(
      java.lang.Integer dwMachineNumber, java.lang.Integer VoiceID, java.lang.String FileName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetCustomizeVoice", dwMachineNumber, VoiceID, FileName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DelCustomizeVoice(
      java.lang.Integer dwMachineNumber, java.lang.Integer VoiceID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DelCustomizeVoice", dwMachineNumber, VoiceID);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EnableCustomizeVoice(
      java.lang.Integer dwMachineNumber, java.lang.Integer VoiceID, java.lang.Integer Enable) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("EnableCustomizeVoice", dwMachineNumber, VoiceID, Enable);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean StartEnrollEx(
      java.lang.String UserID, java.lang.Integer FingerID, java.lang.Integer Flag) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("StartEnrollEx", UserID, FingerID, Flag);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetUserTmpExt(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer IsDeleted,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Byte> TmpData) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_SetUserTmpExt",
                  dwMachineNumber,
                  IsDeleted,
                  dwEnrollNumber,
                  dwFingerIndex,
                  new NRef(TmpData));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DelUserTmpExt(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_DelUserTmpExt", dwMachineNumber, dwEnrollNumber, dwFingerIndex);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DeleteEnrollDataExt(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwBackupNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_DeleteEnrollDataExt", dwMachineNumber, dwEnrollNumber, dwBackupNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetWorkCode(
      java.lang.Integer AWorkCode, AtomicReference<java.lang.String> Name) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetWorkCode",
                  AWorkCode,
                  new NOut(Name, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetWorkCode(java.lang.Integer AWorkCode, java.lang.String Name) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_SetWorkCode", AWorkCode, Name);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DeleteWorkCode(java.lang.Integer PIN) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("SSR_DeleteWorkCode", PIN);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_ClearWorkCode() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("SSR_ClearWorkCode");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetSuperLogData(
      java.lang.Integer MachineNumber,
      AtomicReference<java.lang.Integer> Number,
      AtomicReference<java.lang.String> Admin,
      AtomicReference<java.lang.String> User,
      AtomicReference<java.lang.Integer> Manipulation,
      AtomicReference<java.lang.String> Time,
      AtomicReference<java.lang.Integer> Params1,
      AtomicReference<java.lang.Integer> Params2,
      AtomicReference<java.lang.Integer> Params3) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetSuperLogData",
                  MachineNumber,
                  new NOut(Number, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Admin, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(User, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(
                      Manipulation, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Time, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Params1, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params2, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params3, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetShortkey(
      java.lang.Integer ShortKeyID,
      java.lang.Integer ShortKeyFun,
      java.lang.Integer StateCode,
      java.lang.String StateName,
      java.lang.Integer StateAutoChange,
      java.lang.String StateAutoChangeTime) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_SetShortkey",
                  ShortKeyID,
                  ShortKeyFun,
                  StateCode,
                  StateName,
                  StateAutoChange,
                  StateAutoChangeTime);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetShortkey(
      java.lang.Integer ShortKeyID,
      AtomicReference<java.lang.Integer> ShortKeyFun,
      AtomicReference<java.lang.Integer> StateCode,
      AtomicReference<java.lang.String> StateName,
      AtomicReference<java.lang.Integer> AutoChange,
      AtomicReference<java.lang.String> AutoChangeTime) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetShortkey",
                  ShortKeyID,
                  new NOut(
                      ShortKeyFun, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(StateCode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(StateName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(AutoChange, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      AutoChangeTime, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Connect_USB(java.lang.Integer MachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("Connect_USB", MachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetSuperLogData2(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwTMachineNumber,
      AtomicReference<java.lang.Integer> dwSEnrollNumber,
      AtomicReference<java.lang.Integer> Params4,
      AtomicReference<java.lang.Integer> Params1,
      AtomicReference<java.lang.Integer> Params2,
      AtomicReference<java.lang.Integer> dwManipulation,
      AtomicReference<java.lang.Integer> Params3,
      AtomicReference<java.lang.Integer> dwYear,
      AtomicReference<java.lang.Integer> dwMonth,
      AtomicReference<java.lang.Integer> dwDay,
      AtomicReference<java.lang.Integer> dwHour,
      AtomicReference<java.lang.Integer> dwMinute,
      AtomicReference<java.lang.Integer> dwSecs) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetSuperLogData2",
                  dwMachineNumber,
                  new NOut(
                      dwTMachineNumber,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwSEnrollNumber, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params4, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params1, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params2, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwManipulation, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params3, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwYear, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMonth, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwDay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwHour, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMinute, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwSecs, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserFace(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFaceIndex,
      AtomicReference<java.lang.Byte> TmpData,
      AtomicReference<java.lang.Integer> TmpLength) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserFace",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwFaceIndex,
                  new NOut(TmpData, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(TmpLength, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserFace(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFaceIndex,
      AtomicReference<java.lang.Byte> TmpData,
      java.lang.Integer TmpLength) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetUserFace",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwFaceIndex,
                  new NRef(TmpData),
                  TmpLength);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DelUserFace(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFaceIndex) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DelUserFace", dwMachineNumber, dwEnrollNumber, dwFaceIndex);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserFaceStr(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFaceIndex,
      AtomicReference<java.lang.String> TmpData,
      AtomicReference<java.lang.Integer> TmpLength) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserFaceStr",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwFaceIndex,
                  new NOut(TmpData, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(TmpLength, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserFaceStr(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFaceIndex,
      java.lang.String TmpData,
      java.lang.Integer TmpLength) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetUserFaceStr",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwFaceIndex,
                  TmpData,
                  TmpLength);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserTmpEx(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Integer> Flag,
      AtomicReference<java.lang.Byte> TmpData,
      AtomicReference<java.lang.Integer> TmpLength) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserTmpEx",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwFingerIndex,
                  new NOut(Flag, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(TmpData, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(TmpLength, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserTmpExStr(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Integer> Flag,
      AtomicReference<java.lang.String> TmpData,
      AtomicReference<java.lang.Integer> TmpLength) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserTmpExStr",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwFingerIndex,
                  new NOut(Flag, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(TmpData, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(TmpLength, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserTmpEx(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      java.lang.Integer Flag,
      AtomicReference<java.lang.Byte> TmpData) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetUserTmpEx",
                  dwMachineNumber,
                  dwEnrollNumber,
                  dwFingerIndex,
                  Flag,
                  new NRef(TmpData));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserTmpExStr(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      java.lang.Integer Flag,
      java.lang.String TmpData) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetUserTmpExStr", dwMachineNumber, dwEnrollNumber, dwFingerIndex, Flag, TmpData);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean MergeTemplate(
      IntPtr Templates,
      java.lang.Integer FingerCount,
      AtomicReference<java.lang.Byte> TemplateDest,
      AtomicReference<java.lang.Integer> FingerSize) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "MergeTemplate",
                  Templates,
                  FingerCount,
                  new NOut(TemplateDest, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(
                      FingerSize, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SplitTemplate(
      AtomicReference<java.lang.Byte> Template,
      IntPtr Templates,
      AtomicReference<java.lang.Integer> FingerCount,
      AtomicReference<java.lang.Integer> FingerSize) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SplitTemplate",
                  new NRef(Template),
                  Templates,
                  new NOut(
                      FingerCount, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      FingerSize, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadUserAllTemplate(
      java.lang.Integer dwMachineNumber, java.lang.String dwEnrollNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadUserAllTemplate", dwMachineNumber, dwEnrollNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UpdateFile(java.lang.String FileName) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("UpdateFile", FileName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadLastestLogData(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer NewLog,
      java.lang.Integer dwYear,
      java.lang.Integer dwMonth,
      java.lang.Integer dwDay,
      java.lang.Integer dwHour,
      java.lang.Integer dwMinute,
      java.lang.Integer dwSecond) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "ReadLastestLogData",
                  dwMachineNumber,
                  NewLog,
                  dwYear,
                  dwMonth,
                  dwDay,
                  dwHour,
                  dwMinute,
                  dwSecond);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetOptionCommPwd(
      java.lang.Integer dwMachineNumber, java.lang.String CommKey) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetOptionCommPwd", dwMachineNumber, CommKey);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadSuperLogDataEx(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwYear_S,
      java.lang.Integer dwMonth_S,
      java.lang.Integer dwDay_S,
      java.lang.Integer dwHour_S,
      java.lang.Integer dwMinute_S,
      java.lang.Integer dwSecond_S,
      java.lang.Integer dwYear_E,
      java.lang.Integer dwMonth_E,
      java.lang.Integer dwDay_E,
      java.lang.Integer dwHour_E,
      java.lang.Integer dwMinute_E,
      java.lang.Integer dwSecond_E,
      java.lang.Integer dwLogIndex) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "ReadSuperLogDataEx",
                  dwMachineNumber,
                  dwYear_S,
                  dwMonth_S,
                  dwDay_S,
                  dwHour_S,
                  dwMinute_S,
                  dwSecond_S,
                  dwYear_E,
                  dwMonth_E,
                  dwDay_E,
                  dwHour_E,
                  dwMinute_E,
                  dwSecond_E,
                  dwLogIndex);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetSuperLogDataEx(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> EnrollNumber,
      AtomicReference<java.lang.Integer> Params4,
      AtomicReference<java.lang.Integer> Params1,
      AtomicReference<java.lang.Integer> Params2,
      AtomicReference<java.lang.Integer> dwManipulation,
      AtomicReference<java.lang.Integer> Params3,
      AtomicReference<java.lang.Integer> dwYear,
      AtomicReference<java.lang.Integer> dwMonth,
      AtomicReference<java.lang.Integer> dwDay,
      AtomicReference<java.lang.Integer> dwHour,
      AtomicReference<java.lang.Integer> dwMinute,
      AtomicReference<java.lang.Integer> dwSecond) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetSuperLogDataEx",
                  dwMachineNumber,
                  new NOut(
                      EnrollNumber, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Params4, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params1, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params2, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwManipulation, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Params3, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwYear, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMonth, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwDay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwHour, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMinute, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwSecond, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetPhotoByName(
      java.lang.Integer dwMachineNumber,
      java.lang.String PhotoName,
      AtomicReference<java.lang.Byte> PhotoData,
      AtomicReference<java.lang.Integer> PhotoLength) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetPhotoByName",
                  dwMachineNumber,
                  PhotoName,
                  new NOut(PhotoData, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(
                      PhotoLength, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetPhotoNamesByTime(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer iFlag,
      java.lang.String sTime,
      java.lang.String eTime,
      AtomicReference<java.lang.String> AllPhotoName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetPhotoNamesByTime",
                  dwMachineNumber,
                  iFlag,
                  sTime,
                  eTime,
                  new NOut(
                      AllPhotoName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearPhotoByTime(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer iFlag,
      java.lang.String sTime,
      java.lang.String eTime) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ClearPhotoByTime", dwMachineNumber, iFlag, sTime, eTime);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetPhotoCount(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> count,
      java.lang.Integer iFlag) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetPhotoCount",
                  dwMachineNumber,
                  new NOut(count, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  iFlag);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearDataEx(
      java.lang.Integer dwMachineNumber, java.lang.String TableName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ClearDataEx", dwMachineNumber, TableName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDataFileEx(
      java.lang.Integer dwMachineNumber,
      java.lang.String SourceFileName,
      java.lang.String DestFileName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("GetDataFileEx", dwMachineNumber, SourceFileName, DestFileName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetDeviceData(
      java.lang.Integer dwMachineNumber,
      java.lang.String TableName,
      java.lang.String Datas,
      java.lang.String Options) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_SetDeviceData", dwMachineNumber, TableName, Datas, Options);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetDeviceData(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> Buffer,
      java.lang.Integer BufferSize,
      java.lang.String TableName,
      java.lang.String FiledNames,
      java.lang.String Filter,
      java.lang.String Options) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetDeviceData",
                  dwMachineNumber,
                  new NOut(Buffer, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  BufferSize,
                  TableName,
                  FiledNames,
                  Filter,
                  Options);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UpdateLogo(
      java.lang.Integer dwMachineNumber, java.lang.String FileName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("UpdateLogo", dwMachineNumber, FileName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetCommuTimeOut(java.lang.Integer timeOut) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("SetCommuTimeOut", timeOut);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SendFileByType(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.Integer iType) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SendFileByType", dwMachineNumber, FileName, iType);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetCommProType(java.lang.Integer proType) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("SetCommProType", proType);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetCompatOldFirmware(java.lang.Integer nCompatOkdFirmware) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetCompatOldFirmware", nCompatOkdFirmware);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Connect_P4P(java.lang.String uid) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("Connect_P4P", uid);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceTableData(
      java.lang.Integer dwMachineNumber,
      java.lang.String TableName,
      java.lang.String Datas,
      java.lang.String Options,
      AtomicReference<java.lang.Integer> count) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetDeviceTableData",
                  dwMachineNumber,
                  TableName,
                  Datas,
                  Options,
                  new NOut(count, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetConnectStatus(AtomicReference<java.lang.Integer> dwErrorCode) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper.IZKEM")
          .invoke(
              "GetConnectStatus",
              new NOut(dwErrorCode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetManufacturerData(
      java.lang.Integer dwMachineNumber, java.lang.String Name, java.lang.String Value) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetManufacturerData", dwMachineNumber, Name, Value);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetDeviceStatusEx(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("GetDeviceStatusEx", dwMachineNumber);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CancelByUser() {
    try {
      javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("CancelByUser");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SSR_GetDeviceDataCount(
      java.lang.String TableName, java.lang.String Filter, java.lang.String Options) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_GetDeviceDataCount", TableName, Filter, Options);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DeleteDeviceData(
      java.lang.Integer dwMachineNumber,
      java.lang.String TableName,
      java.lang.String Datas,
      java.lang.String Options) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_DeleteDeviceData", dwMachineNumber, TableName, Datas, Options);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadTimeGLogData(
      java.lang.Integer dwMachineNumber, java.lang.String sTime, java.lang.String eTime) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadTimeGLogData", dwMachineNumber, sTime, eTime);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteAttlogBetweenTheDate(
      java.lang.Integer dwMachineNumber, java.lang.String sTime, java.lang.String eTime) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DeleteAttlogBetweenTheDate", dwMachineNumber, sTime, eTime);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteAttlogByTime(
      java.lang.Integer dwMachineNumber, java.lang.String sTime) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DeleteAttlogByTime", dwMachineNumber, sTime);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadNewGLogData(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadNewGLogData", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsNewFirmwareMachine(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("IsNewFirmwareMachine", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UploadUserPhoto(
      java.lang.Integer dwMachineNumber, java.lang.String FileName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("UploadUserPhoto", dwMachineNumber, FileName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DownloadUserPhoto(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.String FilePath) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DownloadUserPhoto", dwMachineNumber, FileName, FilePath);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteUserPhoto(
      java.lang.Integer dwMachineNumber, java.lang.String FileName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DeleteUserPhoto", dwMachineNumber, FileName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllUserPhoto(
      java.lang.Integer dwMachineNumber, java.lang.String dlDir) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("GetAllUserPhoto", dwMachineNumber, dlDir);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetBellSchDataEx(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer weekDay,
      java.lang.Integer Index,
      java.lang.Integer Enable,
      java.lang.Integer Hour,
      java.lang.Integer min,
      java.lang.Integer voice,
      java.lang.Integer way,
      java.lang.Integer InerBellDelay,
      java.lang.Integer ExtBellDelay) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetBellSchDataEx",
                  dwMachineNumber,
                  weekDay,
                  Index,
                  Enable,
                  Hour,
                  min,
                  voice,
                  way,
                  InerBellDelay,
                  ExtBellDelay);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetBellSchDataEx(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer weekDay,
      java.lang.Integer Index,
      AtomicReference<java.lang.Integer> Enable,
      AtomicReference<java.lang.Integer> Hour,
      AtomicReference<java.lang.Integer> min,
      AtomicReference<java.lang.Integer> voice,
      AtomicReference<java.lang.Integer> way,
      AtomicReference<java.lang.Integer> InerBellDelay,
      AtomicReference<java.lang.Integer> ExtBellDelay) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetBellSchDataEx",
                  dwMachineNumber,
                  weekDay,
                  Index,
                  new NOut(Enable, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Hour, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(min, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(voice, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(way, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      InerBellDelay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      ExtBellDelay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDayBellSchCount(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.Integer> DayBellCnt) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetDayBellSchCount",
                  dwMachineNumber,
                  new NOut(
                      DayBellCnt, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetMaxBellIDInBellSchData(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.Integer> MaxBellID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetMaxBellIDInBellSchData",
                  dwMachineNumber,
                  new NOut(MaxBellID, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAllBellSchData(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("ReadAllBellSchData", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetEachBellInfo(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> weekDay,
      AtomicReference<java.lang.Integer> Index,
      AtomicReference<java.lang.Integer> Enable,
      AtomicReference<java.lang.Integer> Hour,
      AtomicReference<java.lang.Integer> min,
      AtomicReference<java.lang.Integer> voice,
      AtomicReference<java.lang.Integer> way,
      AtomicReference<java.lang.Integer> InerBellDelay,
      AtomicReference<java.lang.Integer> ExtBellDelay) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetEachBellInfo",
                  dwMachineNumber,
                  new NOut(weekDay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Index, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Enable, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Hour, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(min, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(voice, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(way, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      InerBellDelay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      ExtBellDelay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserValidDate(
      java.lang.Integer dwMachineNumber,
      java.lang.String UserID,
      java.lang.Integer Expires,
      java.lang.Integer ValidCount,
      java.lang.String StartDate,
      java.lang.String EndDate) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetUserValidDate",
                  dwMachineNumber,
                  UserID,
                  Expires,
                  ValidCount,
                  StartDate,
                  EndDate);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserValidDate(
      java.lang.Integer dwMachineNumber,
      java.lang.String UserID,
      AtomicReference<java.lang.Integer> Expires,
      AtomicReference<java.lang.Integer> ValidCount,
      AtomicReference<java.lang.String> StartDate,
      AtomicReference<java.lang.String> EndDate) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserValidDate",
                  dwMachineNumber,
                  UserID,
                  new NOut(Expires, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(ValidCount, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(StartDate, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(EndDate, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserValidDateBatch(
      java.lang.Integer dwMachineNumber, java.lang.String Datas) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetUserValidDateBatch", dwMachineNumber, Datas);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserValidDateBatch(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> Buffer,
      java.lang.Integer BufferSize) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserValidDateBatch",
                  dwMachineNumber,
                  new NOut(Buffer, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  BufferSize);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserVerifyStyle(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer VerifyStyle,
      AtomicReference<java.lang.Byte> Reserved) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetUserVerifyStyle",
                  dwMachineNumber,
                  dwEnrollNumber,
                  VerifyStyle,
                  new NRef(Reserved));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserVerifyStyle(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      AtomicReference<java.lang.Integer> VerifyStyle,
      AtomicReference<java.lang.Byte> Reserved) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserVerifyStyle",
                  dwMachineNumber,
                  dwEnrollNumber,
                  new NOut(
                      VerifyStyle, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Reserved, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserVerifyStyleBatch(
      java.lang.Integer dwMachineNumber,
      java.lang.String Datas,
      AtomicReference<java.lang.Byte> Reserved) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetUserVerifyStyleBatch", dwMachineNumber, Datas, new NRef(Reserved));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserVerifyStyleBatch(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> Buffer,
      java.lang.Integer BufferSize,
      AtomicReference<java.lang.Byte> Reserved) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserVerifyStyleBatch",
                  dwMachineNumber,
                  new NOut(Buffer, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  BufferSize,
                  new NOut(Reserved, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceFirmwareVersion(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> strVersion) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetDeviceFirmwareVersion",
                  dwMachineNumber,
                  new NOut(strVersion, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SendFileEx(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.String FilePath) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SendFileEx", dwMachineNumber, FileName, FilePath);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UploadTheme(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.String InDevName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("UploadTheme", dwMachineNumber, FileName, InDevName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UploadPicture(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.String InDevName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("UploadPicture", dwMachineNumber, FileName, InDevName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeletePicture(
      java.lang.Integer dwMachineNumber, java.lang.String FileName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DeletePicture", dwMachineNumber, FileName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DownloadPicture(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.String FilePath) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DownloadPicture", dwMachineNumber, FileName, FilePath);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean TurnOffAlarm(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("TurnOffAlarm", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean CloseAlarm(java.lang.Integer dwMachineNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("CloseAlarm", dwMachineNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetWorkCodeEx(
      java.lang.Integer dwMachineNumber, java.lang.String WorkCodeNum, java.lang.String Name) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_SetWorkCodeEx", dwMachineNumber, WorkCodeNum, Name);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetWorkCodeEx(
      java.lang.Integer dwMachineNumber,
      java.lang.String WorkCodeNum,
      AtomicReference<java.lang.String> Name) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetWorkCodeEx",
                  dwMachineNumber,
                  WorkCodeNum,
                  new NOut(Name, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DeleteWorkCodeEx(
      java.lang.Integer dwMachineNumber, java.lang.String WorkCodeNum) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_DeleteWorkCodeEx", dwMachineNumber, WorkCodeNum);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetGeneralLogDataEx(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> dwEnrollNumber,
      AtomicReference<java.lang.Integer> dwVerifyMode,
      AtomicReference<java.lang.Integer> dwInOutMode,
      AtomicReference<java.lang.Integer> dwYear,
      AtomicReference<java.lang.Integer> dwMonth,
      AtomicReference<java.lang.Integer> dwDay,
      AtomicReference<java.lang.Integer> dwHour,
      AtomicReference<java.lang.Integer> dwMinute,
      AtomicReference<java.lang.Integer> dwSecond,
      AtomicReference<java.lang.String> dwWorkCode) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetGeneralLogDataEx",
                  dwMachineNumber,
                  new NOut(
                      dwEnrollNumber, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(
                      dwVerifyMode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      dwInOutMode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwYear, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMonth, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwDay, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwHour, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwMinute, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwSecond, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(dwWorkCode, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetWorkCodeExBatch(
      java.lang.Integer dwMachineNumber, java.lang.String Datas) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SSR_SetWorkCodeExBatch", dwMachineNumber, Datas);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetWorkCodeExBatch(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> Buffer,
      java.lang.Integer BufferSize) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetWorkCodeExBatch",
                  dwMachineNumber,
                  new NOut(Buffer, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  BufferSize);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetWorkCodeExByID(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer WorkCodeID,
      AtomicReference<java.lang.String> WorkCodeNum,
      AtomicReference<java.lang.String> Name) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetWorkCodeExByID",
                  dwMachineNumber,
                  WorkCodeID,
                  new NOut(WorkCodeNum, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Name, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetWorkCodeIDByName(
      java.lang.Integer dwMachineNumber,
      java.lang.String workcodeName,
      AtomicReference<java.lang.Integer> WorkCodeID) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SSR_GetWorkCodeIDByName",
                  dwMachineNumber,
                  workcodeName,
                  new NOut(
                      WorkCodeID, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetEventMode(java.lang.Integer nType) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("zkemkeeper.IZKEM").invoke("SetEventMode", nType);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllSFIDName(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> ShortkeyIDName,
      java.lang.Integer BufferSize1,
      AtomicReference<java.lang.String> FunctionIDName,
      java.lang.Integer BufferSize2) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetAllSFIDName",
                  dwMachineNumber,
                  new NOut(
                      ShortkeyIDName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  BufferSize1,
                  new NOut(
                      FunctionIDName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  BufferSize2);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetShortkey(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer ShortKeyID,
      java.lang.String ShortKeyName,
      java.lang.String FunctionName,
      java.lang.Integer ShortKeyFun,
      java.lang.Integer StateCode,
      java.lang.String StateName,
      java.lang.String Description,
      java.lang.Integer StateAutoChange,
      java.lang.String StateAutoChangeTime) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetShortkey",
                  dwMachineNumber,
                  ShortKeyID,
                  ShortKeyName,
                  FunctionName,
                  ShortKeyFun,
                  StateCode,
                  StateName,
                  Description,
                  StateAutoChange,
                  StateAutoChangeTime);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetShortkey(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer ShortKeyID,
      AtomicReference<java.lang.String> ShortKeyName,
      AtomicReference<java.lang.String> FunctionName,
      AtomicReference<java.lang.Integer> ShortKeyFun,
      AtomicReference<java.lang.Integer> StateCode,
      AtomicReference<java.lang.String> StateName,
      AtomicReference<java.lang.String> Description,
      AtomicReference<java.lang.Integer> AutoChange,
      AtomicReference<java.lang.String> AutoChangeTime) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetShortkey",
                  dwMachineNumber,
                  ShortKeyID,
                  new NOut(
                      ShortKeyName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(
                      FunctionName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(
                      ShortKeyFun, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(StateCode, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(StateName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(Description, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(AutoChange, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      AutoChangeTime, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllAppFun(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> AppName,
      AtomicReference<java.lang.String> FunofAppName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetAllAppFun",
                  dwMachineNumber,
                  new NOut(AppName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  new NOut(
                      FunofAppName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllRole(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> RoleName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetAllRole",
                  dwMachineNumber,
                  new NOut(RoleName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAppOfRole(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer Permission,
      AtomicReference<java.lang.String> AppName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetAppOfRole",
                  dwMachineNumber,
                  Permission,
                  new NOut(AppName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetFunOfRole(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer Permission,
      AtomicReference<java.lang.String> FunName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetFunOfRole",
                  dwMachineNumber,
                  Permission,
                  new NOut(FunName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetPermOfAppFun(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer Permission,
      java.lang.String AppName,
      java.lang.String FunName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("SetPermOfAppFun", dwMachineNumber, Permission, AppName, FunName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeletePermOfAppFun(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer Permission,
      java.lang.String AppName,
      java.lang.String FunName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DeletePermOfAppFun", dwMachineNumber, Permission, AppName, FunName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsUserDefRoleEnable(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer Permission,
      AtomicReference<java.lang.Boolean> Enable) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "IsUserDefRoleEnable",
                  dwMachineNumber,
                  Permission,
                  new NOut(Enable, JavonetHelper.JavaToDotnetType.get(java.lang.Boolean.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SearchDevice(
      java.lang.String commType,
      java.lang.String address,
      AtomicReference<java.lang.String> DevBuffer,
      java.lang.Integer DevBufferSize) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SearchDevice",
                  commType,
                  address,
                  new NOut(DevBuffer, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
                  DevBufferSize);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserIDCardInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.String strEnrollNumber,
      AtomicReference<java.lang.Byte> IDCardData,
      java.lang.Integer DataLen) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "SetUserIDCardInfo",
                  dwMachineNumber,
                  strEnrollNumber,
                  new NRef(IDCardData),
                  DataLen);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserIDCardInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.String strEnrollNumber,
      AtomicReference<java.lang.Byte> IDCardData,
      AtomicReference<java.lang.Integer> DataLen) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke(
                  "GetUserIDCardInfo",
                  dwMachineNumber,
                  strEnrollNumber,
                  new NOut(IDCardData, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(DataLen, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DelUserIDCardInfo(
      java.lang.Integer dwMachineNumber, java.lang.String strEnrollNumber) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("DelUserIDCardInfo", dwMachineNumber, strEnrollNumber);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetPhotoByNameToFile(
      java.lang.Integer dwMachineNumber,
      java.lang.String PhotoName,
      java.lang.String LocalFileName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("zkemkeeper.IZKEM")
              .invoke("GetPhotoByNameToFile", dwMachineNumber, PhotoName, LocalFileName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnAttTransaction(_IZKEMEvents_OnAttTransactionEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnAttTransaction", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAttTransaction(_IZKEMEvents_OnAttTransactionEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnAttTransaction", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnKeyPress(_IZKEMEvents_OnKeyPressEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnKeyPress", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnKeyPress(_IZKEMEvents_OnKeyPressEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnKeyPress", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnEnrollFinger(_IZKEMEvents_OnEnrollFingerEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnEnrollFinger", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnEnrollFinger(_IZKEMEvents_OnEnrollFingerEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnEnrollFinger", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnNewUser(_IZKEMEvents_OnNewUserEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnNewUser", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnNewUser(_IZKEMEvents_OnNewUserEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnNewUser", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnEMData(_IZKEMEvents_OnEMDataEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnEMData", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnEMData(_IZKEMEvents_OnEMDataEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnEMData", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnConnected(_IZKEMEvents_OnConnectedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnConnected", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnConnected(_IZKEMEvents_OnConnectedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnConnected", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnDisConnected(_IZKEMEvents_OnDisConnectedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnDisConnected", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnDisConnected(_IZKEMEvents_OnDisConnectedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnDisConnected", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnFinger(_IZKEMEvents_OnFingerEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnFinger", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnFinger(_IZKEMEvents_OnFingerEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnFinger", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnVerify(_IZKEMEvents_OnVerifyEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnVerify", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnVerify(_IZKEMEvents_OnVerifyEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnVerify", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnFingerFeature(_IZKEMEvents_OnFingerFeatureEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnFingerFeature", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnFingerFeature(_IZKEMEvents_OnFingerFeatureEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnFingerFeature", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnHIDNum(_IZKEMEvents_OnHIDNumEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnHIDNum", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnHIDNum(_IZKEMEvents_OnHIDNumEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnHIDNum", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnDoor(_IZKEMEvents_OnDoorEventHandler param0) {
    try {
      javonetHandle.explicitInterface("zkemkeeper._IZKEMEvents_Event").invoke("add_OnDoor", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnDoor(_IZKEMEvents_OnDoorEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnDoor", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnAlarm(_IZKEMEvents_OnAlarmEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnAlarm", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAlarm(_IZKEMEvents_OnAlarmEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnAlarm", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnWriteCard(_IZKEMEvents_OnWriteCardEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnWriteCard", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnWriteCard(_IZKEMEvents_OnWriteCardEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnWriteCard", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnEmptyCard(_IZKEMEvents_OnEmptyCardEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnEmptyCard", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnEmptyCard(_IZKEMEvents_OnEmptyCardEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnEmptyCard", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnDeleteTemplate(_IZKEMEvents_OnDeleteTemplateEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnDeleteTemplate", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnDeleteTemplate(_IZKEMEvents_OnDeleteTemplateEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnDeleteTemplate", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnAttTransactionEx(_IZKEMEvents_OnAttTransactionExEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnAttTransactionEx", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAttTransactionEx(_IZKEMEvents_OnAttTransactionExEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnAttTransactionEx", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnEnrollFingerEx(_IZKEMEvents_OnEnrollFingerExEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnEnrollFingerEx", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnEnrollFingerEx(_IZKEMEvents_OnEnrollFingerExEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnEnrollFingerEx", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnGeneralEvent(_IZKEMEvents_OnGeneralEventEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnGeneralEvent", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnGeneralEvent(_IZKEMEvents_OnGeneralEventEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnGeneralEvent", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnAttTransactionEx_New(_IZKEMEvents_OnAttTransactionEx_NewEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("add_OnAttTransactionEx_New", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAttTransactionEx_New(
      _IZKEMEvents_OnAttTransactionEx_NewEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("zkemkeeper._IZKEMEvents_Event")
          .invoke("remove_OnAttTransactionEx_New", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnAttTransactionEventHandler>
      _OnAttTransactionListeners =
          new java.util.ArrayList<_IZKEMEvents_OnAttTransactionEventHandler>();

  public void addOnAttTransaction(_IZKEMEvents_OnAttTransactionEventHandler toAdd) {
    _OnAttTransactionListeners.add(toAdd);
  }

  public void removeOnAttTransaction(_IZKEMEvents_OnAttTransactionEventHandler toRemove) {
    _OnAttTransactionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnKeyPressEventHandler> _OnKeyPressListeners =
      new java.util.ArrayList<_IZKEMEvents_OnKeyPressEventHandler>();

  public void addOnKeyPress(_IZKEMEvents_OnKeyPressEventHandler toAdd) {
    _OnKeyPressListeners.add(toAdd);
  }

  public void removeOnKeyPress(_IZKEMEvents_OnKeyPressEventHandler toRemove) {
    _OnKeyPressListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnEnrollFingerEventHandler> _OnEnrollFingerListeners =
      new java.util.ArrayList<_IZKEMEvents_OnEnrollFingerEventHandler>();

  public void addOnEnrollFinger(_IZKEMEvents_OnEnrollFingerEventHandler toAdd) {
    _OnEnrollFingerListeners.add(toAdd);
  }

  public void removeOnEnrollFinger(_IZKEMEvents_OnEnrollFingerEventHandler toRemove) {
    _OnEnrollFingerListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnNewUserEventHandler> _OnNewUserListeners =
      new java.util.ArrayList<_IZKEMEvents_OnNewUserEventHandler>();

  public void addOnNewUser(_IZKEMEvents_OnNewUserEventHandler toAdd) {
    _OnNewUserListeners.add(toAdd);
  }

  public void removeOnNewUser(_IZKEMEvents_OnNewUserEventHandler toRemove) {
    _OnNewUserListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnEMDataEventHandler> _OnEMDataListeners =
      new java.util.ArrayList<_IZKEMEvents_OnEMDataEventHandler>();

  public void addOnEMData(_IZKEMEvents_OnEMDataEventHandler toAdd) {
    _OnEMDataListeners.add(toAdd);
  }

  public void removeOnEMData(_IZKEMEvents_OnEMDataEventHandler toRemove) {
    _OnEMDataListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnConnectedEventHandler> _OnConnectedListeners =
      new java.util.ArrayList<_IZKEMEvents_OnConnectedEventHandler>();

  public void addOnConnected(_IZKEMEvents_OnConnectedEventHandler toAdd) {
    _OnConnectedListeners.add(toAdd);
  }

  public void removeOnConnected(_IZKEMEvents_OnConnectedEventHandler toRemove) {
    _OnConnectedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnDisConnectedEventHandler> _OnDisConnectedListeners =
      new java.util.ArrayList<_IZKEMEvents_OnDisConnectedEventHandler>();

  public void addOnDisConnected(_IZKEMEvents_OnDisConnectedEventHandler toAdd) {
    _OnDisConnectedListeners.add(toAdd);
  }

  public void removeOnDisConnected(_IZKEMEvents_OnDisConnectedEventHandler toRemove) {
    _OnDisConnectedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnFingerEventHandler> _OnFingerListeners =
      new java.util.ArrayList<_IZKEMEvents_OnFingerEventHandler>();

  public void addOnFinger(_IZKEMEvents_OnFingerEventHandler toAdd) {
    _OnFingerListeners.add(toAdd);
  }

  public void removeOnFinger(_IZKEMEvents_OnFingerEventHandler toRemove) {
    _OnFingerListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnVerifyEventHandler> _OnVerifyListeners =
      new java.util.ArrayList<_IZKEMEvents_OnVerifyEventHandler>();

  public void addOnVerify(_IZKEMEvents_OnVerifyEventHandler toAdd) {
    _OnVerifyListeners.add(toAdd);
  }

  public void removeOnVerify(_IZKEMEvents_OnVerifyEventHandler toRemove) {
    _OnVerifyListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnFingerFeatureEventHandler> _OnFingerFeatureListeners =
      new java.util.ArrayList<_IZKEMEvents_OnFingerFeatureEventHandler>();

  public void addOnFingerFeature(_IZKEMEvents_OnFingerFeatureEventHandler toAdd) {
    _OnFingerFeatureListeners.add(toAdd);
  }

  public void removeOnFingerFeature(_IZKEMEvents_OnFingerFeatureEventHandler toRemove) {
    _OnFingerFeatureListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnHIDNumEventHandler> _OnHIDNumListeners =
      new java.util.ArrayList<_IZKEMEvents_OnHIDNumEventHandler>();

  public void addOnHIDNum(_IZKEMEvents_OnHIDNumEventHandler toAdd) {
    _OnHIDNumListeners.add(toAdd);
  }

  public void removeOnHIDNum(_IZKEMEvents_OnHIDNumEventHandler toRemove) {
    _OnHIDNumListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnDoorEventHandler> _OnDoorListeners =
      new java.util.ArrayList<_IZKEMEvents_OnDoorEventHandler>();

  public void addOnDoor(_IZKEMEvents_OnDoorEventHandler toAdd) {
    _OnDoorListeners.add(toAdd);
  }

  public void removeOnDoor(_IZKEMEvents_OnDoorEventHandler toRemove) {
    _OnDoorListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnAlarmEventHandler> _OnAlarmListeners =
      new java.util.ArrayList<_IZKEMEvents_OnAlarmEventHandler>();

  public void addOnAlarm(_IZKEMEvents_OnAlarmEventHandler toAdd) {
    _OnAlarmListeners.add(toAdd);
  }

  public void removeOnAlarm(_IZKEMEvents_OnAlarmEventHandler toRemove) {
    _OnAlarmListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnWriteCardEventHandler> _OnWriteCardListeners =
      new java.util.ArrayList<_IZKEMEvents_OnWriteCardEventHandler>();

  public void addOnWriteCard(_IZKEMEvents_OnWriteCardEventHandler toAdd) {
    _OnWriteCardListeners.add(toAdd);
  }

  public void removeOnWriteCard(_IZKEMEvents_OnWriteCardEventHandler toRemove) {
    _OnWriteCardListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnEmptyCardEventHandler> _OnEmptyCardListeners =
      new java.util.ArrayList<_IZKEMEvents_OnEmptyCardEventHandler>();

  public void addOnEmptyCard(_IZKEMEvents_OnEmptyCardEventHandler toAdd) {
    _OnEmptyCardListeners.add(toAdd);
  }

  public void removeOnEmptyCard(_IZKEMEvents_OnEmptyCardEventHandler toRemove) {
    _OnEmptyCardListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnDeleteTemplateEventHandler>
      _OnDeleteTemplateListeners =
          new java.util.ArrayList<_IZKEMEvents_OnDeleteTemplateEventHandler>();

  public void addOnDeleteTemplate(_IZKEMEvents_OnDeleteTemplateEventHandler toAdd) {
    _OnDeleteTemplateListeners.add(toAdd);
  }

  public void removeOnDeleteTemplate(_IZKEMEvents_OnDeleteTemplateEventHandler toRemove) {
    _OnDeleteTemplateListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnAttTransactionExEventHandler>
      _OnAttTransactionExListeners =
          new java.util.ArrayList<_IZKEMEvents_OnAttTransactionExEventHandler>();

  public void addOnAttTransactionEx(_IZKEMEvents_OnAttTransactionExEventHandler toAdd) {
    _OnAttTransactionExListeners.add(toAdd);
  }

  public void removeOnAttTransactionEx(_IZKEMEvents_OnAttTransactionExEventHandler toRemove) {
    _OnAttTransactionExListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnEnrollFingerExEventHandler>
      _OnEnrollFingerExListeners =
          new java.util.ArrayList<_IZKEMEvents_OnEnrollFingerExEventHandler>();

  public void addOnEnrollFingerEx(_IZKEMEvents_OnEnrollFingerExEventHandler toAdd) {
    _OnEnrollFingerExListeners.add(toAdd);
  }

  public void removeOnEnrollFingerEx(_IZKEMEvents_OnEnrollFingerExEventHandler toRemove) {
    _OnEnrollFingerExListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnGeneralEventEventHandler> _OnGeneralEventListeners =
      new java.util.ArrayList<_IZKEMEvents_OnGeneralEventEventHandler>();

  public void addOnGeneralEvent(_IZKEMEvents_OnGeneralEventEventHandler toAdd) {
    _OnGeneralEventListeners.add(toAdd);
  }

  public void removeOnGeneralEvent(_IZKEMEvents_OnGeneralEventEventHandler toRemove) {
    _OnGeneralEventListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IZKEMEvents_OnAttTransactionEx_NewEventHandler>
      _OnAttTransactionEx_NewListeners =
          new java.util.ArrayList<_IZKEMEvents_OnAttTransactionEx_NewEventHandler>();

  public void addOnAttTransactionEx_New(_IZKEMEvents_OnAttTransactionEx_NewEventHandler toAdd) {
    _OnAttTransactionEx_NewListeners.add(toAdd);
  }

  public void removeOnAttTransactionEx_New(
      _IZKEMEvents_OnAttTransactionEx_NewEventHandler toRemove) {
    _OnAttTransactionEx_NewListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
