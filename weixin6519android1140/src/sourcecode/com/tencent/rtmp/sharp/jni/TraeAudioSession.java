package com.tencent.rtmp.sharp.jni;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Process;
import com.tencent.liteav.basic.log.TXCLog;

public class TraeAudioSession
  extends BroadcastReceiver
{
  static int s_nSessionIdAllocator = 0;
  final String TRAE_ACTION_PHONE_STATE = "android.intent.action.PHONE_STATE";
  private boolean _canSwtich2Earphone = true;
  private String _connectedDev = "DEVICE_NONE";
  private ITraeAudioCallback mCallback;
  private Context mContext;
  private boolean mIsHostside = false;
  private long mSessionId = Long.MIN_VALUE;
  
  public TraeAudioSession(Context paramContext, ITraeAudioCallback paramITraeAudioCallback)
  {
    TXCLog.w("TRAE", "TraeAudioSession create");
    if (Process.myPid() == TraeAudioManager._gHostProcessId) {
      bool = true;
    }
    this.mIsHostside = bool;
    this.mSessionId = requestSessionId();
    this.mCallback = paramITraeAudioCallback;
    this.mContext = paramContext;
    StringBuilder localStringBuilder;
    Object localObject;
    if ((paramContext == null) && (QLog.isColorLevel()))
    {
      localStringBuilder = new StringBuilder("AudioSession | Invalid parameters: ctx = ");
      if (paramContext != null) {
        break label178;
      }
      localObject = "null";
    }
    for (;;)
    {
      localObject = localStringBuilder.append((String)localObject).append("; cb = ");
      if (paramITraeAudioCallback == null)
      {
        paramITraeAudioCallback = "null";
        QLog.w("TRAE", 2, paramITraeAudioCallback);
        paramITraeAudioCallback = new IntentFilter();
        paramITraeAudioCallback.addAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES");
        paramITraeAudioCallback.addAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY");
        if (paramContext == null) {}
      }
      try
      {
        paramContext.registerReceiver(this, paramITraeAudioCallback);
        registerAudioSession(true);
        return;
        label178:
        localObject = "{object}";
        continue;
        paramITraeAudioCallback = "{object}";
      }
      catch (Exception paramContext)
      {
        for (;;) {}
      }
    }
  }
  
  public static void ExConnectDevice(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null) || (paramString.length() <= 0)) {
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", Long.MIN_VALUE);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_CONNECTDEVICE");
    localIntent.putExtra("CONNECTDEVICE_DEVICENAME", paramString);
    paramContext.sendBroadcast(localIntent);
  }
  
  private int registerAudioSession(boolean paramBoolean)
  {
    if (this.mContext == null) {
      return -1;
    }
    if (this.mIsHostside) {
      return TraeAudioManager.registerAudioSession(paramBoolean, this.mSessionId, this.mContext);
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_REGISTERAUDIOSESSION");
    localIntent.putExtra("REGISTERAUDIOSESSION_ISREGISTER", paramBoolean);
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public static long requestSessionId()
  {
    long l = Process.myPid();
    int i = s_nSessionIdAllocator + 1;
    s_nSessionIdAllocator = i;
    return (l << 32) + i;
  }
  
  public int EarAction(int paramInt)
  {
    if (this.mIsHostside) {
      return TraeAudioManager.earAction("OPERATION_EARACTION", this.mSessionId, this.mIsHostside, paramInt);
    }
    if ((this.mContext == null) || ((paramInt != 0) && (paramInt != 1))) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_EARACTION");
    localIntent.putExtra("EXTRA_EARACTION", paramInt);
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int connectDevice(String paramString)
  {
    if (this.mIsHostside) {
      return TraeAudioManager.connectDevice("OPERATION_CONNECTDEVICE", this.mSessionId, this.mIsHostside, paramString);
    }
    if ((this.mContext == null) || (paramString == null) || (paramString.length() <= 0)) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_CONNECTDEVICE");
    localIntent.putExtra("CONNECTDEVICE_DEVICENAME", paramString);
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int connectHighestPriorityDevice()
  {
    if (this.mIsHostside) {
      return TraeAudioManager.connectHighestPriorityDevice("OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE", this.mSessionId, this.mIsHostside);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int getConnectedDevice()
  {
    if (this.mIsHostside) {
      return TraeAudioManager.getConnectedDevice("OPERATION_GETCONNECTEDDEVICE", this.mSessionId, this.mIsHostside);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_GETCONNECTEDDEVICE");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int getConnectingDevice()
  {
    if (this.mIsHostside) {
      return TraeAudioManager.getConnectingDevice("OPERATION_GETCONNECTINGDEVICE", this.mSessionId, this.mIsHostside);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_GETCONNECTINGDEVICE");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int getDeviceList()
  {
    if (this.mIsHostside) {
      return TraeAudioManager.getDeviceList("OPERATION_GETDEVICELIST", this.mSessionId, this.mIsHostside);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_GETDEVICELIST");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int getStreamType()
  {
    if (this.mIsHostside) {
      return TraeAudioManager.getStreamType("OPERATION_GETSTREAMTYPE", this.mSessionId, this.mIsHostside);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_GETSTREAMTYPE");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int isDeviceChangabled()
  {
    if (this.mIsHostside) {
      return TraeAudioManager.isDeviceChangabled("OPERATION_ISDEVICECHANGABLED", this.mSessionId, this.mIsHostside);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_ISDEVICECHANGABLED");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool3 = true;
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramIntent == null) {}
    int j;
    Object localObject;
    label204:
    label211:
    int i;
    label263:
    label734:
    label811:
    do
    {
      do
      {
        String str1;
        String str2;
        String str3;
        do
        {
          long l;
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        return;
                        for (;;)
                        {
                          try
                          {
                            l = paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE);
                            paramContext = paramIntent.getStringExtra("PARAM_OPERATION");
                            j = paramIntent.getIntExtra("PARAM_RES_ERRCODE", 0);
                            if (!"com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY".equals(paramIntent.getAction())) {
                              break label734;
                            }
                            if (!"NOTIFY_SERVICE_STATE".equals(paramContext)) {
                              break label211;
                            }
                            bool1 = paramIntent.getBooleanExtra("NOTIFY_SERVICE_STATE_DATE", false);
                            if (QLog.isColorLevel())
                            {
                              localObject = new StringBuilder("AudioSession|[onServiceStateUpdate]");
                              if (!bool1) {
                                break label204;
                              }
                              paramContext = "on";
                              QLog.w("TRAE", 2, paramContext);
                            }
                            if (this.mCallback == null) {
                              break;
                            }
                            this.mCallback.onServiceStateUpdate(bool1);
                            return;
                          }
                          catch (Exception paramContext) {}
                          if (!QLog.isColorLevel()) {
                            break;
                          }
                          QLog.e("TRAE", 2, "AudioSession| nSessinId = " + this.mSessionId + " onReceive::intent:" + paramIntent.toString() + " intent.getAction():" + paramIntent.getAction() + " Exception:" + paramContext.getMessage());
                          return;
                          paramContext = "off";
                        }
                        if (!"NOTIFY_DEVICELISTUPDATE".equals(paramContext)) {
                          break;
                        }
                        localObject = paramIntent.getStringArrayExtra("EXTRA_DATA_AVAILABLEDEVICE_LIST");
                        str1 = paramIntent.getStringExtra("EXTRA_DATA_CONNECTEDDEVICE");
                        str2 = paramIntent.getStringExtra("EXTRA_DATA_PREV_CONNECTEDDEVICE");
                        str3 = paramIntent.getStringExtra("EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME");
                        paramContext = "\n";
                        i = 0;
                        if (i < localObject.length)
                        {
                          paramContext = paramContext + "AudioSession|    " + i + " " + localObject[i] + "\n";
                          if (localObject[i].equals("DEVICE_WIREDHEADSET")) {
                            break label1645;
                          }
                          if (!localObject[i].equals("DEVICE_BLUETOOTHHEADSET")) {
                            break label1648;
                          }
                          break label1645;
                        }
                        paramContext = paramContext + "\n";
                        if (QLog.isColorLevel()) {
                          QLog.w("TRAE", 2, "AudioSession|[onDeviceListUpdate]  connected:" + str1 + " prevConnected:" + str2 + " bt:" + str3 + " Num:" + localObject.length + paramContext);
                        }
                        this._canSwtich2Earphone = bool1;
                        this._connectedDev = str1;
                      } while (this.mCallback == null);
                      this.mCallback.onDeviceListUpdate((String[])localObject, str1, str2, str3);
                      return;
                      if (!"NOTIFY_DEVICECHANGABLE_UPDATE".equals(paramContext)) {
                        break;
                      }
                      bool1 = paramIntent.getBooleanExtra("NOTIFY_DEVICECHANGABLE_UPDATE_DATE", true);
                      if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "AudioSession|[onDeviceChangabledUpdate]" + bool1);
                      }
                    } while (this.mCallback == null);
                    this.mCallback.onDeviceChangabledUpdate(bool1);
                    return;
                    if (!"NOTIFY_STREAMTYPE_UPDATE".equals(paramContext)) {
                      break;
                    }
                    i = paramIntent.getIntExtra("EXTRA_DATA_STREAMTYPE", -1);
                    if (QLog.isColorLevel()) {
                      QLog.w("TRAE", 2, "AudioSession|[onStreamTypeUpdate] err:" + j + " st:" + i);
                    }
                  } while (this.mCallback == null);
                  this.mCallback.onStreamTypeUpdate(i);
                  return;
                  if (!"NOTIFY_ROUTESWITCHSTART".equals(paramContext)) {
                    break;
                  }
                  paramContext = paramIntent.getStringExtra("EXTRA_DATA_ROUTESWITCHSTART_FROM");
                  localObject = paramIntent.getStringExtra("EXTRA_DATA_ROUTESWITCHSTART_TO");
                } while ((this.mCallback == null) || (paramContext == null) || (localObject == null));
                this.mCallback.onAudioRouteSwitchStart(paramContext, (String)localObject);
                return;
              } while (!"NOTIFY_ROUTESWITCHEND".equals(paramContext));
              paramContext = paramIntent.getStringExtra("EXTRA_DATA_ROUTESWITCHEND_DEV");
              l = paramIntent.getLongExtra("EXTRA_DATA_ROUTESWITCHEND_TIME", -1L);
            } while ((this.mCallback == null) || (paramContext == null) || (l == -1L));
            this.mCallback.onAudioRouteSwitchEnd(paramContext, l);
            return;
          } while ((!"com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES".equals(paramIntent.getAction())) || (this.mSessionId != l));
          if (!"OPERATION_GETDEVICELIST".equals(paramContext)) {
            break;
          }
          localObject = paramIntent.getStringArrayExtra("EXTRA_DATA_AVAILABLEDEVICE_LIST");
          str1 = paramIntent.getStringExtra("EXTRA_DATA_CONNECTEDDEVICE");
          str2 = paramIntent.getStringExtra("EXTRA_DATA_PREV_CONNECTEDDEVICE");
          str3 = paramIntent.getStringExtra("EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME");
          paramContext = "\n";
          i = 0;
          bool1 = bool3;
          if (i < localObject.length)
          {
            paramContext = paramContext + "AudioSession|    " + i + " " + localObject[i] + "\n";
            if (localObject[i].equals("DEVICE_WIREDHEADSET")) {
              break label1655;
            }
            if (!localObject[i].equals("DEVICE_BLUETOOTHHEADSET")) {
              break label1658;
            }
            break label1655;
          }
          paramContext = paramContext + "\n";
          this._canSwtich2Earphone = bool1;
          this._connectedDev = str1;
          if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "AudioSession|[onGetDeviceListRes] err:" + j + " connected:" + str1 + " prevConnected:" + str2 + " bt:" + str3 + " Num:" + localObject.length + paramContext);
          }
        } while (this.mCallback == null);
        this.mCallback.onGetDeviceListRes(j, (String[])localObject, str1, str2, str3);
        return;
        if (!"OPERATION_CONNECTDEVICE".equals(paramContext)) {
          break;
        }
        paramContext = paramIntent.getStringExtra("CONNECTDEVICE_RESULT_DEVICENAME");
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 2, "AudioSession|[onConnectDeviceRes] err:" + j + " dev:" + paramContext);
        }
      } while (this.mCallback == null);
      localObject = this.mCallback;
      bool1 = bool2;
      if (j == 0) {
        bool1 = true;
      }
      ((ITraeAudioCallback)localObject).onConnectDeviceRes(j, paramContext, bool1);
      return;
      if (!"OPERATION_EARACTION".equals(paramContext)) {
        break;
      }
      i = paramIntent.getIntExtra("EXTRA_EARACTION", -1);
    } while (!QLog.isColorLevel());
    QLog.w("TRAE", 2, "AudioSession|[onConnectDeviceRes] err:" + j + " earAction:" + i);
    return;
    if ("OPERATION_ISDEVICECHANGABLED".equals(paramContext))
    {
      bool1 = paramIntent.getBooleanExtra("ISDEVICECHANGABLED_REULT_ISCHANGABLED", false);
      if (QLog.isColorLevel())
      {
        localObject = new StringBuilder("AudioSession|[onIsDeviceChangabledRes] err:").append(j).append(" Changabled:");
        if (!bool1) {
          break label1665;
        }
      }
    }
    label1645:
    label1648:
    label1655:
    label1658:
    label1665:
    for (paramContext = "Y";; paramContext = "N")
    {
      QLog.w("TRAE", 2, paramContext);
      if (this.mCallback == null) {
        break;
      }
      this.mCallback.onIsDeviceChangabledRes(j, bool1);
      return;
      if ("OPERATION_GETCONNECTEDDEVICE".equals(paramContext))
      {
        paramContext = paramIntent.getStringExtra("GETCONNECTEDDEVICE_REULT_LIST");
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 2, "AudioSession|[onGetConnectedDeviceRes] err:" + j + " dev:" + paramContext);
        }
        if (this.mCallback == null) {
          break;
        }
        this.mCallback.onGetConnectedDeviceRes(j, paramContext);
        return;
      }
      if ("OPERATION_GETCONNECTINGDEVICE".equals(paramContext))
      {
        paramContext = paramIntent.getStringExtra("GETCONNECTINGDEVICE_REULT_LIST");
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 2, "AudioSession|[onGetConnectingDeviceRes] err:" + j + " dev:" + paramContext);
        }
        if (this.mCallback == null) {
          break;
        }
        this.mCallback.onGetConnectingDeviceRes(j, paramContext);
        return;
      }
      if ("OPERATION_GETSTREAMTYPE".equals(paramContext))
      {
        i = paramIntent.getIntExtra("EXTRA_DATA_STREAMTYPE", -1);
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 2, "AudioSession|[onGetStreamTypeRes] err:" + j + " st:" + i);
        }
        if (this.mCallback == null) {
          break;
        }
        this.mCallback.onGetStreamTypeRes(j, i);
        return;
      }
      if ("NOTIFY_RING_COMPLETION".equals(paramContext))
      {
        paramContext = paramIntent.getStringExtra("PARAM_RING_USERDATA_STRING");
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 2, "AudioSession|[onRingCompletion] err:" + j + " userData:" + paramContext);
        }
        if (this.mCallback == null) {
          break;
        }
        this.mCallback.onRingCompletion(j, paramContext);
        return;
      }
      if (!"OPERATION_VOICECALL_PREPROCESS".equals(paramContext)) {
        break;
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "AudioSession|[onVoicecallPreprocess] err:" + j);
      }
      if (this.mCallback == null) {
        break;
      }
      this.mCallback.onVoicecallPreprocessRes(j);
      return;
      bool1 = false;
      i += 1;
      break label263;
      bool1 = false;
      i += 1;
      break label811;
    }
  }
  
  public int recoverAudioFocus()
  {
    if (this.mIsHostside) {
      return TraeAudioManager.recoverAudioFocus("OPERATION_RECOVER_AUDIO_FOCUS", this.mSessionId, this.mIsHostside);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_RECOVER_AUDIO_FOCUS");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public void release()
  {
    if (this.mContext != null) {}
    try
    {
      this.mContext.unregisterReceiver(this);
      registerAudioSession(false);
      this.mContext = null;
      this.mCallback = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public int requestReleaseAudioFocus()
  {
    if (this.mIsHostside) {
      return TraeAudioManager.requestReleaseAudioFocus("OPERATION_REQUEST_RELEASE_AUDIO_FOCUS", this.mSessionId, this.mIsHostside);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_REQUEST_RELEASE_AUDIO_FOCUS");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public void setCallback(ITraeAudioCallback paramITraeAudioCallback)
  {
    this.mCallback = paramITraeAudioCallback;
  }
  
  public int startRing(int paramInt1, int paramInt2, Uri paramUri, String paramString, boolean paramBoolean)
  {
    if (this.mIsHostside) {
      return TraeAudioManager.startRing("OPERATION_STARTRING", this.mSessionId, this.mIsHostside, paramInt1, paramInt2, paramUri, paramString, paramBoolean, 1, "normal-ring", false);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_RING_DATASOURCE", paramInt1);
    localIntent.putExtra("PARAM_RING_RSID", paramInt2);
    localIntent.putExtra("PARAM_RING_URI", paramUri);
    localIntent.putExtra("PARAM_RING_FILEPATH", paramString);
    localIntent.putExtra("PARAM_RING_LOOP", paramBoolean);
    localIntent.putExtra("PARAM_RING_MODE", false);
    localIntent.putExtra("PARAM_RING_USERDATA_STRING", "normal-ring");
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_STARTRING");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int startRing(int paramInt1, int paramInt2, Uri paramUri, String paramString1, boolean paramBoolean, int paramInt3, String paramString2)
  {
    if (this.mIsHostside) {
      return TraeAudioManager.startRing("OPERATION_STARTRING", this.mSessionId, this.mIsHostside, paramInt1, paramInt2, paramUri, paramString1, paramBoolean, paramInt3, paramString2, false);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_RING_DATASOURCE", paramInt1);
    localIntent.putExtra("PARAM_RING_RSID", paramInt2);
    localIntent.putExtra("PARAM_RING_URI", paramUri);
    localIntent.putExtra("PARAM_RING_FILEPATH", paramString1);
    localIntent.putExtra("PARAM_RING_LOOP", paramBoolean);
    localIntent.putExtra("PARAM_RING_LOOPCOUNT", paramInt3);
    localIntent.putExtra("PARAM_RING_MODE", false);
    localIntent.putExtra("PARAM_RING_USERDATA_STRING", paramString2);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_STARTRING");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int startRing(int paramInt1, int paramInt2, Uri paramUri, String paramString1, boolean paramBoolean1, int paramInt3, String paramString2, boolean paramBoolean2)
  {
    if (this.mIsHostside) {
      return TraeAudioManager.startRing("OPERATION_STARTRING", this.mSessionId, this.mIsHostside, paramInt1, paramInt2, paramUri, paramString1, paramBoolean1, paramInt3, paramString2, paramBoolean2);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_RING_DATASOURCE", paramInt1);
    localIntent.putExtra("PARAM_RING_RSID", paramInt2);
    localIntent.putExtra("PARAM_RING_URI", paramUri);
    localIntent.putExtra("PARAM_RING_FILEPATH", paramString1);
    localIntent.putExtra("PARAM_RING_LOOP", paramBoolean1);
    localIntent.putExtra("PARAM_RING_LOOPCOUNT", paramInt3);
    localIntent.putExtra("PARAM_RING_MODE", paramBoolean2);
    localIntent.putExtra("PARAM_RING_USERDATA_STRING", paramString2);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_STARTRING");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int startService(String paramString)
  {
    String str;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.length() > 0) {}
    }
    else
    {
      str = "internal_disable_dev_switch";
    }
    if (this.mIsHostside) {
      return TraeAudioManager.startService("OPERATION_STARTSERVICE", this.mSessionId, this.mIsHostside, str);
    }
    if (this.mContext == null) {
      return -1;
    }
    paramString = new Intent();
    paramString.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    paramString.putExtra("PARAM_SESSIONID", this.mSessionId);
    paramString.putExtra("PARAM_OPERATION", "OPERATION_STARTSERVICE");
    paramString.putExtra("EXTRA_DATA_DEVICECONFIG", str);
    this.mContext.sendBroadcast(paramString);
    return 0;
  }
  
  public int stopRing()
  {
    if (this.mIsHostside) {
      return TraeAudioManager.stopRing("OPERATION_STOPRING", this.mSessionId, this.mIsHostside);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_STOPRING");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int stopService()
  {
    if (this.mIsHostside) {
      return TraeAudioManager.stopService("OPERATION_STOPSERVICE", this.mSessionId, this.mIsHostside);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_STOPSERVICE");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int voiceCallAudioParamChanged(int paramInt1, int paramInt2)
  {
    if (this.mIsHostside) {
      return TraeAudioManager.voiceCallAudioParamChanged("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST", this.mSessionId, this.mIsHostside, paramInt1, paramInt2);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_MODEPOLICY", paramInt1);
    localIntent.putExtra("PARAM_STREAMTYPE", paramInt2);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_VOICECALL_AUDIOPARAM_CHANGED");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int voiceCallPostprocess()
  {
    if (this.mIsHostside) {
      return TraeAudioManager.voicecallPostprocess("OPERATION_VOICECALL_POSTROCESS", this.mSessionId, this.mIsHostside);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_VOICECALL_POSTROCESS");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public int voiceCallPreprocess(int paramInt1, int paramInt2)
  {
    if (this.mIsHostside) {
      return TraeAudioManager.voicecallPreprocess("OPERATION_VOICECALL_PREPROCESS", this.mSessionId, this.mIsHostside, paramInt1, paramInt2);
    }
    if (this.mContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
    localIntent.putExtra("PARAM_SESSIONID", this.mSessionId);
    localIntent.putExtra("PARAM_MODEPOLICY", paramInt1);
    localIntent.putExtra("PARAM_STREAMTYPE", paramInt2);
    localIntent.putExtra("PARAM_OPERATION", "OPERATION_VOICECALL_PREPROCESS");
    this.mContext.sendBroadcast(localIntent);
    return 0;
  }
  
  public static abstract interface ITraeAudioCallback
  {
    public abstract void onAudioRouteSwitchEnd(String paramString, long paramLong);
    
    public abstract void onAudioRouteSwitchStart(String paramString1, String paramString2);
    
    public abstract void onConnectDeviceRes(int paramInt, String paramString, boolean paramBoolean);
    
    public abstract void onDeviceChangabledUpdate(boolean paramBoolean);
    
    public abstract void onDeviceListUpdate(String[] paramArrayOfString, String paramString1, String paramString2, String paramString3);
    
    public abstract void onGetConnectedDeviceRes(int paramInt, String paramString);
    
    public abstract void onGetConnectingDeviceRes(int paramInt, String paramString);
    
    public abstract void onGetDeviceListRes(int paramInt, String[] paramArrayOfString, String paramString1, String paramString2, String paramString3);
    
    public abstract void onGetStreamTypeRes(int paramInt1, int paramInt2);
    
    public abstract void onIsDeviceChangabledRes(int paramInt, boolean paramBoolean);
    
    public abstract void onRingCompletion(int paramInt, String paramString);
    
    public abstract void onServiceStateUpdate(boolean paramBoolean);
    
    public abstract void onStreamTypeUpdate(int paramInt);
    
    public abstract void onVoicecallPreprocessRes(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\rtmp\sharp\jni\TraeAudioSession.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */