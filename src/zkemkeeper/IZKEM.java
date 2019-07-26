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
import jio.System.*;

public interface IZKEM {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void CancelByUser();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SSR_GetDeviceDataCount(
      java.lang.String TableName, java.lang.String Filter, java.lang.String Options);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DeleteDeviceData(
      java.lang.Integer dwMachineNumber,
      java.lang.String TableName,
      java.lang.String Datas,
      java.lang.String Options);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadTimeGLogData(
      java.lang.Integer dwMachineNumber, java.lang.String sTime, java.lang.String eTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteAttlogBetweenTheDate(
      java.lang.Integer dwMachineNumber, java.lang.String sTime, java.lang.String eTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteAttlogByTime(
      java.lang.Integer dwMachineNumber, java.lang.String sTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadNewGLogData(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsNewFirmwareMachine(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UploadUserPhoto(
      java.lang.Integer dwMachineNumber, java.lang.String FileName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DownloadUserPhoto(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.String FilePath);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteUserPhoto(
      java.lang.Integer dwMachineNumber, java.lang.String FileName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllUserPhoto(
      java.lang.Integer dwMachineNumber, java.lang.String dlDir);
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
      java.lang.Integer ExtBellDelay);
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
      AtomicReference<java.lang.Integer> ExtBellDelay);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDayBellSchCount(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.Integer> DayBellCnt);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetMaxBellIDInBellSchData(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.Integer> MaxBellID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAllBellSchData(java.lang.Integer dwMachineNumber);
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
      AtomicReference<java.lang.Integer> ExtBellDelay);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserValidDate(
      java.lang.Integer dwMachineNumber,
      java.lang.String UserID,
      java.lang.Integer Expires,
      java.lang.Integer ValidCount,
      java.lang.String StartDate,
      java.lang.String EndDate);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserValidDate(
      java.lang.Integer dwMachineNumber,
      java.lang.String UserID,
      AtomicReference<java.lang.Integer> Expires,
      AtomicReference<java.lang.Integer> ValidCount,
      AtomicReference<java.lang.String> StartDate,
      AtomicReference<java.lang.String> EndDate);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserValidDateBatch(
      java.lang.Integer dwMachineNumber, java.lang.String Datas);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserValidDateBatch(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> Buffer,
      java.lang.Integer BufferSize);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserVerifyStyle(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer VerifyStyle,
      AtomicReference<java.lang.Byte> Reserved);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserVerifyStyle(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      AtomicReference<java.lang.Integer> VerifyStyle,
      AtomicReference<java.lang.Byte> Reserved);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserVerifyStyleBatch(
      java.lang.Integer dwMachineNumber,
      java.lang.String Datas,
      AtomicReference<java.lang.Byte> Reserved);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserVerifyStyleBatch(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> Buffer,
      java.lang.Integer BufferSize,
      AtomicReference<java.lang.Byte> Reserved);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceFirmwareVersion(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> strVersion);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SendFileEx(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.String FilePath);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UploadTheme(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.String InDevName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UploadPicture(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.String InDevName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeletePicture(
      java.lang.Integer dwMachineNumber, java.lang.String FileName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DownloadPicture(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.String FilePath);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean TurnOffAlarm(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean CloseAlarm(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetWorkCodeEx(
      java.lang.Integer dwMachineNumber, java.lang.String WorkCodeNum, java.lang.String Name);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetWorkCodeEx(
      java.lang.Integer dwMachineNumber,
      java.lang.String WorkCodeNum,
      AtomicReference<java.lang.String> Name);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DeleteWorkCodeEx(
      java.lang.Integer dwMachineNumber, java.lang.String WorkCodeNum);
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
      AtomicReference<java.lang.String> dwWorkCode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetWorkCodeExBatch(
      java.lang.Integer dwMachineNumber, java.lang.String Datas);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetWorkCodeExBatch(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> Buffer,
      java.lang.Integer BufferSize);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetWorkCodeExByID(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer WorkCodeID,
      AtomicReference<java.lang.String> WorkCodeNum,
      AtomicReference<java.lang.String> Name);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetWorkCodeIDByName(
      java.lang.Integer dwMachineNumber,
      java.lang.String workcodeName,
      AtomicReference<java.lang.Integer> WorkCodeID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetEventMode(java.lang.Integer nType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllSFIDName(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> ShortkeyIDName,
      java.lang.Integer BufferSize1,
      AtomicReference<java.lang.String> FunctionIDName,
      java.lang.Integer BufferSize2);
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
      java.lang.String StateAutoChangeTime);
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
      AtomicReference<java.lang.String> AutoChangeTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllAppFun(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> AppName,
      AtomicReference<java.lang.String> FunofAppName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllRole(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> RoleName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAppOfRole(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer Permission,
      AtomicReference<java.lang.String> AppName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetFunOfRole(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer Permission,
      AtomicReference<java.lang.String> FunName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetPermOfAppFun(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer Permission,
      java.lang.String AppName,
      java.lang.String FunName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeletePermOfAppFun(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer Permission,
      java.lang.String AppName,
      java.lang.String FunName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsUserDefRoleEnable(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer Permission,
      AtomicReference<java.lang.Boolean> Enable);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SearchDevice(
      java.lang.String commType,
      java.lang.String address,
      AtomicReference<java.lang.String> DevBuffer,
      java.lang.Integer DevBufferSize);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserIDCardInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.String strEnrollNumber,
      AtomicReference<java.lang.Byte> IDCardData,
      java.lang.Integer DataLen);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserIDCardInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.String strEnrollNumber,
      AtomicReference<java.lang.Byte> IDCardData,
      AtomicReference<java.lang.Integer> DataLen);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DelUserIDCardInfo(
      java.lang.Integer dwMachineNumber, java.lang.String strEnrollNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetPhotoByNameToFile(
      java.lang.Integer dwMachineNumber,
      java.lang.String PhotoName,
      java.lang.String LocalFileName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceCommPwd(
      java.lang.Integer dwMachineNumber, java.lang.Integer CommKey);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDoorState(
      java.lang.Integer MachineNumber, AtomicReference<java.lang.Integer> State);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetVendor(AtomicReference<java.lang.String> strVendor);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetSensorSN(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> SensorSN);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadCustData(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> CustData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean WriteCustData(
      java.lang.Integer dwMachineNumber, java.lang.String CustData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean BeginBatchUpdate(
      java.lang.Integer dwMachineNumber, java.lang.Integer UpdateFlag);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean BatchUpdate(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearData(java.lang.Integer dwMachineNumber, java.lang.Integer DataFlag);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDataFile(
      java.lang.Integer dwMachineNumber, java.lang.Integer DataFlag, java.lang.String FileName);
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
      AtomicReference<java.lang.Byte> TmpData4);
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
      AtomicReference<java.lang.Integer> dwReserved);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EmptyCard(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceStrInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwInfo,
      AtomicReference<java.lang.String> Value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetSysOption(
      java.lang.Integer dwMachineNumber,
      java.lang.String Option,
      AtomicReference<java.lang.String> Value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserInfoEx(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer VerifyStyle,
      AtomicReference<java.lang.Byte> Reserved);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserInfoEx(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      AtomicReference<java.lang.Integer> VerifyStyle,
      AtomicReference<java.lang.Byte> Reserved);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteUserInfoEx(
      java.lang.Integer dwMachineNumber, java.lang.Integer dwEnrollNumber);
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
      AtomicReference<java.lang.Integer> dwWorkCode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetAllUserInfo(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> dwEnrollNumber,
      AtomicReference<java.lang.String> Name,
      AtomicReference<java.lang.String> Password,
      AtomicReference<java.lang.Integer> Privilege,
      AtomicReference<java.lang.Boolean> Enabled);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetUserInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      AtomicReference<java.lang.String> Name,
      AtomicReference<java.lang.String> Password,
      AtomicReference<java.lang.Integer> Privilege,
      AtomicReference<java.lang.Boolean> Enabled);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetUserTmp(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Byte> TmpData,
      AtomicReference<java.lang.Integer> TmpLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetUserTmpStr(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.String> TmpData,
      AtomicReference<java.lang.Integer> TmpLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DeleteEnrollData(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwBackupNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetUserInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.String Name,
      java.lang.String Password,
      java.lang.Integer Privilege,
      java.lang.Boolean Enabled);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetUserTmp(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Byte> TmpData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetUserTmpStr(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      java.lang.String TmpData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DelUserTmp(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetWorkCode(java.lang.Integer WorkCodeID, java.lang.Integer AWorkCode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetWorkCode(
      java.lang.Integer WorkCodeID, AtomicReference<java.lang.Integer> AWorkCode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteWorkCode(java.lang.Integer WorkCodeID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearWorkCode();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAttRule(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadDPTInfo(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SaveTheDataToFile(
      java.lang.Integer dwMachineNumber, java.lang.String TheFilePath, java.lang.Integer FileFlag);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadTurnInfo(java.lang.Integer dwMachineNumber);
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
      java.lang.String resv2);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAOptions(
      java.lang.String AOption, AtomicReference<java.lang.String> AValue);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadRTLog(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetRTLog(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetHIDEventCardNumAsStr(
      AtomicReference<java.lang.String> strHIDEventCardNum);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetStrCardNumber(AtomicReference<java.lang.String> ACardNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetStrCardNumber(java.lang.String ACardNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean RegEvent(java.lang.Integer dwMachineNumber, java.lang.Integer EventMask);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean CancelBatchUpdate(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetSysOption(
      java.lang.Integer dwMachineNumber, java.lang.String Option, java.lang.String Value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Connect_Modem(
      java.lang.Integer ComPort,
      java.lang.Integer MachineNumber,
      java.lang.Integer BaudRate,
      java.lang.String Telephone);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UseGroupTimeZone();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetHoliday(java.lang.Integer dwMachineNumber, java.lang.String Holiday);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetHoliday(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> Holiday);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDaylight(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer Support,
      java.lang.String BeginTime,
      java.lang.String EndTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDaylight(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> Support,
      AtomicReference<java.lang.String> BeginTime,
      AtomicReference<java.lang.String> EndTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetUnLockGroup(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer CombNo,
      java.lang.Integer Group1,
      java.lang.Integer Group2,
      java.lang.Integer Group3,
      java.lang.Integer Group4,
      java.lang.Integer Group5);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetUnLockGroup(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer CombNo,
      AtomicReference<java.lang.Integer> Group1,
      AtomicReference<java.lang.Integer> Group2,
      AtomicReference<java.lang.Integer> Group3,
      AtomicReference<java.lang.Integer> Group4,
      AtomicReference<java.lang.Integer> Group5);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetGroupTZ(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer GroupNo,
      java.lang.Integer Tz1,
      java.lang.Integer Tz2,
      java.lang.Integer Tz3,
      java.lang.Integer VaildHoliday,
      java.lang.Integer VerifyStyle);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetGroupTZ(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer GroupNo,
      AtomicReference<java.lang.Integer> Tz1,
      AtomicReference<java.lang.Integer> Tz2,
      AtomicReference<java.lang.Integer> Tz3,
      AtomicReference<java.lang.Integer> VaildHoliday,
      AtomicReference<java.lang.Integer> VerifyStyle);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetHoliday(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer HolidayID,
      AtomicReference<java.lang.Integer> BeginMonth,
      AtomicReference<java.lang.Integer> BeginDay,
      AtomicReference<java.lang.Integer> EndMonth,
      AtomicReference<java.lang.Integer> EndDay,
      AtomicReference<java.lang.Integer> TimeZoneID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetHoliday(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer HolidayID,
      java.lang.Integer BeginMonth,
      java.lang.Integer BeginDay,
      java.lang.Integer EndMonth,
      java.lang.Integer EndDay,
      java.lang.Integer TimeZoneID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetPlatform(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> Platform);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetUserSMS(
      java.lang.Integer dwMachineNumber, java.lang.String dwEnrollNumber, java.lang.Integer SMSID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DeleteUserSMS(
      java.lang.Integer dwMachineNumber, java.lang.String dwEnrollNumber, java.lang.Integer SMSID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsTFTMachine(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_EnableUser(
      java.lang.Integer dwMachineNumber, java.lang.String dwEnrollNumber, java.lang.Boolean bFlag);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SendCMDMsg(
      java.lang.Integer dwMachineNumber, java.lang.Integer Param1, java.lang.Integer Param2);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SendFile(java.lang.Integer dwMachineNumber, java.lang.String FileName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetLanguageByID(
      java.lang.Integer dwMachineNumber, java.lang.Integer LanguageID, java.lang.String Language);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadFile(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.String FilePath);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetLastCount(java.lang.Integer count);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetCustomizeAttState(
      java.lang.Integer dwMachineNumber, java.lang.Integer StateID, java.lang.Integer NewState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DelCustomizeAttState(
      java.lang.Integer dwMachineNumber, java.lang.Integer StateID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EnableCustomizeAttState(
      java.lang.Integer dwMachineNumber, java.lang.Integer StateID, java.lang.Integer Enable);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetCustomizeVoice(
      java.lang.Integer dwMachineNumber, java.lang.Integer VoiceID, java.lang.String FileName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DelCustomizeVoice(
      java.lang.Integer dwMachineNumber, java.lang.Integer VoiceID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EnableCustomizeVoice(
      java.lang.Integer dwMachineNumber, java.lang.Integer VoiceID, java.lang.Integer Enable);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean StartEnrollEx(
      java.lang.String UserID, java.lang.Integer FingerID, java.lang.Integer Flag);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetUserTmpExt(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer IsDeleted,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Byte> TmpData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DelUserTmpExt(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DeleteEnrollDataExt(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwBackupNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetWorkCode(
      java.lang.Integer AWorkCode, AtomicReference<java.lang.String> Name);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetWorkCode(java.lang.Integer AWorkCode, java.lang.String Name);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_DeleteWorkCode(java.lang.Integer PIN);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_ClearWorkCode();
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
      AtomicReference<java.lang.Integer> Params3);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetShortkey(
      java.lang.Integer ShortKeyID,
      java.lang.Integer ShortKeyFun,
      java.lang.Integer StateCode,
      java.lang.String StateName,
      java.lang.Integer StateAutoChange,
      java.lang.String StateAutoChangeTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetShortkey(
      java.lang.Integer ShortKeyID,
      AtomicReference<java.lang.Integer> ShortKeyFun,
      AtomicReference<java.lang.Integer> StateCode,
      AtomicReference<java.lang.String> StateName,
      AtomicReference<java.lang.Integer> AutoChange,
      AtomicReference<java.lang.String> AutoChangeTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Connect_USB(java.lang.Integer MachineNumber);
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
      AtomicReference<java.lang.Integer> dwSecs);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserFace(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFaceIndex,
      AtomicReference<java.lang.Byte> TmpData,
      AtomicReference<java.lang.Integer> TmpLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserFace(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFaceIndex,
      AtomicReference<java.lang.Byte> TmpData,
      java.lang.Integer TmpLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DelUserFace(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFaceIndex);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserFaceStr(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFaceIndex,
      AtomicReference<java.lang.String> TmpData,
      AtomicReference<java.lang.Integer> TmpLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserFaceStr(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFaceIndex,
      java.lang.String TmpData,
      java.lang.Integer TmpLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserTmpEx(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Integer> Flag,
      AtomicReference<java.lang.Byte> TmpData,
      AtomicReference<java.lang.Integer> TmpLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserTmpExStr(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Integer> Flag,
      AtomicReference<java.lang.String> TmpData,
      AtomicReference<java.lang.Integer> TmpLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserTmpEx(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      java.lang.Integer Flag,
      AtomicReference<java.lang.Byte> TmpData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserTmpExStr(
      java.lang.Integer dwMachineNumber,
      java.lang.String dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      java.lang.Integer Flag,
      java.lang.String TmpData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean MergeTemplate(
      IntPtr Templates,
      java.lang.Integer FingerCount,
      AtomicReference<java.lang.Byte> TemplateDest,
      AtomicReference<java.lang.Integer> FingerSize);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SplitTemplate(
      AtomicReference<java.lang.Byte> Template,
      IntPtr Templates,
      AtomicReference<java.lang.Integer> FingerCount,
      AtomicReference<java.lang.Integer> FingerSize);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadUserAllTemplate(
      java.lang.Integer dwMachineNumber, java.lang.String dwEnrollNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UpdateFile(java.lang.String FileName);
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
      java.lang.Integer dwSecond);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetOptionCommPwd(
      java.lang.Integer dwMachineNumber, java.lang.String CommKey);
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
      java.lang.Integer dwLogIndex);
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
      AtomicReference<java.lang.Integer> dwSecond);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetPhotoByName(
      java.lang.Integer dwMachineNumber,
      java.lang.String PhotoName,
      AtomicReference<java.lang.Byte> PhotoData,
      AtomicReference<java.lang.Integer> PhotoLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetPhotoNamesByTime(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer iFlag,
      java.lang.String sTime,
      java.lang.String eTime,
      AtomicReference<java.lang.String> AllPhotoName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearPhotoByTime(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer iFlag,
      java.lang.String sTime,
      java.lang.String eTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetPhotoCount(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> count,
      java.lang.Integer iFlag);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearDataEx(
      java.lang.Integer dwMachineNumber, java.lang.String TableName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDataFileEx(
      java.lang.Integer dwMachineNumber,
      java.lang.String SourceFileName,
      java.lang.String DestFileName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_SetDeviceData(
      java.lang.Integer dwMachineNumber,
      java.lang.String TableName,
      java.lang.String Datas,
      java.lang.String Options);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SSR_GetDeviceData(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> Buffer,
      java.lang.Integer BufferSize,
      java.lang.String TableName,
      java.lang.String FiledNames,
      java.lang.String Filter,
      java.lang.String Options);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UpdateLogo(java.lang.Integer dwMachineNumber, java.lang.String FileName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetCommuTimeOut(java.lang.Integer timeOut);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SendFileByType(
      java.lang.Integer dwMachineNumber, java.lang.String FileName, java.lang.Integer iType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetCommProType(java.lang.Integer proType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetCompatOldFirmware(java.lang.Integer nCompatOkdFirmware);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Connect_P4P(java.lang.String uid);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceTableData(
      java.lang.Integer dwMachineNumber,
      java.lang.String TableName,
      java.lang.String Datas,
      java.lang.String Options,
      AtomicReference<java.lang.Integer> count);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void GetConnectStatus(AtomicReference<java.lang.Integer> dwErrorCode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetManufacturerData(
      java.lang.Integer dwMachineNumber, java.lang.String Name, java.lang.String Value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetDeviceStatusEx(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearAdministrators(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteEnrollData(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadSuperLogData(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAllSLogData(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadGeneralLogData(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAllGLogData(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EnableUser(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber,
      java.lang.Boolean bFlag);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EnableDevice(java.lang.Integer dwMachineNumber, java.lang.Boolean bFlag);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceStatus(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwStatus,
      AtomicReference<java.lang.Integer> dwValue);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwInfo,
      AtomicReference<java.lang.Integer> dwValue);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceInfo(
      java.lang.Integer dwMachineNumber, java.lang.Integer dwInfo, java.lang.Integer dwValue);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceTime(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void PowerOnAllDevice();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean PowerOffDevice(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ModifyPrivilege(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber,
      java.lang.Integer dwMachinePrivilege);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void GetLastError(AtomicReference<java.lang.Integer> dwErrorCode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetEnrollData(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber,
      AtomicReference<java.lang.Integer> dwMachinePrivilege,
      AtomicReference<java.lang.Integer> dwEnrollData,
      AtomicReference<java.lang.Integer> dwPassWord);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetEnrollData(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber,
      java.lang.Integer dwMachinePrivilege,
      AtomicReference<java.lang.Integer> dwEnrollData,
      java.lang.Integer dwPassWord);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceTime(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwYear,
      AtomicReference<java.lang.Integer> dwMonth,
      AtomicReference<java.lang.Integer> dwDay,
      AtomicReference<java.lang.Integer> dwHour,
      AtomicReference<java.lang.Integer> dwMinute,
      AtomicReference<java.lang.Integer> dwSecond);
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
      AtomicReference<java.lang.Integer> dwMinute);
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
      AtomicReference<java.lang.Integer> dwMinute);
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
      AtomicReference<java.lang.Integer> dwMinute);
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
      AtomicReference<java.lang.Integer> dwMinute);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ConvertPassword(
      java.lang.Integer dwSrcPSW,
      AtomicReference<java.lang.Integer> dwDestPSW,
      java.lang.Integer dwLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAllUserID(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllUserID(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwEnrollNumber,
      AtomicReference<java.lang.Integer> dwEMachineNumber,
      AtomicReference<java.lang.Integer> dwBackupNumber,
      AtomicReference<java.lang.Integer> dwMachinePrivilege,
      AtomicReference<java.lang.Integer> dwEnable);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetSerialNumber(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> dwSerialNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearKeeperData(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetBackupNumber(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetProductCode(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> lpszProductCode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetFirmwareVersion(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> strVersion);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetSDKVersion(AtomicReference<java.lang.String> strVersion);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearGLog(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetFPTempLength(AtomicReference<java.lang.Byte> dwEnrollData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Connect_Com(
      java.lang.Integer ComPort, java.lang.Integer MachineNumber, java.lang.Integer BaudRate);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Connect_Net(java.lang.String IPAdd, java.lang.Integer Port);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Disconnect();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.String Name,
      java.lang.String Password,
      java.lang.Integer Privilege,
      java.lang.Boolean Enabled);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      AtomicReference<java.lang.String> Name,
      AtomicReference<java.lang.String> Password,
      AtomicReference<java.lang.Integer> Privilege,
      AtomicReference<java.lang.Boolean> Enabled);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceIP(java.lang.Integer dwMachineNumber, java.lang.String IPAddr);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceIP(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> IPAddr);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserTmp(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Byte> TmpData,
      AtomicReference<java.lang.Integer> TmpLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserTmp(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.Byte> TmpData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetAllUserInfo(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwEnrollNumber,
      AtomicReference<java.lang.String> Name,
      AtomicReference<java.lang.String> Password,
      AtomicReference<java.lang.Integer> Privilege,
      AtomicReference<java.lang.Boolean> Enabled);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DelUserTmp(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwFingerIndex);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean RefreshData(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FPTempConvert(
      AtomicReference<java.lang.Byte> TmpData1,
      AtomicReference<java.lang.Byte> TmpData2,
      AtomicReference<java.lang.Integer> Size);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetCommPassword(java.lang.Integer CommKey);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserGroup(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      AtomicReference<java.lang.Integer> UserGrp);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserGroup(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer UserGrp);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetTZInfo(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer TZIndex,
      AtomicReference<java.lang.String> TZ);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetTZInfo(
      java.lang.Integer dwMachineNumber, java.lang.Integer TZIndex, java.lang.String TZ);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUnlockGroups(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> Grps);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUnlockGroups(
      java.lang.Integer dwMachineNumber, java.lang.String Grps);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetGroupTZs(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer GroupIndex,
      AtomicReference<java.lang.Integer> TZs);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetGroupTZs(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer GroupIndex,
      AtomicReference<java.lang.Integer> TZs);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserTZs(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      AtomicReference<java.lang.Integer> TZs);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserTZs(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      AtomicReference<java.lang.Integer> TZs);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ACUnlock(java.lang.Integer dwMachineNumber, java.lang.Integer Delay);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetACFun(AtomicReference<java.lang.Integer> ACFun);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetGeneralLogDataStr(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.Integer> dwEnrollNumber,
      AtomicReference<java.lang.Integer> dwVerifyMode,
      AtomicReference<java.lang.Integer> dwInOutMode,
      AtomicReference<java.lang.String> TimeStr);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserTmpStr(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      AtomicReference<java.lang.String> TmpData,
      AtomicReference<java.lang.Integer> TmpLength);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserTmpStr(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwFingerIndex,
      java.lang.String TmpData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetEnrollDataStr(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber,
      AtomicReference<java.lang.Integer> dwMachinePrivilege,
      AtomicReference<java.lang.String> dwEnrollData,
      AtomicReference<java.lang.Integer> dwPassWord);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetEnrollDataStr(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      java.lang.Integer dwEMachineNumber,
      java.lang.Integer dwBackupNumber,
      java.lang.Integer dwMachinePrivilege,
      java.lang.String dwEnrollData,
      java.lang.Integer dwPassWord);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetGroupTZStr(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer GroupIndex,
      AtomicReference<java.lang.String> TZs);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetGroupTZStr(
      java.lang.Integer dwMachineNumber, java.lang.Integer GroupIndex, java.lang.String TZs);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserTZStr(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwEnrollNumber,
      AtomicReference<java.lang.String> TZs);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserTZStr(
      java.lang.Integer dwMachineNumber, java.lang.Integer dwEnrollNumber, java.lang.String TZs);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FPTempConvertStr(
      java.lang.String TmpData1,
      AtomicReference<java.lang.String> TmpData2,
      AtomicReference<java.lang.Integer> Size);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetFPTempLengthStr(java.lang.String dwEnrollData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserInfoByPIN2(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> Name,
      AtomicReference<java.lang.String> Password,
      AtomicReference<java.lang.Integer> Privilege,
      AtomicReference<java.lang.Boolean> Enabled);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserInfoByCard(
      java.lang.Integer dwMachineNumber,
      AtomicReference<java.lang.String> Name,
      AtomicReference<java.lang.String> Password,
      AtomicReference<java.lang.Integer> Privilege,
      AtomicReference<java.lang.Boolean> Enabled);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean CaptureImage(
      java.lang.Boolean FullImage,
      AtomicReference<java.lang.Integer> Width,
      AtomicReference<java.lang.Integer> Height,
      AtomicReference<java.lang.Byte> Image,
      java.lang.String ImageFile);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UpdateFirmware(java.lang.String FirmwareFile);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean StartEnroll(java.lang.Integer UserID, java.lang.Integer FingerID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean StartVerify(java.lang.Integer UserID, java.lang.Integer FingerID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean StartIdentify();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean CancelOperation();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean QueryState(AtomicReference<java.lang.Integer> State);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean BackupData(java.lang.String DataFile);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean RestoreData(java.lang.String DataFile);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean WriteLCD(
      java.lang.Integer Row, java.lang.Integer Col, java.lang.String Text);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearLCD();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Beep(java.lang.Integer DelayMS);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean PlayVoice(java.lang.Integer Position, java.lang.Integer Length);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean PlayVoiceByIndex(java.lang.Integer Index);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EnableClock(java.lang.Integer Enabled);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetUserIDByPIN2(
      java.lang.Integer PIN2, AtomicReference<java.lang.Integer> UserID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetPIN2(
      java.lang.Integer UserID, AtomicReference<java.lang.Integer> PIN2);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FPTempConvertNew(
      AtomicReference<java.lang.Byte> TmpData1,
      AtomicReference<java.lang.Byte> TmpData2,
      AtomicReference<java.lang.Integer> Size);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FPTempConvertNewStr(
      java.lang.String TmpData1,
      AtomicReference<java.lang.String> TmpData2,
      AtomicReference<java.lang.Integer> Size);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReadAllTemplate(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DisableDeviceWithTimeOut(
      java.lang.Integer dwMachineNumber, java.lang.Integer TimeOutSec);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceTime2(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer dwYear,
      java.lang.Integer dwMonth,
      java.lang.Integer dwDay,
      java.lang.Integer dwHour,
      java.lang.Integer dwMinute,
      java.lang.Integer dwSecond);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearSLog(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean RestartDevice(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetDeviceMAC(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> sMAC);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetDeviceMAC(java.lang.Integer dwMachineNumber, java.lang.String sMAC);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetWiegandFmt(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.String> sWiegandFmt);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetWiegandFmt(
      java.lang.Integer dwMachineNumber, java.lang.String sWiegandFmt);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearSMS(java.lang.Integer dwMachineNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetSMS(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer ID,
      AtomicReference<java.lang.Integer> Tag,
      AtomicReference<java.lang.Integer> ValidMinutes,
      AtomicReference<java.lang.String> StartTime,
      AtomicReference<java.lang.String> Content);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetSMS(
      java.lang.Integer dwMachineNumber,
      java.lang.Integer ID,
      java.lang.Integer Tag,
      java.lang.Integer ValidMinutes,
      java.lang.String StartTime,
      java.lang.String Content);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteSMS(java.lang.Integer dwMachineNumber, java.lang.Integer ID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetUserSMS(
      java.lang.Integer dwMachineNumber, java.lang.Integer dwEnrollNumber, java.lang.Integer SMSID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteUserSMS(
      java.lang.Integer dwMachineNumber, java.lang.Integer dwEnrollNumber, java.lang.Integer SMSID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetCardFun(
      java.lang.Integer dwMachineNumber, AtomicReference<java.lang.Integer> CardFun);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ClearUserSMS(java.lang.Integer dwMachineNumber);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getReadMark();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCommPort();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getConvertBIG5();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getBASE64();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getPIN2();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getAccGroup();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getAccTimeZones(java.lang.Integer Index);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCardNumber(java.lang.Integer Index);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPINWidth();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMachineNumber();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSTR_CardNumber(java.lang.Integer Index);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSSRPin();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPullMode();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMaxP4PConnect();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getBatchDataMode();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setReadMark(java.lang.Boolean pVal);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCommPort(java.lang.Integer pVal);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setConvertBIG5(java.lang.Integer pVal);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setBASE64(java.lang.Integer pVal);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setPIN2(java.lang.Long pVal);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setAccGroup(java.lang.Integer pVal);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setAccTimeZones(java.lang.Integer Index, java.lang.Integer pVal);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCardNumber(java.lang.Integer Index, java.lang.Integer pVal);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setMachineNumber(java.lang.Integer pVal);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSTR_CardNumber(java.lang.Integer Index, java.lang.String pVal);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setPullMode(java.lang.Integer pVal);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setBatchDataMode(java.lang.Integer pVal);
}
