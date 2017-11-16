package com.d.a.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

final class u
  extends d
  implements SensorEventListener
{
  private static final int aHA;
  private static final int aHB;
  private static u aHU;
  private SensorManager aDS = null;
  Sensor aHC;
  Sensor aHD;
  Sensor aHE;
  Sensor aHF;
  Sensor aHG = null;
  private long aHH = 0L;
  private boolean aHI = true;
  private float[][] aHJ = (float[][])Array.newInstance(Float.TYPE, new int[] { 6, 9 });
  float[][] aHK = (float[][])Array.newInstance(Float.TYPE, new int[] { 6, 9 });
  private float[][] aHL = (float[][])Array.newInstance(Float.TYPE, new int[] { 6, 9 });
  float[][] aHM = (float[][])Array.newInstance(Float.TYPE, new int[] { 6, 3 });
  float[][] aHN = (float[][])Array.newInstance(Float.TYPE, new int[] { 6, 3 });
  float[][] aHO = (float[][])Array.newInstance(Float.TYPE, new int[] { 6, 3 });
  float[][] aHP = (float[][])Array.newInstance(Float.TYPE, new int[] { 6, 3 });
  private float[] aHQ = new float[4];
  private float[][] aHR = (float[][])Array.newInstance(Float.TYPE, new int[] { 6, 3 });
  private float[][] aHS = (float[][])Array.newInstance(Float.TYPE, new int[] { 6, 3 });
  private float[][] aHT = (float[][])Array.newInstance(Float.TYPE, new int[] { 6, 3 });
  boolean aHV;
  private c aHW;
  boolean[] aHX = new boolean[6];
  int[] aHY = new int[6];
  float[] aHZ = new float[6];
  float[] aIa = new float[6];
  float[] aIb = { NaN.0F, NaN.0F, NaN.0F, NaN.0F, NaN.0F, NaN.0F };
  float[][] aIc = (float[][])Array.newInstance(Float.TYPE, new int[] { 6, 20 });
  final d aId = new d();
  final f aIe = new f();
  final a aIf = new a();
  
  static
  {
    int i = Math.round(50000.0F);
    aHA = i;
    aHB = i;
  }
  
  private static void a(float[] paramArrayOfFloat, float[][] paramArrayOfFloat1)
  {
    paramArrayOfFloat1[0][0] = (-paramArrayOfFloat[1]);
    paramArrayOfFloat1[0][1] = paramArrayOfFloat[0];
    paramArrayOfFloat1[0][2] = paramArrayOfFloat[2];
    paramArrayOfFloat1[1][0] = paramArrayOfFloat[1];
    paramArrayOfFloat1[1][1] = (-paramArrayOfFloat[0]);
    paramArrayOfFloat1[1][2] = paramArrayOfFloat[2];
    System.arraycopy(paramArrayOfFloat, 0, paramArrayOfFloat1[2], 0, 3);
    paramArrayOfFloat1[3][0] = (-paramArrayOfFloat[0]);
    paramArrayOfFloat1[3][1] = (-paramArrayOfFloat[1]);
    paramArrayOfFloat1[3][2] = paramArrayOfFloat[2];
    paramArrayOfFloat1[4][0] = paramArrayOfFloat[0];
    paramArrayOfFloat1[4][1] = paramArrayOfFloat[2];
    paramArrayOfFloat1[4][2] = (-paramArrayOfFloat[1]);
    paramArrayOfFloat1[5][0] = paramArrayOfFloat[0];
    paramArrayOfFloat1[5][1] = (-paramArrayOfFloat[2]);
    paramArrayOfFloat1[5][2] = paramArrayOfFloat[1];
  }
  
  private static void a(float[][] paramArrayOfFloat1, float[][] paramArrayOfFloat2)
  {
    int i = 0;
    for (;;)
    {
      if (i > 5) {
        return;
      }
      SensorManager.getOrientation(paramArrayOfFloat1[i], paramArrayOfFloat2[i]);
      i += 1;
    }
  }
  
  @TargetApi(19)
  private static boolean a(SensorManager paramSensorManager, SensorEventListener paramSensorEventListener, int paramInt1, int paramInt2, Handler paramHandler, Sensor... paramVarArgs)
  {
    for (;;)
    {
      int i;
      int k;
      int j;
      try
      {
        if (Build.VERSION.SDK_INT < 19) {
          break label98;
        }
        i = 1;
        k = paramVarArgs.length;
        j = 0;
      }
      catch (Error paramSensorManager)
      {
        Sensor localSensor;
        boolean bool;
        return false;
      }
      catch (Exception paramSensorManager)
      {
        return false;
      }
      localSensor = paramVarArgs[j];
      if (i != 0)
      {
        bool = paramSensorManager.registerListener(paramSensorEventListener, localSensor, paramInt1, paramInt2, paramHandler);
        if (!bool)
        {
          paramSensorManager.unregisterListener(paramSensorEventListener);
          return false;
        }
      }
      else
      {
        bool = paramSensorManager.registerListener(paramSensorEventListener, localSensor, paramInt1, paramHandler);
        continue;
      }
      j += 1;
      if (j >= k)
      {
        return true;
        label98:
        i = 0;
      }
    }
  }
  
  static float[] a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    return new float[] { paramArrayOfFloat1[0] * paramArrayOfFloat2[0] + paramArrayOfFloat1[1] * paramArrayOfFloat2[3] + paramArrayOfFloat1[2] * paramArrayOfFloat2[6], paramArrayOfFloat1[0] * paramArrayOfFloat2[1] + paramArrayOfFloat1[1] * paramArrayOfFloat2[4] + paramArrayOfFloat1[2] * paramArrayOfFloat2[7], paramArrayOfFloat1[0] * paramArrayOfFloat2[2] + paramArrayOfFloat1[1] * paramArrayOfFloat2[5] + paramArrayOfFloat1[2] * paramArrayOfFloat2[8], paramArrayOfFloat1[3] * paramArrayOfFloat2[0] + paramArrayOfFloat1[4] * paramArrayOfFloat2[3] + paramArrayOfFloat1[5] * paramArrayOfFloat2[6], paramArrayOfFloat1[3] * paramArrayOfFloat2[1] + paramArrayOfFloat1[4] * paramArrayOfFloat2[4] + paramArrayOfFloat1[5] * paramArrayOfFloat2[7], paramArrayOfFloat1[3] * paramArrayOfFloat2[2] + paramArrayOfFloat1[4] * paramArrayOfFloat2[5] + paramArrayOfFloat1[5] * paramArrayOfFloat2[8], paramArrayOfFloat1[6] * paramArrayOfFloat2[0] + paramArrayOfFloat1[7] * paramArrayOfFloat2[3] + paramArrayOfFloat1[8] * paramArrayOfFloat2[6], paramArrayOfFloat1[6] * paramArrayOfFloat2[1] + paramArrayOfFloat1[7] * paramArrayOfFloat2[4] + paramArrayOfFloat1[8] * paramArrayOfFloat2[7], paramArrayOfFloat1[6] * paramArrayOfFloat2[2] + paramArrayOfFloat1[7] * paramArrayOfFloat2[5] + paramArrayOfFloat1[8] * paramArrayOfFloat2[8] };
  }
  
  static u ob()
  {
    if (aHU == null) {
      aHU = new u();
    }
    return aHU;
  }
  
  final void P(Context paramContext) {}
  
  final void Q(Context paramContext)
  {
    if (this.aHW != null) {
      this.aHW.stop();
    }
    if (this.aDS != null) {}
    try
    {
      this.aDS.unregisterListener(this);
      this.aDS = null;
      this.aHG = null;
      this.aHF = null;
      this.aHE = null;
      this.aHD = null;
      this.aHC = null;
      this.aHH = 0L;
      this.aHI = true;
      this.aHJ = ((float[][])Array.newInstance(Float.TYPE, new int[] { 6, 9 }));
      this.aHK = ((float[][])Array.newInstance(Float.TYPE, new int[] { 6, 9 }));
      this.aHM = ((float[][])Array.newInstance(Float.TYPE, new int[] { 6, 3 }));
      this.aHN = ((float[][])Array.newInstance(Float.TYPE, new int[] { 6, 3 }));
      this.aHO = ((float[][])Array.newInstance(Float.TYPE, new int[] { 6, 3 }));
      this.aHX = new boolean[6];
      this.aHY = new int[6];
      this.aHZ = new float[6];
      this.aIa = new float[6];
      this.aIb = new float[] { NaN.0F, NaN.0F, NaN.0F, NaN.0F, NaN.0F, NaN.0F };
      this.aIc = ((float[][])Array.newInstance(Float.TYPE, new int[] { 6, 20 }));
      this.aIf.reset();
      this.aId.reset();
      this.aIe.reset();
      return;
    }
    catch (Error paramContext)
    {
      for (;;) {}
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
  
  final void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    if (paramContext == null) {
      try
      {
        throw new Exception("SensorModule: register with null context");
      }
      catch (Exception paramContext)
      {
        this.aHV = false;
      }
    }
    label24:
    label300:
    label390:
    label394:
    for (;;)
    {
      return;
      int i = 0;
      boolean bool;
      if (i > 5)
      {
        this.aDS = ((SensorManager)paramContext.getSystemService("sensor"));
        this.aHC = this.aDS.getDefaultSensor(10);
        this.aHF = this.aDS.getDefaultSensor(9);
        if ((this.aHC == null) || (this.aHF == null)) {
          break label390;
        }
        this.aHG = this.aDS.getDefaultSensor(11);
        if (this.aHG == null) {
          break label300;
        }
        bool = a(this.aDS, this, aHA, aHB, paramHandler, new Sensor[] { this.aHC, this.aHF, this.aHG });
      }
      for (;;)
      {
        if (!bool) {
          break label394;
        }
        this.aHV = true;
        this.aHW = new c(paramHandler);
        if (this.aHW == null) {
          break;
        }
        this.aHW.a(Math.round(50.0F), 1000L);
        return;
        this.aHK[i][0] = 1065353216;
        this.aHK[i][1] = 0;
        this.aHK[i][2] = 0;
        this.aHK[i][3] = 0;
        this.aHK[i][4] = 1065353216;
        this.aHK[i][5] = 0;
        this.aHK[i][6] = 0;
        this.aHK[i][7] = 0;
        this.aHK[i][8] = 1065353216;
        i += 1;
        break label24;
        this.aHD = this.aDS.getDefaultSensor(4);
        this.aHE = this.aDS.getDefaultSensor(2);
        if ((this.aHD != null) && (this.aHE != null)) {
          bool = a(this.aDS, this, aHA, aHB, paramHandler, new Sensor[] { this.aHC, this.aHF, this.aHD, this.aHE });
        } else {
          bool = false;
        }
      }
    }
  }
  
  final void a(Handler paramHandler, d.a parama)
  {
    try
    {
      super.a(paramHandler, parama);
      return;
    }
    finally
    {
      paramHandler = finally;
      throw paramHandler;
    }
  }
  
  final void nC() {}
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    int j = 0;
    int i = 0;
    switch (paramSensorEvent.sensor.getType())
    {
    }
    for (;;)
    {
      return;
      Object localObject3 = new float[16];
      if (this.aHG != null) {}
      float[] arrayOfFloat1;
      for (Object localObject1 = this.aHL;; localObject1 = this.aHK)
      {
        localObject1 = localObject1[2];
        arrayOfFloat1 = new float[16];
        if (localObject1.length == 9)
        {
          arrayOfFloat1[0] = localObject1[0];
          arrayOfFloat1[1] = localObject1[1];
          arrayOfFloat1[2] = localObject1[2];
          arrayOfFloat1[3] = 0.0F;
          arrayOfFloat1[4] = localObject1[3];
          arrayOfFloat1[5] = localObject1[4];
          arrayOfFloat1[6] = localObject1[5];
          arrayOfFloat1[7] = 0.0F;
          arrayOfFloat1[8] = localObject1[6];
          arrayOfFloat1[9] = localObject1[7];
          arrayOfFloat1[10] = localObject1[8];
          arrayOfFloat1[11] = 0.0F;
          arrayOfFloat1[12] = 0.0F;
          arrayOfFloat1[13] = 0.0F;
          arrayOfFloat1[14] = 0.0F;
          arrayOfFloat1[15] = 1.0F;
        }
        Matrix.invertM((float[])localObject3, 0, arrayOfFloat1, 0);
        Matrix.multiplyMV(this.aHQ, 0, (float[])localObject3, 0, new float[] { paramSensorEvent.values[0], paramSensorEvent.values[1], paramSensorEvent.values[2], 0.0F }, 0);
        this.aId.a(this.aHQ, paramSensorEvent.values, this.aHT[2]);
        return;
      }
      a(paramSensorEvent.values, this.aHT);
      if ((this.aHS[2][0] == 0.0F) && (this.aHS[2][1] == 0.0F) && (this.aHS[2][2] == 0.0F)) {
        continue;
      }
      paramSensorEvent = this.aHJ;
      localObject1 = this.aHT;
      localObject3 = this.aHS;
      if ((SensorManager.getRotationMatrix(paramSensorEvent[0], null, localObject1[0], localObject3[0])) && (SensorManager.getRotationMatrix(paramSensorEvent[1], null, localObject1[1], localObject3[1])) && (SensorManager.getRotationMatrix(paramSensorEvent[2], null, localObject1[2], localObject3[2])) && (SensorManager.getRotationMatrix(paramSensorEvent[3], null, localObject1[3], localObject3[3])) && (SensorManager.getRotationMatrix(paramSensorEvent[4], null, localObject1[4], localObject3[4])) && (SensorManager.getRotationMatrix(paramSensorEvent[5], null, localObject1[5], localObject3[5]))) {}
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label596;
        }
        a(this.aHJ, this.aHM);
        if ((this.aHN[2][0] != 0.0F) || (this.aHN[2][1] != 0.0F) || (this.aHN[2][2] != 0.0F)) {
          break;
        }
        paramSensorEvent = this.aHM;
        localObject1 = this.aHN;
        i = 0;
        while (i <= 5)
        {
          System.arraycopy(paramSensorEvent[i], 0, localObject1[i], 0, 3);
          i += 1;
        }
        break;
      }
      label596:
      continue;
      try
      {
        SensorManager.getRotationMatrixFromVector(this.aHL[2], paramSensorEvent.values);
        SensorManager.remapCoordinateSystem(this.aHL[2], 2, 129, this.aHL[0]);
        SensorManager.remapCoordinateSystem(this.aHL[2], 130, 1, this.aHL[1]);
        SensorManager.remapCoordinateSystem(this.aHL[2], 129, 130, this.aHL[3]);
        SensorManager.remapCoordinateSystem(this.aHL[2], 129, 3, this.aHL[4]);
        SensorManager.remapCoordinateSystem(this.aHL[2], 1, 3, this.aHL[5]);
        while (i <= 5)
        {
          SensorManager.getOrientation(this.aHL[i], this.aHP[i]);
          i += 1;
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;)
        {
          if (paramSensorEvent.values.length > 3) {
            SensorManager.getRotationMatrixFromVector(this.aHL[2], new float[] { paramSensorEvent.values[0], paramSensorEvent.values[1], paramSensorEvent.values[2] });
          }
        }
      }
      if ((this.aHM[2][0] == 0.0F) && (this.aHM[2][1] == 0.0F) && (this.aHM[2][2] == 0.0F)) {
        continue;
      }
      Object localObject2;
      float f1;
      if (this.aHI)
      {
        i = 0;
        if (i > 5) {
          this.aHI = false;
        }
      }
      else
      {
        localObject2 = (float[][])Array.newInstance(Float.TYPE, new int[] { 6, 4 });
        if (this.aHH != 0L)
        {
          f1 = (float)(paramSensorEvent.timestamp - this.aHH);
          a(paramSensorEvent.values, this.aHR);
          i = 0;
        }
      }
      label933:
      float f2;
      float f3;
      for (;;)
      {
        if (i > 5)
        {
          this.aHH = paramSensorEvent.timestamp;
          i = j;
          if (i <= 5) {
            break label1170;
          }
          a(this.aHK, this.aHN);
          return;
          localObject2 = this.aHJ[i];
          this.aHK[i] = a(this.aHK[i], (float[])localObject2);
          i += 1;
          break;
        }
        localObject3 = this.aHR[i];
        arrayOfFloat1 = localObject2[i];
        f2 = 1.0E-9F * f1 / 2.0F;
        float[] arrayOfFloat2 = new float[3];
        f3 = (float)Math.sqrt(localObject3[0] * localObject3[0] + localObject3[1] * localObject3[1] + localObject3[2] * localObject3[2]);
        if (f3 > 1.0E-9F)
        {
          localObject3[0] /= f3;
          localObject3[1] /= f3;
          localObject3[2] /= f3;
        }
        f3 *= f2;
        f2 = (float)Math.sin(f3);
        f3 = (float)Math.cos(f3);
        arrayOfFloat2[0] *= f2;
        arrayOfFloat2[1] *= f2;
        arrayOfFloat1[2] = (f2 * arrayOfFloat2[2]);
        arrayOfFloat1[3] = f3;
        i += 1;
      }
      label1170:
      paramSensorEvent = new float[9];
      try
      {
        SensorManager.getRotationMatrixFromVector(paramSensorEvent, localObject2[i]);
        this.aHK[i] = a(this.aHK[i], paramSensorEvent);
        i += 1;
        break label933;
        a(paramSensorEvent.values, this.aHS);
        localObject2 = this.aIf;
        paramSensorEvent = paramSensorEvent.values;
        if (paramSensorEvent.length < 3) {
          continue;
        }
        ((a)localObject2).aIg += 1;
        double d = ((a)localObject2).aIh;
        f1 = paramSensorEvent[0];
        f2 = paramSensorEvent[0];
        f3 = paramSensorEvent[1];
        float f4 = paramSensorEvent[1];
        float f5 = paramSensorEvent[2];
        ((a)localObject2).aIh = ((float)(Math.sqrt(f2 * f1 + f4 * f3 + paramSensorEvent[2] * f5) + d));
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  private static final class a
  {
    int aIg = 0;
    float aIh = 0.0F;
    long aIi = 0L;
    float aIj = 0.0F;
    boolean aIk = false;
    long aIl = 0L;
    float[] aIm = new float[6];
    float[] aIn = new float[6];
    float[] aIo = new float[6];
    float[] aIp = new float[6];
    float[] aIq = new float[6];
    float[] aIr = new float[6];
    public float[] aIs = new float[6];
    public float[] aIt = new float[6];
    public float[] aIu = new float[6];
    float aIv = 0.0F;
    float aIw = Float.NEGATIVE_INFINITY;
    float aIx = Float.POSITIVE_INFINITY;
    public boolean aIy = false;
    
    public final void reset()
    {
      this.aIg = 0;
      this.aIh = 0.0F;
      this.aIi = 0L;
      this.aIj = 0.0F;
      this.aIk = false;
      this.aIl = 0L;
      this.aIm = new float[6];
      this.aIn = new float[6];
      this.aIo = new float[6];
      this.aIv = 0.0F;
      this.aIw = Float.NEGATIVE_INFINITY;
      this.aIx = Float.POSITIVE_INFINITY;
    }
  }
  
  private static final class b
  {
    public float aIA;
    public float aIB;
    public float aIC;
    public float aID;
    public float aIE;
    public float aIF;
    public float aIG;
    public float aIH;
    public float aII;
    public float aIJ;
    public float[] aIK = new float[6];
    public float[] aIL = new float[6];
    public float[] aIM = new float[6];
    public float[] aIN = new float[6];
    public float[] aIO = new float[6];
    public float aIz;
    public long time;
  }
  
  private final class c
    extends e
  {
    c(Handler paramHandler)
    {
      super();
    }
    
    final void nG()
    {
      u localu = u.this;
      int j;
      Object localObject2;
      if ((localu.aHC != null) && (localu.aHD != null) && (localu.aHE != null) && (localu.aHF != null))
      {
        j = 0;
        if (j <= 5) {}
      }
      else
      {
        localObject2 = localu.aId;
        if (localu.aHG == null) {
          break label2524;
        }
      }
      label129:
      label262:
      label302:
      label341:
      label531:
      label601:
      label640:
      label685:
      label724:
      label769:
      label1129:
      label1325:
      label1468:
      label1485:
      label1527:
      label1640:
      label1811:
      label1868:
      label1876:
      label1882:
      label1907:
      label2128:
      label2247:
      label2412:
      label2417:
      label2422:
      label2439:
      label2456:
      label2473:
      label2490:
      label2507:
      label2524:
      for (Object localObject1 = localu.aHP;; localObject1 = localu.aHO)
      {
        localObject1 = ((u.d)localObject2).a((float[][])localObject1);
        if (localObject1 != null) {
          localu.aIe.a((u.b)localObject1);
        }
        return;
        int i = 0;
        float[] arrayOfFloat1;
        float[] arrayOfFloat2;
        float f2;
        float f1;
        float f3;
        boolean bool;
        if (Float.isNaN(localu.aIb[j]))
        {
          localu.aIb[j] = localu.aHN[j][0];
          localObject1 = localu.aIf;
          arrayOfFloat1 = localu.aHN[j];
          localObject2 = localu.aHM[j];
          arrayOfFloat2 = localu.aHO[j];
          if ((j == 0) && (((u.a)localObject1).aIg != 0))
          {
            ((u.a)localObject1).aIi += 1L;
            ((u.a)localObject1).aIv = (((u.a)localObject1).aIh / ((u.a)localObject1).aIg);
            f2 = ((u.a)localObject1).aIv - ((u.a)localObject1).aIj;
            f1 = Math.abs(f2);
            f3 = ((u.a)localObject1).aIj;
            if ((((u.a)localObject1).aIj != 0.0F) && (((u.a)localObject1).aIi > 20L) && (f1 > 1.25F)) {
              break label1868;
            }
            f1 = 1.0F;
            ((u.a)localObject1).aIj = (f1 * (f2 / (float)((u.a)localObject1).aIi) + f3);
            if (Math.abs(((u.a)localObject1).aIv - ((u.a)localObject1).aIj) < 1.25F) {
              break label1876;
            }
            bool = true;
            ((u.a)localObject1).aIk = bool;
            if (!((u.a)localObject1).aIk) {
              break label1882;
            }
            if (((u.a)localObject1).aIl < 1200L) {
              ((u.a)localObject1).aIl += 1L;
            }
            ((u.a)localObject1).aIg = 0;
            ((u.a)localObject1).aIh = 0.0F;
            if (((u.a)localObject1).aIv < ((u.a)localObject1).aIx) {
              ((u.a)localObject1).aIx = ((u.a)localObject1).aIv;
            }
            if (((u.a)localObject1).aIv > ((u.a)localObject1).aIw) {
              ((u.a)localObject1).aIw = ((u.a)localObject1).aIv;
            }
            if ((((u.a)localObject1).aIi == 20L) && (Math.max(((u.a)localObject1).aIw - ((u.a)localObject1).aIj, ((u.a)localObject1).aIj - ((u.a)localObject1).aIx) > 5.0F)) {
              ((u.a)localObject1).reset();
            }
          }
          if (((u.a)localObject1).aIi > 20L) {
            break label1907;
          }
          arrayOfFloat1 = ((u.a)localObject1).aIs;
          arrayOfFloat2 = ((u.a)localObject1).aIt;
          ((u.a)localObject1).aIu[j] = 1.0F;
          arrayOfFloat2[j] = 1.0F;
          arrayOfFloat1[j] = 1.0F;
          arrayOfFloat1 = ((u.a)localObject1).aIp;
          arrayOfFloat2 = ((u.a)localObject1).aIq;
          ((u.a)localObject1).aIr[j] = 0.0F;
          arrayOfFloat2[j] = 0.0F;
          arrayOfFloat1[j] = 0.0F;
          ((u.a)localObject1).aIm[j] = localObject2[0];
          ((u.a)localObject1).aIn[j] = localObject2[1];
          ((u.a)localObject1).aIo[j] = localObject2[2];
          f2 = localu.aHM[j][0] - localu.aHN[j][0];
          if (f2 >= -3.1415927F) {
            break label2422;
          }
          f1 = f2 + 6.2831855F;
          f2 = localu.aHN[j][0];
          f2 = f1 * localu.aIf.aIs[j] + f2;
          if (f2 >= -3.1415927F) {
            break label2439;
          }
          f1 = f2 + 6.2831855F;
          localu.aHO[j][0] = f1;
          f2 = localu.aHM[j][1] - localu.aHN[j][1];
          if (f2 >= -3.1415927F) {
            break label2456;
          }
          f1 = f2 + 6.2831855F;
          f2 = localu.aHN[j][1];
          f2 = f1 * localu.aIf.aIt[j] + f2;
          if (f2 >= -3.1415927F) {
            break label2473;
          }
          f1 = f2 + 6.2831855F;
          localu.aHO[j][1] = f1;
          f2 = localu.aHM[j][2] - localu.aHN[j][2];
          if (f2 >= -3.1415927F) {
            break label2490;
          }
          f1 = f2 + 6.2831855F;
          f2 = localu.aHN[j][2];
          f2 = f1 * localu.aIf.aIu[j] + f2;
          if (f2 >= -3.1415927F) {
            break label2507;
          }
          f1 = f2 + 6.2831855F;
        }
        for (;;)
        {
          localu.aHO[j][2] = f1;
          localObject1 = localu.aHK;
          localObject2 = localu.aHO[j];
          f1 = (float)Math.sin(localObject2[1]);
          f2 = (float)Math.cos(localObject2[1]);
          f3 = (float)Math.sin(localObject2[2]);
          float f4 = (float)Math.cos(localObject2[2]);
          float f5 = (float)Math.sin(localObject2[0]);
          float f6 = (float)Math.cos(localObject2[0]);
          float f7 = -f1;
          float f8 = -f3;
          float f9 = -f5;
          localObject2 = u.a(new float[] { 1.0F, 0.0F, 0.0F, 0.0F, f2, f1, 0.0F, f7, f2 }, new float[] { f4, 0.0F, f3, 0.0F, 1.0F, 0.0F, f8, 0.0F, f4 });
          localObject1[j] = u.a(new float[] { f6, f5, 0.0F, f9, f6, 0.0F, 0.0F, 0.0F, 1.0F }, (float[])localObject2);
          System.arraycopy(localu.aHO[j], 0, localu.aHN[j], 0, 3);
          j += 1;
          break;
          f2 = localu.aHN[j][0] - localu.aHO[j][0];
          if (f2 < -3.1415927F)
          {
            f1 = f2 + 6.2831855F;
            localObject1 = localu.aIc[j];
            localObject2 = localu.aHY;
            int k = localObject2[j];
            localObject2[j] = (k + 1);
            localObject1[k] = f1;
            if (localu.aHY[j] == 20)
            {
              localu.aHY[j] = 0;
              if (localu.aHX[j] == 0) {
                localu.aHX[j] = true;
              }
            }
            localObject1 = localu.aIa;
            localObject1[j] += f1;
            localObject1 = localu.aHZ;
            localObject1[j] = (f1 + localObject1[j]);
            if (localu.aHX[j] == 0) {
              break label129;
            }
            if (Math.abs(localu.aHZ[j]) >= 0.08726647F) {
              break label1640;
            }
            if (Math.abs(localu.aIa[j]) >= 0.08726647F) {
              break label1527;
            }
            f2 = localu.aHN[j][0] - localu.aIb[j];
            if (f2 >= -3.1415927F) {
              break label1468;
            }
            f1 = f2 + 6.2831855F;
            localObject1 = localu.aHN[j];
            f2 = localu.aIb[j];
            localObject1[0] = (f1 / 2.0F + f2);
            if (localu.aHN[j][0] >= -3.1415927F) {
              break label1485;
            }
            localu.aHN[j][0] = (6.2831855F + localu.aHN[j][0]);
          }
          for (;;)
          {
            localu.aIb[j] = localu.aHN[j][0];
            i = 1;
            localObject1 = localu.aHZ;
            localObject1[j] -= localu.aIc[j][localu.aHY[j]];
            break;
            f1 = f2;
            if (f2 <= 3.1415927F) {
              break label1129;
            }
            f1 = f2 - 6.2831855F;
            break label1129;
            f1 = f2;
            if (f2 <= 3.1415927F) {
              break label1325;
            }
            f1 = f2 - 6.2831855F;
            break label1325;
            if (localu.aHN[j][0] > 3.1415927F) {
              localu.aHN[j][0] -= 6.2831855F;
            }
          }
          f1 = localu.aIa[j] % 1.5707964F;
          f2 = Math.abs(f1);
          if (f2 < 0.08726647F)
          {
            localObject1 = localu.aIa;
            localObject1[j] -= f1;
            localu.aIb[j] = ((localu.aIb[j] + localu.aIa[j]) % 6.2831855F);
            if (localu.aIb[j] < -3.1415927F) {
              localu.aIb[j] = (6.2831855F + localu.aIb[j]);
            }
          }
          for (;;)
          {
            localu.aIa[j] = 0.0F;
            i = 0;
            break;
            if (localu.aIb[j] > 3.1415927F)
            {
              localu.aIb[j] -= 6.2831855F;
              continue;
              if (f2 > 1.4835299F)
              {
                if (localu.aIa[j] > 0.0F) {
                  localu.aIa[j] = (localu.aIa[j] - f1 + 1.5707964F);
                }
                for (;;)
                {
                  localu.aIb[j] = ((localu.aIb[j] + localu.aIa[j]) % 6.2831855F);
                  if (localu.aIb[j] >= -3.1415927F) {
                    break label1811;
                  }
                  localu.aIb[j] = (6.2831855F + localu.aIb[j]);
                  break;
                  localu.aIa[j] = (localu.aIa[j] - f1 - 1.5707964F);
                }
                if (localu.aIb[j] > 3.1415927F) {
                  localu.aIb[j] -= 6.2831855F;
                }
              }
              else
              {
                localu.aIb[j] = localu.aHN[j][0];
              }
            }
          }
          f1 = 1.25F / f1;
          break label262;
          bool = false;
          break label302;
          if (((u.a)localObject1).aIl <= 0L) {
            break label341;
          }
          ((u.a)localObject1).aIl -= 1L;
          break label341;
          if ((((u.a)localObject1).aIk) || (((u.a)localObject1).aIy) || (i != 0))
          {
            arrayOfFloat1 = ((u.a)localObject1).aIp;
            arrayOfFloat2 = ((u.a)localObject1).aIq;
            ((u.a)localObject1).aIr[j] = 1.0F;
            arrayOfFloat2[j] = 1.0F;
            arrayOfFloat1[j] = 1.0F;
            arrayOfFloat1 = ((u.a)localObject1).aIs;
            arrayOfFloat2 = ((u.a)localObject1).aIt;
            ((u.a)localObject1).aIu[j] = 0.0F;
            arrayOfFloat2[j] = 0.0F;
            arrayOfFloat1[j] = 0.0F;
            break label531;
          }
          if (((u.a)localObject1).aIl > 0L)
          {
            ((u.a)localObject1).aIm[j] = arrayOfFloat2[0];
            ((u.a)localObject1).aIn[j] = arrayOfFloat2[1];
            ((u.a)localObject1).aIo[j] = arrayOfFloat2[2];
          }
          f2 = Math.abs(arrayOfFloat2[0] - arrayOfFloat1[0]);
          f1 = f2;
          if (f2 > 3.1415927F) {
            f1 = 6.2831855F - f2;
          }
          f3 = Math.abs(localObject1.aIm[j] - localObject2[0]);
          f2 = f3;
          if (f3 > 3.1415927F) {
            f2 = 6.2831855F - f3;
          }
          f3 = Math.max(f2, f1);
          if (f3 != 0.0F)
          {
            f1 = ((f2 - f1) / f3 + 1.0F) * 0.5F;
            ((u.a)localObject1).aIp[j] = ((f1 + localObject1.aIp[j]) / 2.0F);
            ((u.a)localObject1).aIs[j] = (1.0F - localObject1.aIp[j]);
            f2 = Math.abs(arrayOfFloat2[1] - arrayOfFloat1[1]);
            f1 = f2;
            if (f2 > 3.1415927F) {
              f1 = 6.2831855F - f2;
            }
            f3 = Math.abs(localObject1.aIn[j] - localObject2[1]);
            f2 = f3;
            if (f3 > 3.1415927F) {
              f2 = 6.2831855F - f3;
            }
            f3 = Math.max(f2, f1);
            if (f3 == 0.0F) {
              break label2412;
            }
            f1 = ((f2 - f1) / f3 + 1.0F) * 0.5F;
            ((u.a)localObject1).aIq[j] = ((f1 + localObject1.aIq[j]) / 2.0F);
            ((u.a)localObject1).aIt[j] = (1.0F - localObject1.aIq[j]);
            f2 = Math.abs(arrayOfFloat2[2] - arrayOfFloat1[2]);
            f1 = f2;
            if (f2 > 3.1415927F) {
              f1 = 6.2831855F - f2;
            }
            f3 = Math.abs(localObject1.aIo[j] - localObject2[2]);
            f2 = f3;
            if (f3 > 3.1415927F) {
              f2 = 6.2831855F - f3;
            }
            f3 = Math.max(f2, f1);
            if (f3 == 0.0F) {
              break label2417;
            }
          }
          for (f1 = ((f2 - f1) / f3 + 1.0F) * 0.5F;; f1 = 1.0F)
          {
            ((u.a)localObject1).aIr[j] = ((f1 + localObject1.aIr[j]) / 2.0F);
            ((u.a)localObject1).aIu[j] = (1.0F - localObject1.aIr[j]);
            break;
            f1 = 1.0F;
            break label2128;
            f1 = 1.0F;
            break label2247;
          }
          f1 = f2;
          if (f2 <= 3.1415927F) {
            break label601;
          }
          f1 = f2 - 6.2831855F;
          break label601;
          f1 = f2;
          if (f2 <= 3.1415927F) {
            break label640;
          }
          f1 = f2 - 6.2831855F;
          break label640;
          f1 = f2;
          if (f2 <= 3.1415927F) {
            break label685;
          }
          f1 = f2 - 6.2831855F;
          break label685;
          f1 = f2;
          if (f2 <= 3.1415927F) {
            break label724;
          }
          f1 = f2 - 6.2831855F;
          break label724;
          f1 = f2;
          if (f2 <= 3.1415927F) {
            break label769;
          }
          f1 = f2 - 6.2831855F;
          break label769;
          f1 = f2;
          if (f2 > 3.1415927F) {
            f1 = f2 - 6.2831855F;
          }
        }
      }
    }
  }
  
  private static final class d
  {
    private float aIQ = 0.0F;
    private float aIR = 0.0F;
    private float aIS = 0.0F;
    private float aIT = 0.0F;
    private float aIU = 0.0F;
    private float aIV = 0.0F;
    private float aIW = 0.0F;
    private float aIX = 0.0F;
    private float aIY = 0.0F;
    private int count = 0;
    
    public final u.b a(float[][] paramArrayOfFloat)
    {
      int i = 0;
      for (;;)
      {
        u.b localb;
        try
        {
          if (this.count > 0)
          {
            int j = paramArrayOfFloat.length;
            if (j >= 3) {}
          }
          else
          {
            paramArrayOfFloat = null;
            return paramArrayOfFloat;
          }
          localb = new u.b();
          localb.time = SystemClock.elapsedRealtime();
          if (i > 5)
          {
            localb.aIz = (this.aIQ / this.count);
            localb.aIA = (this.aIR / this.count);
            localb.aIB = (this.aIS / this.count);
            localb.aIC = (this.aIT / this.count);
            localb.aID = (this.aIU / this.count);
            localb.aIE = (this.aIV / this.count);
            localb.aIF = (this.aIW / this.count);
            localb.aIG = (this.aIX / this.count);
            localb.aIH = (this.aIY / this.count);
            localb.aIJ = ((float)Math.sqrt(localb.aIz * localb.aIz + localb.aIA * localb.aIA));
            reset();
            paramArrayOfFloat = localb;
            continue;
          }
          localb.aIK[i] = paramArrayOfFloat[i][0];
        }
        finally {}
        localb.aIL[i] = paramArrayOfFloat[i][1];
        localb.aIM[i] = paramArrayOfFloat[i][2];
        localb.aIN[i] = ((float)Math.sin(localb.aIK[i]));
        localb.aIO[i] = ((float)Math.cos(localb.aIK[i]));
        i += 1;
      }
    }
    
    public final void a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
    {
      try
      {
        if (paramArrayOfFloat1.length >= 3)
        {
          this.count += 1;
          this.aIQ += paramArrayOfFloat1[0];
          this.aIR += paramArrayOfFloat1[1];
          this.aIS += paramArrayOfFloat1[2];
          this.aIT += paramArrayOfFloat2[0];
          this.aIU += paramArrayOfFloat2[1];
          this.aIV += paramArrayOfFloat2[2];
          this.aIW += paramArrayOfFloat3[0];
          this.aIX += paramArrayOfFloat3[1];
          this.aIY += paramArrayOfFloat3[2];
        }
        return;
      }
      finally
      {
        paramArrayOfFloat1 = finally;
        throw paramArrayOfFloat1;
      }
    }
    
    public final void reset()
    {
      try
      {
        this.count = 0;
        this.aIQ = 0.0F;
        this.aIR = 0.0F;
        this.aIS = 0.0F;
        this.aIT = 0.0F;
        this.aIU = 0.0F;
        this.aIV = 0.0F;
        this.aIW = 0.0F;
        this.aIX = 0.0F;
        this.aIY = 0.0F;
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
  }
  
  static final class e
    extends p
  {
    final float aFH;
    final float aIZ;
    final float aJa;
    final int aJb;
    final float x;
    final float y;
    
    public e(float paramFloat1, float paramFloat2, int paramInt, float paramFloat3, float paramFloat4, float paramFloat5)
    {
      super();
      this.x = paramFloat1;
      this.y = paramFloat2;
      this.aJb = paramInt;
      this.aIZ = paramFloat3;
      this.aJa = paramFloat4;
      this.aFH = paramFloat5;
    }
  }
  
  private final class f
  {
    private ArrayList<u.b> aJc = new ArrayList();
    private a[] aJd = new a[5];
    private int aJe = 0;
    private float[][] aJf = { { Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0F }, { Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0F }, { Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0F } };
    private float[][] aJg;
    private float[][] aJh;
    private int[] aJi;
    private int aJj;
    public int aJk;
    private int aJl;
    
    public f()
    {
      this$1 = new float[] { Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0F };
      float[] arrayOfFloat = { Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0F };
      this.aJg = new float[][] { { Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0F }, u.this, arrayOfFloat };
      this.aJh = ((float[][])Array.newInstance(Float.TYPE, new int[] { 3, 3 }));
      this.aJi = new int[6];
      this.aJj = 5;
      this.aJk = -1;
      this.aJl = 0;
    }
    
    /* Error */
    private void a(a parama)
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 42	com/d/a/a/u$f:aJd	[Lcom/d/a/a/u$f$a;
      //   6: iconst_1
      //   7: aload_0
      //   8: getfield 42	com/d/a/a/u$f:aJd	[Lcom/d/a/a/u$f$a;
      //   11: iconst_0
      //   12: iconst_4
      //   13: invokestatic 83	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
      //   16: aload_0
      //   17: getfield 42	com/d/a/a/u$f:aJd	[Lcom/d/a/a/u$f$a;
      //   20: iconst_4
      //   21: aaload
      //   22: ifnull +138 -> 160
      //   25: invokestatic 89	android/os/SystemClock:elapsedRealtime	()J
      //   28: aload_1
      //   29: getfield 93	com/d/a/a/u$f$a:aJq	J
      //   32: lsub
      //   33: ldc2_w 94
      //   36: lcmp
      //   37: ifle +123 -> 160
      //   40: aload_0
      //   41: getfield 42	com/d/a/a/u$f:aJd	[Lcom/d/a/a/u$f$a;
      //   44: iconst_4
      //   45: aaload
      //   46: astore_2
      //   47: aload_2
      //   48: aload_2
      //   49: getfield 99	com/d/a/a/u$f$a:x	F
      //   52: aload_1
      //   53: getfield 99	com/d/a/a/u$f$a:x	F
      //   56: fadd
      //   57: fconst_2
      //   58: fdiv
      //   59: putfield 99	com/d/a/a/u$f$a:x	F
      //   62: aload_2
      //   63: aload_2
      //   64: getfield 102	com/d/a/a/u$f$a:y	F
      //   67: aload_1
      //   68: getfield 102	com/d/a/a/u$f$a:y	F
      //   71: fadd
      //   72: fconst_2
      //   73: fdiv
      //   74: putfield 102	com/d/a/a/u$f$a:y	F
      //   77: aload_2
      //   78: aload_2
      //   79: getfield 105	com/d/a/a/u$f$a:z	F
      //   82: aload_1
      //   83: getfield 105	com/d/a/a/u$f$a:z	F
      //   86: fadd
      //   87: fconst_2
      //   88: fdiv
      //   89: putfield 105	com/d/a/a/u$f$a:z	F
      //   92: aload_2
      //   93: aload_2
      //   94: getfield 108	com/d/a/a/u$f$a:aJm	I
      //   97: aload_1
      //   98: getfield 108	com/d/a/a/u$f$a:aJm	I
      //   101: iadd
      //   102: i2f
      //   103: fconst_2
      //   104: fdiv
      //   105: invokestatic 114	java/lang/Math:round	(F)I
      //   108: putfield 108	com/d/a/a/u$f$a:aJm	I
      //   111: aload_2
      //   112: aload_2
      //   113: getfield 117	com/d/a/a/u$f$a:aJn	F
      //   116: aload_1
      //   117: getfield 117	com/d/a/a/u$f$a:aJn	F
      //   120: fadd
      //   121: fconst_2
      //   122: fdiv
      //   123: putfield 117	com/d/a/a/u$f$a:aJn	F
      //   126: aload_2
      //   127: aload_2
      //   128: getfield 120	com/d/a/a/u$f$a:aJo	F
      //   131: aload_1
      //   132: getfield 120	com/d/a/a/u$f$a:aJo	F
      //   135: fadd
      //   136: fconst_2
      //   137: fdiv
      //   138: putfield 120	com/d/a/a/u$f$a:aJo	F
      //   141: aload_2
      //   142: aload_1
      //   143: getfield 93	com/d/a/a/u$f$a:aJq	J
      //   146: putfield 93	com/d/a/a/u$f$a:aJq	J
      //   149: aload_2
      //   150: aload_1
      //   151: getfield 123	com/d/a/a/u$f$a:aJp	F
      //   154: putfield 123	com/d/a/a/u$f$a:aJp	F
      //   157: aload_0
      //   158: monitorexit
      //   159: return
      //   160: aload_0
      //   161: getfield 42	com/d/a/a/u$f:aJd	[Lcom/d/a/a/u$f$a;
      //   164: iconst_4
      //   165: aload_1
      //   166: aastore
      //   167: goto -10 -> 157
      //   170: astore_1
      //   171: aload_0
      //   172: monitorexit
      //   173: aload_1
      //   174: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	175	0	this	f
      //   0	175	1	parama	a
      //   46	104	2	locala	a
      // Exception table:
      //   from	to	target	type
      //   2	157	170	finally
      //   160	167	170	finally
    }
    
    /* Error */
    private boolean oc()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 44	com/d/a/a/u$f:aJe	I
      //   6: bipush 20
      //   8: if_icmplt +699 -> 707
      //   11: aload_0
      //   12: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   15: iconst_0
      //   16: aaload
      //   17: astore 17
      //   19: aload 17
      //   21: iconst_2
      //   22: aload 17
      //   24: iconst_2
      //   25: faload
      //   26: ldc 126
      //   28: fdiv
      //   29: fastore
      //   30: aload_0
      //   31: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   34: iconst_1
      //   35: aaload
      //   36: astore 17
      //   38: aload 17
      //   40: iconst_2
      //   41: aload 17
      //   43: iconst_2
      //   44: faload
      //   45: ldc 126
      //   47: fdiv
      //   48: fastore
      //   49: aload_0
      //   50: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   53: iconst_2
      //   54: aaload
      //   55: astore 17
      //   57: aload 17
      //   59: iconst_2
      //   60: aload 17
      //   62: iconst_2
      //   63: faload
      //   64: ldc 126
      //   66: fdiv
      //   67: fastore
      //   68: aload_0
      //   69: getfield 52	com/d/a/a/u$f:aJg	[[F
      //   72: iconst_0
      //   73: aaload
      //   74: astore 17
      //   76: aload 17
      //   78: iconst_2
      //   79: aload 17
      //   81: iconst_2
      //   82: faload
      //   83: ldc 126
      //   85: fdiv
      //   86: fastore
      //   87: aload_0
      //   88: getfield 52	com/d/a/a/u$f:aJg	[[F
      //   91: iconst_1
      //   92: aaload
      //   93: astore 17
      //   95: aload 17
      //   97: iconst_2
      //   98: aload 17
      //   100: iconst_2
      //   101: faload
      //   102: ldc 126
      //   104: fdiv
      //   105: fastore
      //   106: aload_0
      //   107: getfield 52	com/d/a/a/u$f:aJg	[[F
      //   110: iconst_2
      //   111: aaload
      //   112: astore 17
      //   114: aload 17
      //   116: iconst_2
      //   117: aload 17
      //   119: iconst_2
      //   120: faload
      //   121: ldc 126
      //   123: fdiv
      //   124: fastore
      //   125: aload_0
      //   126: getfield 52	com/d/a/a/u$f:aJg	[[F
      //   129: iconst_0
      //   130: aaload
      //   131: iconst_2
      //   132: faload
      //   133: fstore_1
      //   134: aload_0
      //   135: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   138: iconst_0
      //   139: aaload
      //   140: iconst_0
      //   141: faload
      //   142: fstore_2
      //   143: aload_0
      //   144: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   147: iconst_0
      //   148: aaload
      //   149: iconst_2
      //   150: faload
      //   151: fstore_3
      //   152: aload_0
      //   153: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   156: iconst_0
      //   157: aaload
      //   158: iconst_2
      //   159: faload
      //   160: fstore 4
      //   162: aload_0
      //   163: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   166: iconst_0
      //   167: aaload
      //   168: iconst_1
      //   169: faload
      //   170: fstore 5
      //   172: aload_0
      //   173: getfield 52	com/d/a/a/u$f:aJg	[[F
      //   176: iconst_1
      //   177: aaload
      //   178: iconst_2
      //   179: faload
      //   180: fstore 6
      //   182: aload_0
      //   183: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   186: iconst_1
      //   187: aaload
      //   188: iconst_0
      //   189: faload
      //   190: fstore 7
      //   192: aload_0
      //   193: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   196: iconst_1
      //   197: aaload
      //   198: iconst_2
      //   199: faload
      //   200: fstore 8
      //   202: aload_0
      //   203: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   206: iconst_1
      //   207: aaload
      //   208: iconst_2
      //   209: faload
      //   210: fstore 9
      //   212: aload_0
      //   213: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   216: iconst_1
      //   217: aaload
      //   218: iconst_1
      //   219: faload
      //   220: fstore 10
      //   222: aload_0
      //   223: getfield 52	com/d/a/a/u$f:aJg	[[F
      //   226: iconst_2
      //   227: aaload
      //   228: iconst_2
      //   229: faload
      //   230: fstore 11
      //   232: aload_0
      //   233: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   236: iconst_2
      //   237: aaload
      //   238: iconst_0
      //   239: faload
      //   240: fstore 12
      //   242: aload_0
      //   243: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   246: iconst_2
      //   247: aaload
      //   248: iconst_2
      //   249: faload
      //   250: fstore 13
      //   252: aload_0
      //   253: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   256: iconst_2
      //   257: aaload
      //   258: iconst_2
      //   259: faload
      //   260: fstore 14
      //   262: aload_0
      //   263: getfield 50	com/d/a/a/u$f:aJf	[[F
      //   266: iconst_2
      //   267: aaload
      //   268: iconst_1
      //   269: faload
      //   270: fstore 15
      //   272: aload_0
      //   273: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   276: iconst_0
      //   277: aaload
      //   278: iconst_0
      //   279: fload_1
      //   280: ldc 127
      //   282: fmul
      //   283: ldc -128
      //   285: aload_0
      //   286: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   289: iconst_0
      //   290: aaload
      //   291: iconst_0
      //   292: faload
      //   293: fmul
      //   294: fadd
      //   295: fastore
      //   296: aload_0
      //   297: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   300: iconst_0
      //   301: aaload
      //   302: iconst_1
      //   303: fload_2
      //   304: fload_3
      //   305: fsub
      //   306: ldc 127
      //   308: fmul
      //   309: ldc -128
      //   311: aload_0
      //   312: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   315: iconst_0
      //   316: aaload
      //   317: iconst_1
      //   318: faload
      //   319: fmul
      //   320: fadd
      //   321: fastore
      //   322: aload_0
      //   323: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   326: iconst_0
      //   327: aaload
      //   328: iconst_2
      //   329: fload 4
      //   331: fload 5
      //   333: fsub
      //   334: ldc 127
      //   336: fmul
      //   337: ldc -128
      //   339: aload_0
      //   340: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   343: iconst_0
      //   344: aaload
      //   345: iconst_2
      //   346: faload
      //   347: fmul
      //   348: fadd
      //   349: fastore
      //   350: aload_0
      //   351: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   354: iconst_1
      //   355: aaload
      //   356: iconst_0
      //   357: ldc -128
      //   359: aload_0
      //   360: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   363: iconst_1
      //   364: aaload
      //   365: iconst_0
      //   366: faload
      //   367: fmul
      //   368: fload 6
      //   370: ldc 127
      //   372: fmul
      //   373: fadd
      //   374: fastore
      //   375: aload_0
      //   376: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   379: iconst_1
      //   380: aaload
      //   381: iconst_1
      //   382: ldc -128
      //   384: aload_0
      //   385: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   388: iconst_1
      //   389: aaload
      //   390: iconst_1
      //   391: faload
      //   392: fmul
      //   393: ldc 127
      //   395: fload 7
      //   397: fload 8
      //   399: fsub
      //   400: fmul
      //   401: fadd
      //   402: fastore
      //   403: aload_0
      //   404: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   407: iconst_1
      //   408: aaload
      //   409: iconst_2
      //   410: ldc -128
      //   412: aload_0
      //   413: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   416: iconst_1
      //   417: aaload
      //   418: iconst_2
      //   419: faload
      //   420: fmul
      //   421: ldc 127
      //   423: fload 9
      //   425: fload 10
      //   427: fsub
      //   428: fmul
      //   429: fadd
      //   430: fastore
      //   431: aload_0
      //   432: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   435: iconst_2
      //   436: aaload
      //   437: iconst_0
      //   438: ldc -128
      //   440: aload_0
      //   441: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   444: iconst_2
      //   445: aaload
      //   446: iconst_0
      //   447: faload
      //   448: fmul
      //   449: ldc 127
      //   451: fload 11
      //   453: fmul
      //   454: fadd
      //   455: fastore
      //   456: aload_0
      //   457: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   460: iconst_2
      //   461: aaload
      //   462: iconst_1
      //   463: ldc -128
      //   465: aload_0
      //   466: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   469: iconst_2
      //   470: aaload
      //   471: iconst_1
      //   472: faload
      //   473: fmul
      //   474: ldc 127
      //   476: fload 12
      //   478: fload 13
      //   480: fsub
      //   481: fmul
      //   482: fadd
      //   483: fastore
      //   484: aload_0
      //   485: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   488: iconst_2
      //   489: aaload
      //   490: iconst_2
      //   491: ldc -128
      //   493: aload_0
      //   494: getfield 67	com/d/a/a/u$f:aJh	[[F
      //   497: iconst_2
      //   498: aaload
      //   499: iconst_2
      //   500: faload
      //   501: fmul
      //   502: ldc 127
      //   504: fload 14
      //   506: fload 15
      //   508: fsub
      //   509: fmul
      //   510: fadd
      //   511: fastore
      //   512: aload_0
      //   513: aload_0
      //   514: invokespecial 132	com/d/a/a/u$f:od	()Lcom/d/a/a/u$f$a;
      //   517: invokespecial 134	com/d/a/a/u$f:a	(Lcom/d/a/a/u$f$a;)V
      //   520: aload_0
      //   521: iconst_0
      //   522: putfield 44	com/d/a/a/u$f:aJe	I
      //   525: aload_0
      //   526: iconst_3
      //   527: anewarray 46	[F
      //   530: dup
      //   531: iconst_0
      //   532: iconst_3
      //   533: newarray <illegal type>
      //   535: dup
      //   536: iconst_0
      //   537: ldc 47
      //   539: fastore
      //   540: dup
      //   541: iconst_1
      //   542: ldc 48
      //   544: fastore
      //   545: dup
      //   546: iconst_2
      //   547: fconst_0
      //   548: fastore
      //   549: aastore
      //   550: dup
      //   551: iconst_1
      //   552: iconst_3
      //   553: newarray <illegal type>
      //   555: dup
      //   556: iconst_0
      //   557: ldc 47
      //   559: fastore
      //   560: dup
      //   561: iconst_1
      //   562: ldc 48
      //   564: fastore
      //   565: dup
      //   566: iconst_2
      //   567: fconst_0
      //   568: fastore
      //   569: aastore
      //   570: dup
      //   571: iconst_2
      //   572: iconst_3
      //   573: newarray <illegal type>
      //   575: dup
      //   576: iconst_0
      //   577: ldc 47
      //   579: fastore
      //   580: dup
      //   581: iconst_1
      //   582: ldc 48
      //   584: fastore
      //   585: dup
      //   586: iconst_2
      //   587: fconst_0
      //   588: fastore
      //   589: aastore
      //   590: putfield 50	com/d/a/a/u$f:aJf	[[F
      //   593: iconst_3
      //   594: newarray <illegal type>
      //   596: dup
      //   597: iconst_0
      //   598: ldc 47
      //   600: fastore
      //   601: dup
      //   602: iconst_1
      //   603: ldc 48
      //   605: fastore
      //   606: dup
      //   607: iconst_2
      //   608: fconst_0
      //   609: fastore
      //   610: astore 17
      //   612: aload_0
      //   613: iconst_3
      //   614: anewarray 46	[F
      //   617: dup
      //   618: iconst_0
      //   619: iconst_3
      //   620: newarray <illegal type>
      //   622: dup
      //   623: iconst_0
      //   624: ldc 47
      //   626: fastore
      //   627: dup
      //   628: iconst_1
      //   629: ldc 48
      //   631: fastore
      //   632: dup
      //   633: iconst_2
      //   634: fconst_0
      //   635: fastore
      //   636: aastore
      //   637: dup
      //   638: iconst_1
      //   639: aload 17
      //   641: aastore
      //   642: dup
      //   643: iconst_2
      //   644: iconst_3
      //   645: newarray <illegal type>
      //   647: dup
      //   648: iconst_0
      //   649: ldc 47
      //   651: fastore
      //   652: dup
      //   653: iconst_1
      //   654: ldc 48
      //   656: fastore
      //   657: dup
      //   658: iconst_2
      //   659: fconst_0
      //   660: fastore
      //   661: aastore
      //   662: putfield 52	com/d/a/a/u$f:aJg	[[F
      //   665: aload_0
      //   666: getfield 40	com/d/a/a/u$f:aJc	Ljava/util/ArrayList;
      //   669: invokevirtual 138	java/util/ArrayList:size	()I
      //   672: bipush 100
      //   674: if_icmplt +25 -> 699
      //   677: aload_0
      //   678: getfield 40	com/d/a/a/u$f:aJc	Ljava/util/ArrayList;
      //   681: iconst_0
      //   682: bipush 20
      //   684: invokevirtual 142	java/util/ArrayList:subList	(II)Ljava/util/List;
      //   687: invokeinterface 147 1 0
      //   692: aload_0
      //   693: getfield 40	com/d/a/a/u$f:aJc	Ljava/util/ArrayList;
      //   696: invokevirtual 150	java/util/ArrayList:trimToSize	()V
      //   699: iconst_1
      //   700: istore 16
      //   702: aload_0
      //   703: monitorexit
      //   704: iload 16
      //   706: ireturn
      //   707: iconst_0
      //   708: istore 16
      //   710: goto -8 -> 702
      //   713: astore 17
      //   715: aload_0
      //   716: monitorexit
      //   717: aload 17
      //   719: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	720	0	this	f
      //   133	147	1	f1	float
      //   142	162	2	f2	float
      //   151	154	3	f3	float
      //   160	170	4	f4	float
      //   170	162	5	f5	float
      //   180	189	6	f6	float
      //   190	206	7	f7	float
      //   200	198	8	f8	float
      //   210	214	9	f9	float
      //   220	206	10	f10	float
      //   230	222	11	f11	float
      //   240	237	12	f12	float
      //   250	229	13	f13	float
      //   260	245	14	f14	float
      //   270	237	15	f15	float
      //   700	9	16	bool	boolean
      //   17	623	17	arrayOfFloat	float[]
      //   713	5	17	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   2	699	713	finally
    }
    
    private a od()
    {
      int i2;
      int j;
      a locala;
      int k;
      Object localObject6;
      Object localObject8;
      float f1;
      float f2;
      float f7;
      float f5;
      float f3;
      label378:
      float f9;
      float f10;
      label400:
      label425:
      Object localObject2;
      label824:
      label907:
      int n;
      int m;
      label948:
      int i1;
      label989:
      label1072:
      label1201:
      label1208:
      label1215:
      label1220:
      float f12;
      for (;;)
      {
        try
        {
          if (this.aJl == 0)
          {
            i2 = 1;
            if (i2 == 0) {
              continue;
            }
            if (Math.abs(this.aJh[2][0]) < 9.3D)
            {
              i = 5;
              this.aJj = i;
              this.aJi = new int[6];
              j = 0;
              if ((this.aJk >= 0) && (this.aJk <= 5)) {
                this.aJj = this.aJk;
              }
              localObject4 = new a();
              locala = new a();
              if (this.aJd[0] != null)
              {
                ((a)localObject4).aJq = this.aJd[0].aJq;
                ((a)localObject4).aJn = this.aJd[0].aJn;
              }
              if (this.aJd[4] != null)
              {
                locala.aJq = this.aJd[4].aJq;
                locala.aJn = this.aJd[4].aJn;
              }
              if (!this.aJc.isEmpty())
              {
                k = this.aJc.size();
                localObject6 = new float[6];
                localObject7 = new float[6];
                localObject8 = this.aJc.iterator();
                f1 = 0.0F;
                f2 = 0.0F;
                if (((Iterator)localObject8).hasNext()) {
                  continue;
                }
                f7 = f2 / k;
                f5 = f1 / k;
                if (j != 0) {
                  break label1201;
                }
                f11 = f7;
                localObject8 = new float[6];
                localObject8[0] = ((float)Math.atan2(localObject6[0], localObject7[0]));
                localObject8[1] = ((float)Math.atan2(localObject6[1], localObject7[1]));
                localObject8[2] = ((float)Math.atan2(localObject6[2], localObject7[2]));
                localObject8[3] = ((float)Math.atan2(localObject6[3], localObject7[3]));
                localObject8[4] = ((float)Math.atan2(localObject6[4], localObject7[4]));
                localObject8[5] = ((float)Math.atan2(localObject6[5], localObject7[5]));
                if (j != 0) {
                  break label1208;
                }
                f3 = f7;
                break label1744;
                localObject6 = this.aJc.iterator();
                f9 = 0.0F;
                f10 = 0.0F;
                i = 0;
                f2 = f5;
                if (((Iterator)localObject6).hasNext()) {
                  break;
                }
                if (((a)localObject4).aJm > 0)
                {
                  if (j != 0) {
                    break label1713;
                  }
                  f1 = 0.0F;
                  f2 = localObject2 / ((a)localObject4).aJm;
                  f3 = ((a)localObject4).aJn;
                  f2 = f1 + ((f2 - f11) / 15.0F + 0.537F);
                  f1 = f2;
                  if (f3 != 0.0F) {
                    f1 = f2 * 0.67F + 0.33F * f3;
                  }
                  ((a)localObject4).aJn = f1;
                  ((a)localObject4).x *= ((a)localObject4).aJn;
                  ((a)localObject4).y *= ((a)localObject4).aJn;
                  ((a)localObject4).aJo = (((a)localObject4).aJm * ((a)localObject4).aJn);
                }
              }
              ((a)localObject4).aJp = (((a)localObject4).aJo / (this.aJc.size() / 20));
              if (this.aJd[0] != null)
              {
                ((a)localObject4).x += this.aJd[0].x;
                ((a)localObject4).y += this.aJd[0].y;
                ((a)localObject4).z += this.aJd[0].z;
                ((a)localObject4).aJm += this.aJd[0].aJm;
                ((a)localObject4).aJo += this.aJd[0].aJo;
              }
              if ((this.aJd[4] != null) && (locala.aJm > 0))
              {
                this.aJd[4].x = ((this.aJd[4].x + ((a)localObject4).x + locala.x * ((a)localObject4).aJn) / 2.0F);
                this.aJd[4].y = ((this.aJd[4].y + ((a)localObject4).y + locala.y * ((a)localObject4).aJn) / 2.0F);
              }
              return (a)localObject4;
            }
          }
          else
          {
            i2 = 0;
            continue;
          }
          i = 2;
          continue;
          if (Math.abs(this.aJh[0][0]) < 7.0F) {
            break label1773;
          }
          if (this.aJh[1][1] >= 2.3F) {
            break label1767;
          }
          if (this.aJh[1][2] < 2.3F) {
            break label1773;
          }
          break label1767;
          if (i != 0)
          {
            this.aJj = 2;
            this.aJi = new int[6];
            j = i;
            continue;
          }
          f1 = Math.abs(this.aJh[0][0]);
          f2 = Math.abs(this.aJh[1][0]);
          f3 = Math.abs(this.aJh[2][0]);
          if (f1 <= f2) {
            break label1812;
          }
          if (f1 <= f3) {
            break label1806;
          }
          j = 0;
          break label1779;
          if (k < 3) {
            break label1832;
          }
          j = n * 2 + m - 1;
          Object localObject4 = this.aJi;
          localObject4[j] += 1;
          j = 0;
          break label1793;
          f2 = f1;
          if (this.aJh[k][n] <= f1) {
            break label1894;
          }
          f2 = this.aJh[k][n];
          i1 = k;
          m = n;
          break label1894;
          if ((j == this.aJj) || (this.aJi[j] <= this.aJi[this.aJj])) {
            break label1906;
          }
          this.aJj = j;
          break label1906;
          u.b localb = (u.b)((Iterator)localObject8).next();
          if (j == 0)
          {
            f3 = localb.aIB;
            f3 = f2 + f3;
            if (j == 0)
            {
              f2 = localb.aIJ;
              break label1915;
              Object localObject1;
              f1 = localObject1;
              f2 = f3;
              if (i > 5) {
                continue;
              }
              localObject6[i] += localb.aIN[i];
              localObject7[i] += localb.aIO[i];
              i += 1;
              continue;
            }
          }
          else
          {
            f3 = localb.aIE;
            continue;
          }
          f2 = (float)Math.sqrt(localb.aIC * localb.aIC + localb.aID * localb.aID + localb.aIE * localb.aIE);
          localb.aII = f2;
        }
        finally {}
        float f11 = f5;
        continue;
        f3 = f5;
        break label1744;
        f1 = 1.0F;
        break label1755;
        f12 = 0.2617994F;
      }
      Object localObject7 = (u.b)((Iterator)localObject6).next();
      if (j == 0) {}
      label1266:
      Object localObject3;
      for (float f4 = ((u.b)localObject7).aIB;; f4 = ((u.b)localObject7).aII)
      {
        if (j != 0) {
          break label1316;
        }
        f6 = ((u.b)localObject7).aIJ;
        break label1927;
        if (i > 0) {
          break label1326;
        }
        if (f4 > localObject3) {
          break label1946;
        }
        f10 = localObject7.aIN[this.aJj];
        f9 = localObject7.aIO[this.aJj];
        break;
      }
      label1316:
      float f6 = ((u.b)localObject7).aII;
      break label1927;
      label1326:
      if (f3 < f4) {
        if (i2 == 0)
        {
          f3 = f4 - localObject3;
          if (f3 > 2.0F * f1)
          {
            f3 /= 2.0F;
            f1 = f4;
            break label1970;
            label1367:
            f4 = localObject2;
            if (i <= 10)
            {
              k = 1;
              i = k;
              if (((a)localObject5).aJq == 0L) {
                break label2009;
              }
              i = k;
              if (((u.b)localObject7).time - ((a)localObject5).aJq >= 250L) {
                break label2009;
              }
              i = 0;
              break label2009;
            }
          }
        }
      }
      for (;;)
      {
        f4 = localObject2;
        float f8;
        if (k != 0)
        {
          ((a)localObject5).aJm += 1;
          localObject2 += f1;
          f4 = localObject7.aIN[this.aJj];
          f6 = localObject7.aIO[this.aJj];
          f6 = (float)Math.atan2(f4 + f10, f6 + f9);
          f9 = Math.abs(f6 - localObject8[this.aJj]);
          f4 = f9;
          if (f9 <= 3.1415927F) {
            break label2039;
          }
          f4 = 6.2831855F - f9;
          break label2039;
        }
        for (;;)
        {
          f9 = (float)(Math.sin(f6) * f4);
          double d = Math.cos(f6);
          f6 = (float)(f4 * d);
          ((a)localObject5).x += f9;
          ((a)localObject5).y += f6;
          f4 = f8;
          if (((u.b)localObject7).time - locala.aJq > 250L)
          {
            locala.x -= f9;
            locala.y -= f6;
            locala.aJm += 1;
            f4 = f8;
          }
          ((a)localObject5).aJq = ((u.b)localObject7).time;
          f10 = localObject7.aIN[this.aJj];
          f9 = localObject7.aIO[this.aJj];
          i = 0;
          f6 = f1;
          f8 = f4;
          f1 = f3;
          f3 = f6;
          break;
          label1701:
          f6 = localObject8[this.aJj];
        }
        label1713:
        f1 = 0.08F;
        break label425;
        label1744:
        label1755:
        label1767:
        label1773:
        label1779:
        label1793:
        label1806:
        label1812:
        label1832:
        label1894:
        label1904:
        label1906:
        label1913:
        label1915:
        label1927:
        float f13;
        for (;;)
        {
          break label1982;
          f3 = f1;
          f1 = f4;
          break label1970;
          float f14 = f3;
          f3 = f1;
          f1 = f14;
          break label1970;
          f8 = 0.0F;
          if (j != 0) {
            break label1215;
          }
          f1 = 1.2F;
          if (i2 == 0) {
            break label1220;
          }
          f12 = 0.08726647F;
          break label378;
          i = 1;
          break label824;
          i = 0;
          break label824;
          f1 = 0.0F;
          n = 0;
          m = 0;
          k = 0;
          break label907;
          for (;;)
          {
            if (j <= 5) {
              break label1913;
            }
            j = i;
            break;
            j = 2;
            break label1779;
            if (f2 > f3)
            {
              j = 1;
              break label1779;
            }
            j = 2;
            break label1779;
            int i3 = m;
            i1 = n;
            f2 = f1;
            if (k != j)
            {
              i3 = 1;
              i1 = n;
              n = i3;
            }
            for (;;)
            {
              if (n < 3) {
                break label1904;
              }
              f2 = f1;
              i3 = m;
              k += 1;
              m = i3;
              n = i1;
              f1 = f2;
              break;
              n += 1;
              f1 = f2;
            }
            break label948;
            j += 1;
          }
          break label989;
          f4 = f1 + f2;
          i = 0;
          break label1072;
          if (j == 0)
          {
            f13 = f7;
            break label1266;
          }
          f13 = f5;
          break label1266;
          label1946:
          if (f4 - f13 < f1) {
            break label400;
          }
          f2 = f6;
          f3 = f4;
          i = 1;
          break label400;
          label1970:
          if (f2 < f6) {
            f2 = f6;
          }
        }
        label1982:
        if (f4 <= f13) {
          break label1367;
        }
        i += 1;
        f4 = f1;
        f1 = f3;
        f3 = f4;
        break label400;
        label2009:
        k = i;
        if (i != 0)
        {
          k = i;
          if (f2 - f5 < 0.3F) {
            k = 0;
          }
        }
      }
      label2039:
      if (f4 >= f12) {}
      for (int i = 1;; i = 0)
      {
        f4 = 1.0F;
        if (i == 0) {
          break label1701;
        }
        f4 = 0.93F;
        break;
      }
    }
    
    /* Error */
    private a oe()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 42	com/d/a/a/u$f:aJd	[Lcom/d/a/a/u$f$a;
      //   6: iconst_4
      //   7: aaload
      //   8: ifnull +17 -> 25
      //   11: aload_0
      //   12: getfield 42	com/d/a/a/u$f:aJd	[Lcom/d/a/a/u$f$a;
      //   15: iconst_4
      //   16: aaload
      //   17: invokevirtual 237	com/d/a/a/u$f$a:of	()Lcom/d/a/a/u$f$a;
      //   20: astore_1
      //   21: aload_0
      //   22: monitorexit
      //   23: aload_1
      //   24: areturn
      //   25: aconst_null
      //   26: astore_1
      //   27: goto -6 -> 21
      //   30: astore_1
      //   31: aload_0
      //   32: monitorexit
      //   33: aload_1
      //   34: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	35	0	this	f
      //   20	7	1	locala	a
      //   30	4	1	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   2	21	30	finally
    }
    
    public final void a(u.b paramb)
    {
      try
      {
        if ((this.aJl > 0) && (this.aJl < 101)) {
          this.aJl -= 1;
        }
        this.aJc.add(paramb);
        this.aJe += 1;
        if (paramb.aIC > this.aJf[0][0]) {
          this.aJf[0][0] = paramb.aIC;
        }
        if (paramb.aIC < this.aJf[0][1]) {
          this.aJf[0][1] = paramb.aIC;
        }
        Object localObject = this.aJf[0];
        localObject[2] += paramb.aIC;
        if (paramb.aID > this.aJf[1][0]) {
          this.aJf[1][0] = paramb.aID;
        }
        if (paramb.aID < this.aJf[1][1]) {
          this.aJf[1][1] = paramb.aID;
        }
        localObject = this.aJf[1];
        localObject[2] += paramb.aID;
        if (paramb.aIE > this.aJf[2][0]) {
          this.aJf[2][0] = paramb.aIE;
        }
        if (paramb.aIE < this.aJf[2][1]) {
          this.aJf[2][1] = paramb.aIE;
        }
        localObject = this.aJf[2];
        localObject[2] += paramb.aIE;
        if (paramb.aIF > this.aJg[0][0]) {
          this.aJg[0][0] = paramb.aIF;
        }
        if (paramb.aIF < this.aJg[0][1]) {
          this.aJg[0][1] = paramb.aIF;
        }
        localObject = this.aJg[0];
        localObject[2] += paramb.aIF;
        if (paramb.aIG > this.aJg[1][0]) {
          this.aJg[1][0] = paramb.aIG;
        }
        if (paramb.aIG < this.aJg[1][1]) {
          this.aJg[1][1] = paramb.aIG;
        }
        localObject = this.aJg[1];
        localObject[2] += paramb.aIG;
        if (paramb.aIH > this.aJg[2][0]) {
          this.aJg[2][0] = paramb.aIH;
        }
        if (paramb.aIH < this.aJg[2][1]) {
          this.aJg[2][1] = paramb.aIH;
        }
        localObject = this.aJg[2];
        localObject[2] += paramb.aIH;
        if (oc())
        {
          paramb = u.this;
          localObject = paramb.aIe.oe();
          if (localObject != null) {
            paramb.c(new u.e(((a)localObject).x, ((a)localObject).y, ((a)localObject).aJm, ((a)localObject).aJn, ((a)localObject).aJo, ((a)localObject).aJp));
          }
        }
        return;
      }
      finally {}
    }
    
    public final void reset()
    {
      try
      {
        this.aJc.clear();
        this.aJd = new a[5];
        this.aJe = 0;
        float[] arrayOfFloat1 = { Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0F };
        float[] arrayOfFloat2 = { Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0F };
        this.aJf = new float[][] { { Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0F }, arrayOfFloat1, arrayOfFloat2 };
        this.aJg = new float[][] { { Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0F }, { Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0F }, { Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0F } };
        this.aJh = ((float[][])Array.newInstance(Float.TYPE, new int[] { 3, 3 }));
        this.aJi = new int[6];
        this.aJj = 5;
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    private final class a
    {
      public int aJm = 0;
      public float aJn = 0.0F;
      public float aJo = 0.0F;
      public float aJp = 0.0F;
      public long aJq = 0L;
      public float x = 0.0F;
      public float y = 0.0F;
      public float z = 0.0F;
      
      public a() {}
      
      protected final a of()
      {
        a locala = new a(u.f.this);
        locala.x = this.x;
        locala.y = this.y;
        locala.z = this.z;
        locala.aJm = this.aJm;
        locala.aJn = this.aJn;
        locala.aJo = this.aJo;
        locala.aJq = this.aJq;
        locala.aJp = this.aJp;
        return locala;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */