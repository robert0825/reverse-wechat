package com.tencent.mm.plugin.g.a.b.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.g.a.b.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@TargetApi(18)
public class c
{
  public static final String TAG;
  private static HashMap<String, Long> jlX;
  private static HashMap<String, Long> jni;
  
  static
  {
    GMTrace.i(4820429701120L, 35915);
    TAG = c.class.getName();
    jlX = new HashMap();
    HashMap localHashMap = new HashMap();
    jni = localHashMap;
    localHashMap.put(h.jmn, Long.valueOf(1L));
    jni.put(h.jmo, Long.valueOf(1L));
    jni.put(h.jmp, Long.valueOf(16L));
    jni.put(h.jmq, Long.valueOf(16L));
    jni.put(h.jmr, Long.valueOf(16L));
    jni.put(h.jms, Long.valueOf(16L));
    jlX.put(h.jmk, Long.valueOf(0L));
    jlX.put(h.jmt, Long.valueOf(2L));
    jlX.put(h.jmw, Long.valueOf(4L));
    jlX.put(h.jmA, Long.valueOf(8L));
    GMTrace.o(4820429701120L, 35915);
  }
  
  public c()
  {
    GMTrace.i(4819624394752L, 35909);
    GMTrace.o(4819624394752L, 35909);
  }
  
  public static long a(BluetoothGattService paramBluetoothGattService)
  {
    long l1 = 0L;
    GMTrace.i(4820027047936L, 35912);
    if (paramBluetoothGattService == null)
    {
      w.e(TAG, "service is null");
      GMTrace.o(4820027047936L, 35912);
      return 0L;
    }
    Object localObject = paramBluetoothGattService.getUuid().toString();
    if ((((String)localObject).equalsIgnoreCase(h.jmk)) && (paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmn)) != null))
    {
      paramBluetoothGattService = paramBluetoothGattService.getCharacteristics();
      l1 = 0L;
      int i = 0;
      if (i < paramBluetoothGattService.size())
      {
        localObject = ((BluetoothGattCharacteristic)paramBluetoothGattService.get(i)).getUuid().toString();
        localObject = (Long)jni.get(localObject);
        if (localObject == null) {}
        for (long l2 = 0L;; l2 = ((Long)localObject).longValue())
        {
          i += 1;
          l1 = l2 | l1;
          break;
        }
      }
      w.d(TAG, "wechat service, profileType = %d", new Object[] { Long.valueOf(l1) });
      GMTrace.o(4820027047936L, 35912);
      return l1;
    }
    paramBluetoothGattService = (Long)jlX.get(localObject);
    if (paramBluetoothGattService == null) {}
    for (;;)
    {
      w.d(TAG, "service uuid = %s, profileType = %d", new Object[] { localObject, Long.valueOf(l1) });
      GMTrace.o(4820027047936L, 35912);
      return l1;
      l1 = paramBluetoothGattService.longValue();
    }
  }
  
  public static byte[] a(BluetoothGattCharacteristic paramBluetoothGattCharacteristic, byte[] paramArrayOfByte)
  {
    int j = 0;
    int k = 0;
    int i = 0;
    GMTrace.i(4820295483392L, 35914);
    if ((paramBluetoothGattCharacteristic == null) || (paramArrayOfByte == null))
    {
      w.e(TAG, "characteristic or recvData is null");
      GMTrace.o(4820295483392L, 35914);
      return null;
    }
    long l = 0L;
    Object localObject1 = paramBluetoothGattCharacteristic.getUuid().toString();
    paramBluetoothGattCharacteristic = paramBluetoothGattCharacteristic.getService();
    Object localObject2;
    if (paramBluetoothGattCharacteristic != null)
    {
      l = a(paramBluetoothGattCharacteristic);
      w.d(TAG, "recv data. uuid = %s, data = %s", new Object[] { localObject1, com.tencent.mm.plugin.exdevice.j.b.al(paramArrayOfByte) });
      if ((0L == (1L & l)) || ((!((String)localObject1).equalsIgnoreCase(f.jnK)) && (!((String)localObject1).equalsIgnoreCase(f.jnL)))) {
        break label510;
      }
      localObject2 = new f();
      if ((paramArrayOfByte.length > 0) && ((paramArrayOfByte[0] & 0x1) != 0)) {
        break label231;
      }
      w.e(f.TAG, "pase step data error");
      i = 0;
      label155:
      if (i == 0) {
        break label497;
      }
      paramBluetoothGattCharacteristic = com.tencent.mm.plugin.exdevice.j.b.aW(localObject2);
      w.d(TAG, "step info. stepCount=%d, stepDistance=%d, stepColarie=%d", new Object[] { Integer.valueOf(((f)localObject2).jnM), Integer.valueOf(((f)localObject2).jnN), Integer.valueOf(((f)localObject2).jnO) });
    }
    for (;;)
    {
      GMTrace.o(4820295483392L, 35914);
      return paramBluetoothGattCharacteristic;
      w.e(TAG, "the characteristic has no parent service");
      break;
      label231:
      if ((localObject1 == null) || ((!((String)localObject1).equals(f.jnK)) && (!((String)localObject1).equals(f.jnL))))
      {
        w.e(f.TAG, "uuid is not correct");
        i = 0;
        break label155;
      }
      ((f)localObject2).jmF = ((String)localObject1);
      i = 4;
      if ((paramArrayOfByte[0] & 0x2) != 0) {
        i = 7;
      }
      j = i;
      if ((paramArrayOfByte[0] & 0x4) != 0) {
        j = i + 3;
      }
      if (j > paramArrayOfByte.length)
      {
        w.e(f.TAG, "data len is not enough");
        i = 0;
        break label155;
      }
      ((f)localObject2).jnM = 0;
      j = 0;
      i = 1;
      while (j < 3)
      {
        ((f)localObject2).jnM += ((paramArrayOfByte[i] & 0xFF) << j * 8);
        j += 1;
        i += 1;
      }
      j = i;
      if ((paramArrayOfByte[0] & 0x2) != 0)
      {
        ((f)localObject2).jnN = 0;
        k = 0;
        for (;;)
        {
          j = i;
          if (k >= 3) {
            break;
          }
          ((f)localObject2).jnN += ((paramArrayOfByte[i] & 0xFF) << k * 8);
          k += 1;
          i += 1;
        }
      }
      if ((paramArrayOfByte[0] & 0x4) != 0)
      {
        ((f)localObject2).jnO = 0;
        i = 0;
        while (i < 3)
        {
          ((f)localObject2).jnO += ((paramArrayOfByte[j] & 0xFF) << i * 8);
          j += 1;
          i += 1;
        }
      }
      i = 1;
      break label155;
      label497:
      w.e(TAG, "parse step data error");
      paramBluetoothGattCharacteristic = null;
    }
    label510:
    label584:
    boolean bool;
    if ((0L != (0x2 & l)) && ((((String)localObject1).equalsIgnoreCase(g.jmv)) || (((String)localObject1).equalsIgnoreCase(g.jmu))))
    {
      localObject2 = new g();
      if ((localObject1 == null) || (((String)localObject1).length() <= 0) || (paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
      {
        w.e(g.TAG, "characteristicUuid or data is null or nil");
        i = 0;
      }
      for (;;)
      {
        if (i != 0)
        {
          paramBluetoothGattCharacteristic = com.tencent.mm.plugin.exdevice.j.b.aW(localObject2);
          w.d(TAG, "weight info. weight = %d", new Object[] { Integer.valueOf(((g)localObject2).jnS.jnU) });
          break;
          ((g)localObject2).jmF = ((String)localObject1);
          if (((g)localObject2).jmF.equalsIgnoreCase(g.jmu))
          {
            if (4 > paramArrayOfByte.length)
            {
              w.e(g.TAG, "weight scale feature characteristic data is a 32bit value, but current value len is %d", new Object[] { Integer.valueOf(paramArrayOfByte.length) });
              i = 0;
              continue;
            }
            ((g)localObject2).jnR = new g.c();
            paramBluetoothGattCharacteristic = ((g)localObject2).jnR;
            if ((paramArrayOfByte[0] & 0x1) != 0)
            {
              bool = true;
              paramBluetoothGattCharacteristic.jnX = bool;
              paramBluetoothGattCharacteristic = ((g)localObject2).jnR;
              if ((paramArrayOfByte[0] & 0x2) == 0) {
                break label916;
              }
              bool = true;
              paramBluetoothGattCharacteristic.jnY = bool;
              paramBluetoothGattCharacteristic = ((g)localObject2).jnR;
              if ((paramArrayOfByte[0] & 0x4) == 0) {
                break label922;
              }
              bool = true;
              paramBluetoothGattCharacteristic.jnZ = bool;
              ((g)localObject2).jnR.joa = ((byte)((paramArrayOfByte[0] & 0x78) >> 3));
              ((g)localObject2).jnR.job = ((byte)(((paramArrayOfByte[0] & 0x80) >> 7) + ((paramArrayOfByte[1] & 0x3) << 1)));
              str = g.TAG;
              if (!((g)localObject2).jnR.jnX) {
                break label928;
              }
              paramBluetoothGattCharacteristic = "true";
              if (!((g)localObject2).jnR.jnY) {
                break label935;
              }
              paramArrayOfByte = "true";
              if (!((g)localObject2).jnR.jnZ) {
                break label942;
              }
              localObject1 = "true";
              w.d(str, "timestampSupported = %s, multipleUsersSupported = %s, BMISupported = %s, weightResolution = %d, heightResolution = %d", new Object[] { paramBluetoothGattCharacteristic, paramArrayOfByte, localObject1, Byte.valueOf(((g)localObject2).jnR.joa), Byte.valueOf(((g)localObject2).jnR.job) });
            }
          }
          label916:
          label922:
          label928:
          label935:
          label942:
          while (!((g)localObject2).jmF.equalsIgnoreCase(g.jmv)) {
            for (;;)
            {
              String str;
              i = 1;
              break;
              bool = false;
              continue;
              bool = false;
              continue;
              bool = false;
              continue;
              paramBluetoothGattCharacteristic = "false";
              continue;
              paramArrayOfByte = "false";
              continue;
              localObject1 = "false";
            }
          }
          k = paramArrayOfByte[0];
          if ((k & 0x2) == 0) {
            break label3957;
          }
        }
      }
    }
    label1073:
    label1147:
    label1201:
    label1324:
    label1427:
    label1433:
    label1598:
    label2174:
    label2605:
    label2684:
    label2754:
    label2820:
    label2924:
    label2936:
    label2948:
    label2960:
    label3070:
    label3121:
    label3191:
    label3359:
    label3373:
    label3385:
    label3397:
    label3900:
    label3915:
    label3952:
    label3957:
    for (j = 10;; j = 3)
    {
      i = j;
      if ((k & 0x4) != 0) {
        i = j + 1;
      }
      j = i;
      if ((k & 0x8) != 0) {
        j = i + 4;
      }
      if (j > paramArrayOfByte.length)
      {
        w.e(g.TAG, "data len is not enough for parse. current len = %d, needed len = %d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(j) });
        i = 0;
        break label584;
      }
      ((g)localObject2).jnS = new g.b();
      paramBluetoothGattCharacteristic = ((g)localObject2).jnS;
      if ((k & 0x1) != 0)
      {
        bool = true;
        paramBluetoothGattCharacteristic.jnT = bool;
        ((g)localObject2).jnS.jnU = ((paramArrayOfByte[1] & 0xFF) + ((paramArrayOfByte[2] & 0xFF) << 8));
        if ((k & 0x2) == 0) {
          break label3952;
        }
        ((g)localObject2).jnS.jnV = new g.a();
        paramBluetoothGattCharacteristic = ((g)localObject2).jnS.jnV;
        localObject1 = g.TAG;
        if (paramArrayOfByte != null) {
          break label1427;
        }
        i = 0;
        w.d((String)localObject1, "data size = %d, offset = %d, lenght = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(3), Integer.valueOf(7) });
        if ((paramArrayOfByte != null) && (paramArrayOfByte.length >= 10)) {
          break label1433;
        }
        w.e(g.TAG, "data input error");
      }
      for (i = 10;; i = 3)
      {
        j = i;
        if ((k & 0x4) != 0)
        {
          ((g)localObject2).jnS.jmV = (paramArrayOfByte[i] & 0xFF);
          j = i + 1;
        }
        if ((k & 0x8) != 0)
        {
          ((g)localObject2).jnS.jnW = ((paramArrayOfByte[j] & 0xFF) + ((paramArrayOfByte[(j + 1)] & 0xFF) << 8));
          i = j + 2;
          paramBluetoothGattCharacteristic = ((g)localObject2).jnS;
          j = paramArrayOfByte[i];
          paramBluetoothGattCharacteristic.mHeight = (((paramArrayOfByte[(i + 1)] & 0xFF) << 8) + (j & 0xFF));
        }
        localObject1 = g.TAG;
        if (((g)localObject2).jnS.jnT)
        {
          paramBluetoothGattCharacteristic = "lb&inch";
          i = ((g)localObject2).jnS.jnU;
          if (((g)localObject2).jnS.jnV != null) {
            break label1598;
          }
        }
        for (paramArrayOfByte = "null";; paramArrayOfByte = "object")
        {
          w.d((String)localObject1, "WeightAndHeightUnit = %s, Weight = %d, TimeStamp = %s, UserId = %d, BMI = %d, Height = %d", new Object[] { paramBluetoothGattCharacteristic, Integer.valueOf(i), paramArrayOfByte, Integer.valueOf(((g)localObject2).jnS.jmV), Integer.valueOf(((g)localObject2).jnS.jnW), Integer.valueOf(((g)localObject2).jnS.mHeight) });
          break;
          bool = false;
          break label1073;
          i = paramArrayOfByte.length;
          break label1147;
          paramBluetoothGattCharacteristic.jnc = ((paramArrayOfByte[3] & 0xFF) + ((paramArrayOfByte[4] & 0xFF) << 8));
          paramBluetoothGattCharacteristic.jnd = (paramArrayOfByte[5] & 0xFF);
          paramBluetoothGattCharacteristic.jne = (paramArrayOfByte[6] & 0xFF);
          paramBluetoothGattCharacteristic.jnf = (paramArrayOfByte[7] & 0xFF);
          paramBluetoothGattCharacteristic.jng = (paramArrayOfByte[8] & 0xFF);
          paramBluetoothGattCharacteristic.jnh = (paramArrayOfByte[9] & 0xFF);
          w.d(g.TAG, "year = %d, month = %d, day = %d, hours = %d, minutes = %d, seconds = %d", new Object[] { Integer.valueOf(paramBluetoothGattCharacteristic.jnc), Integer.valueOf(paramBluetoothGattCharacteristic.jnd), Integer.valueOf(paramBluetoothGattCharacteristic.jne), Integer.valueOf(paramBluetoothGattCharacteristic.jnf), Integer.valueOf(paramBluetoothGattCharacteristic.jng), Integer.valueOf(paramBluetoothGattCharacteristic.jnh) });
          break label1201;
          paramBluetoothGattCharacteristic = "kg&meter";
          break label1324;
        }
        w.e(TAG, "parse weight scale data error");
        paramBluetoothGattCharacteristic = null;
        break;
        int m;
        if ((0L != (0x4 & l)) && ((((String)localObject1).equalsIgnoreCase(d.jmH)) || (((String)localObject1).equalsIgnoreCase(d.jnj)) || (((String)localObject1).equalsIgnoreCase(d.jnk))))
        {
          paramBluetoothGattCharacteristic = new d();
          if ((localObject1 == null) || (((String)localObject1).length() <= 0) || (paramArrayOfByte == null)) {
            w.e(d.TAG, "characteristicUuid or data is null");
          }
          for (;;)
          {
            if (i != 0)
            {
              paramBluetoothGattCharacteristic = com.tencent.mm.plugin.exdevice.j.b.aW(paramBluetoothGattCharacteristic);
              break;
              paramBluetoothGattCharacteristic.jmF = ((String)localObject1);
              k = paramArrayOfByte.length;
              if (paramBluetoothGattCharacteristic.jmF.equalsIgnoreCase(d.jmH))
              {
                if (paramArrayOfByte.length < 2)
                {
                  w.e(d.TAG, "Received data length is not right:" + k);
                  continue;
                }
                paramBluetoothGattCharacteristic.jnr = new d.a(paramBluetoothGattCharacteristic);
                m = paramArrayOfByte[0];
                w.d(d.TAG, "flag=" + m);
                if (((m & 0x1) == 1) && (k >= 3))
                {
                  w.d(d.TAG, "Value Format = uint16");
                  i = paramArrayOfByte[2];
                  paramBluetoothGattCharacteristic.jnr.jns = ((i << 8 & 0xFF00 & 0xFF00) + (paramArrayOfByte[1] & 0xFF));
                  i = 3;
                  w.v(d.TAG, "Data received from HR " + paramBluetoothGattCharacteristic.jnr.jns);
                  if ((m & 0x6) != 4) {
                    break label2174;
                  }
                  w.d(d.TAG, "Sensor Contact feature is supported, but contact is not detected");
                  paramBluetoothGattCharacteristic.jnr.jnt = 1;
                  j = i;
                  if ((m & 0x8) == 8)
                  {
                    j = i;
                    if (k >= i + 2)
                    {
                      w.d(d.TAG, "Energy Expend Present");
                      j = paramArrayOfByte[(i + 1)] << 8 & 0xFF00;
                      paramBluetoothGattCharacteristic.jnr.jnu = ((paramArrayOfByte[i] & 0xFF) + (j & 0xFF00));
                      w.v("H7ConnectThread", "energyExp from HR energyExph " + j + " " + paramBluetoothGattCharacteristic.jnr.jnu);
                      j = i + 2;
                    }
                  }
                  if (((m & 0x10) == 16) && (k >= j + 2))
                  {
                    w.d(d.TAG, "RR Interval Present");
                    i = (paramArrayOfByte[(j + 1)] & 0xFF) << 8;
                    paramBluetoothGattCharacteristic.jnr.jnv = ((paramArrayOfByte[j] & 0xFF) + (i & 0xFF00));
                    w.v(d.TAG, "rrInterval from HR rrIntervalh" + i + " " + paramBluetoothGattCharacteristic.jnr.jnv);
                  }
                }
              }
              while (!paramBluetoothGattCharacteristic.jmF.equalsIgnoreCase(d.jnj)) {
                for (;;)
                {
                  i = 1;
                  break;
                  if (k >= 2)
                  {
                    w.d(d.TAG, "Value Format = uint8");
                    paramBluetoothGattCharacteristic.jnr.jns = (paramArrayOfByte[1] & 0xFF);
                    i = 2;
                  }
                  else
                  {
                    w.d(d.TAG, "receive data error");
                    break;
                    if ((m & 0x6) == 6)
                    {
                      w.d(d.TAG, "Sensor Contact feature is supported and contact is detected");
                      paramBluetoothGattCharacteristic.jnr.jnt = 2;
                    }
                    else
                    {
                      w.d(d.TAG, "Sensor Contact feature is not supported in the current connection");
                      paramBluetoothGattCharacteristic.jnr.jnt = 0;
                    }
                  }
                }
              }
              switch (paramArrayOfByte[0])
              {
              default: 
                paramBluetoothGattCharacteristic.jnq = "Unknown";
              }
              for (;;)
              {
                w.d(d.TAG, "position=" + paramBluetoothGattCharacteristic.jnq);
                break;
                paramBluetoothGattCharacteristic.jnq = "Other";
                continue;
                paramBluetoothGattCharacteristic.jnq = "Chest";
                continue;
                paramBluetoothGattCharacteristic.jnq = "Wrist";
                continue;
                paramBluetoothGattCharacteristic.jnq = "Finger";
                continue;
                paramBluetoothGattCharacteristic.jnq = "Hand";
                continue;
                paramBluetoothGattCharacteristic.jnq = "Ear Lobe";
                continue;
                paramBluetoothGattCharacteristic.jnq = "Foot";
              }
            }
          }
          w.e(TAG, "parse heart rate data error");
          paramBluetoothGattCharacteristic = null;
          break;
        }
        if ((0L != (0x8 & l)) && ((((String)localObject1).equalsIgnoreCase(b.jmH)) || (((String)localObject1).equalsIgnoreCase(b.jmI)) || (((String)localObject1).equalsIgnoreCase(b.jmJ))))
        {
          paramBluetoothGattCharacteristic = new b();
          if ((localObject1 == null) || (((String)localObject1).length() <= 0) || (paramArrayOfByte == null))
          {
            w.e(b.TAG, "characteristicUuid or data is null");
            i = j;
          }
          for (;;)
          {
            if (i != 0)
            {
              paramBluetoothGattCharacteristic = com.tencent.mm.plugin.exdevice.j.b.aW(paramBluetoothGattCharacteristic);
              break;
              paramBluetoothGattCharacteristic.jmF = ((String)localObject1);
              k = paramArrayOfByte.length;
              if (paramBluetoothGattCharacteristic.jmF.equalsIgnoreCase(b.jmH))
              {
                if (k < 7)
                {
                  w.e(b.TAG, "data len is not right.");
                  i = j;
                  continue;
                }
                paramBluetoothGattCharacteristic.jmP = new b.b(paramBluetoothGattCharacteristic);
                m = paramArrayOfByte[0];
                w.d(b.TAG, "flag=" + m);
                if ((m & 0x1) != 0)
                {
                  w.d(b.TAG, "the value unit is kPa.");
                  paramBluetoothGattCharacteristic.jmP.jmS = true;
                  paramBluetoothGattCharacteristic.jmP.jmZ = b.s(paramArrayOfByte, 1);
                  paramBluetoothGattCharacteristic.jmP.jna = b.s(paramArrayOfByte, 3);
                  paramBluetoothGattCharacteristic.jmP.jnb = b.s(paramArrayOfByte, 5);
                  i = 7;
                  if (((m & 0x2) == 0) || (k < 14)) {
                    break label2924;
                  }
                  w.d(b.TAG, "TimeStamp Present.");
                  paramBluetoothGattCharacteristic.jmP.jmX.t(paramArrayOfByte, 7);
                  i = 14;
                  if (((m & 0x4) == 0) || (k < i + 2)) {
                    break label2936;
                  }
                  w.d(b.TAG, "PulseRate Present.");
                  paramBluetoothGattCharacteristic.jmP.jmU = ((int)b.s(paramArrayOfByte, i));
                  i += 2;
                  w.d(b.TAG, "PulseRate =" + paramBluetoothGattCharacteristic.jmP.jmU);
                  if ((m & 0x8) == 0) {
                    break label2948;
                  }
                  w.d(b.TAG, "UserId Present.");
                  localObject1 = paramBluetoothGattCharacteristic.jmP;
                  j = i + 1;
                  ((b.b)localObject1).jmV = paramArrayOfByte[i];
                  w.d(b.TAG, "UserId = " + paramBluetoothGattCharacteristic.jmP.jmV);
                  i = j;
                  if ((m & 0x10) == 0) {
                    break label2960;
                  }
                  w.d(b.TAG, "MeasurementStatus Present.");
                  j = paramArrayOfByte[(i + 1)];
                  paramBluetoothGattCharacteristic.jmP.jmW = ((paramArrayOfByte[i] & 0xFF) + (j << 8 & 0xFF00 & 0xFF00));
                  w.d(b.TAG, "MeasurementStatus = " + paramBluetoothGattCharacteristic.jmP.jmW);
                }
              }
              for (;;)
              {
                i = 1;
                break;
                w.d(b.TAG, "the value unit is mmHg.");
                paramBluetoothGattCharacteristic.jmP.jmS = false;
                break label2605;
                w.d(b.TAG, "TimeStamp not Present.");
                break label2684;
                w.d(b.TAG, "PulseRate not Present.");
                break label2754;
                w.d(b.TAG, "UserId not Present.");
                break label2820;
                w.d(b.TAG, "MeasurementStatus not Present.");
                continue;
                if (paramBluetoothGattCharacteristic.jmF.equalsIgnoreCase(b.jmI))
                {
                  if (k < 3)
                  {
                    w.e(b.TAG, "data len is not right.");
                    i = j;
                    break;
                  }
                  paramBluetoothGattCharacteristic.jmQ = new b.a(paramBluetoothGattCharacteristic);
                  m = paramArrayOfByte[0];
                  w.d(b.TAG, "flag=" + m);
                  if ((m & 0x1) != 0)
                  {
                    w.d(b.TAG, "the value unit is kPa.");
                    paramBluetoothGattCharacteristic.jmQ.jmS = true;
                    paramBluetoothGattCharacteristic.jmQ.jmT = b.s(paramArrayOfByte, 1);
                    if (((m & 0x2) == 0) || (k < 10)) {
                      break label3359;
                    }
                    w.d(b.TAG, "TimeStamp Present.");
                    paramBluetoothGattCharacteristic.jmQ.jmX.t(paramArrayOfByte, 3);
                    i = 10;
                    if (((m & 0x4) == 0) || (k < i + 2)) {
                      break label3373;
                    }
                    w.d(b.TAG, "PulseRate Present.");
                    paramBluetoothGattCharacteristic.jmQ.jmU = ((int)b.s(paramArrayOfByte, i));
                    i += 2;
                    w.d(b.TAG, "PulseRate =" + paramBluetoothGattCharacteristic.jmQ.jmU);
                    if ((m & 0x8) == 0) {
                      break label3385;
                    }
                    w.d(b.TAG, "UserId Present.");
                    localObject1 = paramBluetoothGattCharacteristic.jmQ;
                    j = i + 1;
                    ((b.a)localObject1).jmV = paramArrayOfByte[i];
                    w.d(b.TAG, "UserId = " + paramBluetoothGattCharacteristic.jmQ.jmV);
                    i = j;
                  }
                  for (;;)
                  {
                    if ((m & 0x10) == 0) {
                      break label3397;
                    }
                    w.d(b.TAG, "MeasurementStatus Present.");
                    j = paramArrayOfByte[(i + 1)];
                    paramBluetoothGattCharacteristic.jmQ.jmW = ((paramArrayOfByte[i] & 0xFF) + (j << 8 & 0xFF00 & 0xFF00));
                    w.d(b.TAG, "MeasurementStatus = " + paramBluetoothGattCharacteristic.jmQ.jmW);
                    break;
                    w.d(b.TAG, "the value unit is mmHg.");
                    paramBluetoothGattCharacteristic.jmQ.jmS = false;
                    break label3070;
                    w.d(b.TAG, "TimeStamp not Present.");
                    i = 3;
                    break label3121;
                    w.d(b.TAG, "PulseRate not Present.");
                    break label3191;
                    w.d(b.TAG, "UserId not Present.");
                  }
                  w.d(b.TAG, "MeasurementStatus not Present.");
                  continue;
                }
                if (paramBluetoothGattCharacteristic.jmF.equalsIgnoreCase(b.jmJ))
                {
                  w.d(b.TAG, "Blood Pressure Feature Characteristic.");
                  if (k < 2)
                  {
                    w.e(b.TAG, "data len is not right.");
                    i = j;
                    break;
                  }
                  paramBluetoothGattCharacteristic.jmR = ((paramArrayOfByte[1] << 8 & 0xFF00 & 0xFF00) + (paramArrayOfByte[0] & 0xFF));
                  w.d(b.TAG, "bloodPressureFeatureParameters=" + paramBluetoothGattCharacteristic.jmR);
                }
              }
            }
          }
          w.e(TAG, "parse blood pressure data error");
          paramBluetoothGattCharacteristic = null;
          break;
        }
        if ((0L != (l & 0x10)) && ((((String)localObject1).equalsIgnoreCase(e.jnx)) || (((String)localObject1).equalsIgnoreCase(e.jny)) || (((String)localObject1).equalsIgnoreCase(e.jnz)) || (((String)localObject1).equalsIgnoreCase(e.jnA))))
        {
          paramBluetoothGattCharacteristic = new e();
          if ((localObject1 == null) || (((String)localObject1).length() <= 0) || (paramArrayOfByte == null))
          {
            w.e(e.TAG, "characteristicUuid or data is null");
            i = k;
          }
          for (;;)
          {
            if (i == 0) {
              break label3915;
            }
            paramBluetoothGattCharacteristic = com.tencent.mm.plugin.exdevice.j.b.aW(paramBluetoothGattCharacteristic);
            break;
            paramBluetoothGattCharacteristic.jmF = ((String)localObject1);
            if (paramBluetoothGattCharacteristic.jmF.equalsIgnoreCase(e.jnx))
            {
              if (paramArrayOfByte.length != 3)
              {
                w.e(e.TAG, "Data length incorrect");
                i = k;
              }
              else
              {
                paramBluetoothGattCharacteristic.jnB = paramArrayOfByte[0];
                paramBluetoothGattCharacteristic.jnC = paramArrayOfByte[1];
                paramBluetoothGattCharacteristic.jnD = paramArrayOfByte[2];
              }
            }
            else
            {
              for (;;)
              {
                i = 1;
                break;
                if (paramBluetoothGattCharacteristic.jmF.equalsIgnoreCase(e.jny))
                {
                  if (paramArrayOfByte.length != 1)
                  {
                    w.e(e.TAG, "Data length incorrect");
                    i = k;
                    break;
                  }
                  paramBluetoothGattCharacteristic.jnE = paramArrayOfByte[0];
                  continue;
                }
                if (paramBluetoothGattCharacteristic.jmF.equalsIgnoreCase(e.jnz))
                {
                  if (paramArrayOfByte.length < 2)
                  {
                    w.e(e.TAG, "Data length incorrect");
                    i = k;
                    break;
                  }
                  paramBluetoothGattCharacteristic.jnF[0] = paramArrayOfByte[0];
                  paramBluetoothGattCharacteristic.jnF[1] = paramArrayOfByte[1];
                  continue;
                }
                if (!paramBluetoothGattCharacteristic.jmF.equalsIgnoreCase(e.jnA)) {
                  break label3900;
                }
                if (paramArrayOfByte.length < 4)
                {
                  w.e(e.TAG, "Data length incorrect");
                  i = k;
                  break;
                }
                paramBluetoothGattCharacteristic.jnG = ((paramArrayOfByte[0] & 0xFF) + ((paramArrayOfByte[1] & 0xFF) << 8));
                paramBluetoothGattCharacteristic.jnI = paramArrayOfByte[2];
                paramBluetoothGattCharacteristic.jnH = paramArrayOfByte[3];
                if (paramArrayOfByte.length > 4)
                {
                  paramBluetoothGattCharacteristic.jnJ = new byte[paramArrayOfByte.length - 4];
                  System.arraycopy(paramArrayOfByte, 4, paramBluetoothGattCharacteristic.jnJ, 0, paramArrayOfByte.length - 4);
                }
                else
                {
                  paramBluetoothGattCharacteristic.jnJ = null;
                }
              }
              w.e(e.TAG, "characteristicUuid is incorrect");
              i = k;
            }
          }
          w.e(TAG, "parse light data error");
          paramBluetoothGattCharacteristic = null;
          break;
        }
        w.e(TAG, "unknown characteristic uuid = %s", new Object[] { localObject1 });
        paramBluetoothGattCharacteristic = null;
        break;
      }
    }
  }
  
  public static String aS(long paramLong)
  {
    GMTrace.i(4819892830208L, 35911);
    Object localObject = jlX.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (((Long)jlX.get(str)).longValue() == paramLong)
      {
        GMTrace.o(4819892830208L, 35911);
        return str;
      }
    }
    if (jni.containsValue(Long.valueOf(paramLong)))
    {
      localObject = h.jmk;
      GMTrace.o(4819892830208L, 35911);
      return (String)localObject;
    }
    GMTrace.o(4819892830208L, 35911);
    return null;
  }
  
  public static boolean ab(byte[] paramArrayOfByte)
  {
    GMTrace.i(4819758612480L, 35910);
    if (bg.bq(paramArrayOfByte))
    {
      w.e(TAG, "parseBroadcastServiceUuid error. broadcast data is null or nil");
      GMTrace.o(4819758612480L, 35910);
      return false;
    }
    int i = 0;
    int k;
    int j;
    label216:
    Object localObject;
    while ((i >= 0) && (i < paramArrayOfByte.length))
    {
      k = i + 1;
      i = paramArrayOfByte[i];
      if (k + i > paramArrayOfByte.length)
      {
        w.w(TAG, "broadcast data len is not enough. offset = %d, current len = %d, broadcast len = %d", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(paramArrayOfByte.length) });
        GMTrace.o(4819758612480L, 35910);
        return false;
      }
      if (i <= 0)
      {
        w.w(TAG, "current part of data's len = %d.", new Object[] { Integer.valueOf(i) });
        GMTrace.o(4819758612480L, 35910);
        return false;
      }
      j = k + 1;
      int n = paramArrayOfByte[k];
      k = i - 1;
      i = k;
      int m = j;
      switch (n)
      {
      case 0: 
      case 1: 
      case 4: 
      case 5: 
      default: 
        i = k + j;
        break;
      case 2: 
      case 3: 
        while (2 <= i)
        {
          k = m + 1;
          j = paramArrayOfByte[m];
          m = k + 1;
          k = paramArrayOfByte[k];
          i -= 2;
          localObject = String.format("%08x-0000-1000-8000-00805f9b34fb", new Object[] { Integer.valueOf((k & 0xFF) << 8 | j & 0xFF) });
          w.d(TAG, "find 16-bit broacast service = %s", new Object[] { localObject });
          if (jlX.containsKey(localObject))
          {
            GMTrace.o(4819758612480L, 35910);
            return true;
          }
        }
        i += m;
        continue;
        label331:
        j += 16;
        i -= 16;
      }
    }
    for (;;)
    {
      if (16 <= i) {
        try
        {
          localObject = ByteBuffer.wrap(paramArrayOfByte, j, 16).order(ByteOrder.LITTLE_ENDIAN);
          long l = ((ByteBuffer)localObject).getLong();
          localObject = new UUID(((ByteBuffer)localObject).getLong(), l).toString();
          w.d(TAG, "find 128-bit broacast service = %s", new Object[] { localObject });
          boolean bool = jlX.containsKey(localObject);
          if (!bool) {
            break label331;
          }
          GMTrace.o(4819758612480L, 35910);
          return true;
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
          localIndexOutOfBoundsException = localIndexOutOfBoundsException;
          w.e("BlueToothDeviceFilter.parseUUID", localIndexOutOfBoundsException.toString());
          j += 16;
          i -= 16;
          continue;
        }
        finally {}
      }
      i = j + i;
      break;
      w.i(TAG, "Manufacturer Specific Data size = %s", new Object[] { Integer.valueOf(k) });
      w.i(TAG, "Manufacturer Specific Data = %s", new Object[] { com.tencent.mm.plugin.exdevice.j.b.al(Arrays.copyOfRange(paramArrayOfByte, j, j + k)) });
      break label216;
      GMTrace.o(4819758612480L, 35910);
      return false;
      i = k;
    }
  }
  
  public static boolean b(BluetoothGattService paramBluetoothGattService)
  {
    GMTrace.i(4820161265664L, 35913);
    if (paramBluetoothGattService == null)
    {
      w.e(TAG, "service is null");
      GMTrace.o(4820161265664L, 35913);
      return false;
    }
    long l = a(paramBluetoothGattService);
    BluetoothGattCharacteristic localBluetoothGattCharacteristic;
    int i;
    if (0L != (1L & l))
    {
      if (paramBluetoothGattService == null)
      {
        w.e(TAG, "service is null");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmn));
      if (localBluetoothGattCharacteristic == null)
      {
        w.e(TAG, "no step measurement characteristic found");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      i = localBluetoothGattCharacteristic.getProperties();
      w.d(TAG, "step measurement characteristic properties = %d", new Object[] { Integer.valueOf(i) });
      if (((i & 0x30) == 0) || ((i & 0x2) == 0))
      {
        w.e(TAG, "step measurement characteristic has incorrect proterties(%d)", new Object[] { Integer.valueOf(i) });
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmo));
      if (paramBluetoothGattService != null)
      {
        i = paramBluetoothGattService.getProperties();
        if (((i & 0x2) == 0) || ((i & 0x20) == 0))
        {
          w.e(TAG, "step target characteristic has incorrect proterties(%d)", new Object[] { Integer.valueOf(i) });
          GMTrace.o(4820161265664L, 35913);
          return false;
        }
      }
      GMTrace.o(4820161265664L, 35913);
      return true;
    }
    if (0L != (0x2 & l))
    {
      if (paramBluetoothGattService == null)
      {
        w.e(TAG, "service is null");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmu));
      if (localBluetoothGattCharacteristic == null)
      {
        w.e(TAG, "weight scale feature characteristic not found");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      i = localBluetoothGattCharacteristic.getProperties();
      if ((i & 0x2) == 0)
      {
        w.e(TAG, "weight scale feature characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmv));
      if (paramBluetoothGattService == null)
      {
        w.e(TAG, "weight measurement characteristic not found");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      i = paramBluetoothGattService.getProperties();
      if ((i & 0x20) == 0)
      {
        w.e(TAG, "weight measurement characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      GMTrace.o(4820161265664L, 35913);
      return true;
    }
    if (0L != (0x4 & l))
    {
      if (paramBluetoothGattService == null)
      {
        w.e(TAG, "service is null");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmx));
      if (localBluetoothGattCharacteristic == null)
      {
        w.e(TAG, "heart rate measurement characteristic not found");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      i = localBluetoothGattCharacteristic.getProperties();
      if ((i & 0x10) == 0)
      {
        w.e(TAG, "heart rate measurement characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(16) });
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmy));
      if (localBluetoothGattCharacteristic != null)
      {
        i = localBluetoothGattCharacteristic.getProperties();
        if ((i & 0x2) == 0)
        {
          w.e(TAG, "heart rate body sensor location characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
          GMTrace.o(4820161265664L, 35913);
          return false;
        }
      }
      paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmz));
      if (paramBluetoothGattService != null)
      {
        i = paramBluetoothGattService.getProperties();
        if ((i & 0x8) == 0)
        {
          w.e(TAG, "heart rate control point characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(8) });
          GMTrace.o(4820161265664L, 35913);
          return false;
        }
      }
      GMTrace.o(4820161265664L, 35913);
      return true;
    }
    if (0L != (0x8 & l))
    {
      if (paramBluetoothGattService == null)
      {
        w.e(TAG, "service is null");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmB));
      if (localBluetoothGattCharacteristic == null)
      {
        w.e(TAG, "blood pressure measurement characteristic not found");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      i = localBluetoothGattCharacteristic.getProperties();
      if ((i & 0x20) == 0)
      {
        w.e(TAG, "blood pressure measurement characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmD));
      if (localBluetoothGattCharacteristic == null)
      {
        w.e(TAG, "blood pressure feature characteristic not found");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      i = localBluetoothGattCharacteristic.getProperties();
      if ((i & 0x2) == 0)
      {
        w.e(TAG, "blood pressure feature characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmC));
      if (paramBluetoothGattService != null)
      {
        i = paramBluetoothGattService.getProperties();
        if ((i & 0x10) == 0)
        {
          w.e(TAG, "blood pressure intermediate cuff pressure characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(16) });
          GMTrace.o(4820161265664L, 35913);
          return false;
        }
      }
      GMTrace.o(4820161265664L, 35913);
      return true;
    }
    if (0L != (l & 0x10))
    {
      if (paramBluetoothGattService == null)
      {
        w.e(TAG, "service is null");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmp));
      if (localBluetoothGattCharacteristic == null)
      {
        w.e(TAG, "light color characteristic not found");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      i = localBluetoothGattCharacteristic.getProperties();
      if (((i & 0x20) == 0) || ((i & 0x10) == 0) || ((i & 0x2) == 0) || ((i & 0x8) == 0))
      {
        w.e(TAG, "light color characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmq));
      if (localBluetoothGattCharacteristic == null)
      {
        w.e(TAG, "light work state characteristic not found");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      i = localBluetoothGattCharacteristic.getProperties();
      if (((i & 0x20) == 0) || ((i & 0x2) == 0) || ((i & 0x8) == 0))
      {
        w.e(TAG, "light work state characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jmr));
      if (localBluetoothGattCharacteristic == null)
      {
        w.e(TAG, "light state changed characteristic not found");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      i = localBluetoothGattCharacteristic.getProperties();
      if ((i & 0x20) == 0)
      {
        w.e(TAG, "light state changed characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jms));
      if (paramBluetoothGattService == null)
      {
        w.e(TAG, "control point characteristic not found");
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      i = paramBluetoothGattService.getProperties();
      if (((i & 0x20) == 0) || ((i & 0x8) == 0))
      {
        w.e(TAG, "control point characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
        GMTrace.o(4820161265664L, 35913);
        return false;
      }
      GMTrace.o(4820161265664L, 35913);
      return true;
    }
    GMTrace.o(4820161265664L, 35913);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\g\a\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */