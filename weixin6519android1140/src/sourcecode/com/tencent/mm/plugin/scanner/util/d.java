package com.tencent.mm.plugin.scanner.util;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.g.a.oh;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.scanner.a.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.qbar.QbarNative;
import com.tencent.qbar.QbarNative.QbarPossibleInfo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class d
  extends b
{
  private static QbarNative oAn;
  private Object gwY;
  public boolean lAS;
  private int mMode;
  public boolean naa;
  private boolean oAm;
  private byte[] oAo;
  byte[] oAp;
  private int oAq;
  public boolean oAr;
  private i oAs;
  public boolean oxj;
  
  static
  {
    GMTrace.i(16597364244480L, 123660);
    oAn = new QbarNative();
    GMTrace.o(16597364244480L, 123660);
  }
  
  public d(b.a parama, int paramInt, boolean paramBoolean)
  {
    super(parama);
    GMTrace.i(6179786850304L, 46043);
    this.oAm = false;
    this.lAS = false;
    this.naa = true;
    this.oxj = false;
    this.gwY = new Object();
    this.oAq = 0;
    this.mMode = 0;
    this.oAr = true;
    this.oAs = new i();
    this.mMode = paramInt;
    this.naa = paramBoolean;
    GMTrace.o(6179786850304L, 46043);
  }
  
  private boolean a(int paramInt, Set<Integer> paramSet)
  {
    GMTrace.i(14311502118912L, 106629);
    if ((!this.oAm) && (paramSet != null) && (!paramSet.isEmpty()))
    {
      Object localObject = oAn;
      if (((QbarNative)localObject).xOR < 0) {
        ((QbarNative)localObject).xOR = ((QbarNative)localObject).Init(2, 0, paramInt, "ANY", "UTF-8");
      }
      if (((QbarNative)localObject).xOR < 0) {}
      for (paramInt = -1;; paramInt = 1)
      {
        l.oto.otD = paramSet.contains(Integer.valueOf(5));
        localObject = new int[paramSet.size()];
        paramSet = paramSet.iterator();
        i = 0;
        while (paramSet.hasNext())
        {
          Integer localInteger = (Integer)paramSet.next();
          if (localInteger != null)
          {
            localObject[i] = localInteger.intValue();
            i += 1;
          }
        }
      }
      paramSet = oAn;
      int i = paramSet.SetReaders((int[])localObject, localObject.length, paramSet.xOR);
      w.i("MicroMsg.scanner.QBarDecoder", "QbarNative.Init = [%s], SetReaders = [%s], version = [%s], readers: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), QbarNative.getVersion(), Arrays.toString((int[])localObject) });
      if ((paramInt > 0) && (i > 0)) {
        this.oAm = true;
      }
    }
    else
    {
      boolean bool = this.oAm;
      GMTrace.o(14311502118912L, 106629);
      return bool;
    }
    w.e("MicroMsg.scanner.QBarDecoder", "QbarNative failed, releaseDecoder 1");
    GMTrace.o(14311502118912L, 106629);
    return false;
  }
  
  private boolean a(byte[] paramArrayOfByte, Point paramPoint, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(6180055285760L, 46045);
    long l2 = System.currentTimeMillis();
    w.i("MicroMsg.scanner.QBarDecoder", "decode() start");
    if (this.lAS)
    {
      w.e("MicroMsg.scanner.QBarDecoder", "is decoding, return false");
      GMTrace.o(6180055285760L, 46045);
      return false;
    }
    if (this.oxj)
    {
      w.w("MicroMsg.scanner.QBarDecoder", "isReleasing, return false 1");
      GMTrace.o(6180055285760L, 46045);
      return false;
    }
    if ((paramArrayOfByte == null) || (paramPoint == null) || (paramRect == null))
    {
      w.e("MicroMsg.scanner.QBarDecoder", "wrong args");
      GMTrace.o(6180055285760L, 46045);
      return false;
    }
    this.lAS = true;
    this.oAb = null;
    this.eDh = 0;
    this.eDg = 0;
    if (paramBoolean2) {
      l.oto.bcr();
    }
    int i;
    int j;
    try
    {
      synchronized (this.gwY)
      {
        Object localObject2 = new Rect();
        if ((com.tencent.mm.compatible.d.c.sG()) || (this.naa))
        {
          i = paramRect.width();
          j = paramRect.height();
          ((Rect)localObject2).left = paramRect.left;
          ((Rect)localObject2).right = (paramRect.right - i % 4);
          ((Rect)localObject2).top = paramRect.top;
          ((Rect)localObject2).bottom = (paramRect.bottom - j % 4);
          if ((((Rect)localObject2).right <= ((Rect)localObject2).left) || (((Rect)localObject2).bottom <= ((Rect)localObject2).top))
          {
            this.lAS = false;
            GMTrace.o(6180055285760L, 46045);
            return false;
          }
        }
        else
        {
          ((Rect)localObject2).left = (paramPoint.x / 2 - paramRect.height());
          ((Rect)localObject2).right = (paramPoint.x / 2 + paramRect.height());
          ((Rect)localObject2).top = (paramPoint.y / 2 - paramRect.width() / 2);
          ((Rect)localObject2).bottom = (paramPoint.y / 2 + paramRect.width() / 2);
          if (((Rect)localObject2).left < 0) {
            ((Rect)localObject2).left = 0;
          }
          if (((Rect)localObject2).right > paramPoint.x - 1) {
            ((Rect)localObject2).right = (paramPoint.x - 1);
          }
          if (((Rect)localObject2).top < 0) {
            ((Rect)localObject2).top = 0;
          }
          if (((Rect)localObject2).bottom > paramPoint.y - 1) {
            ((Rect)localObject2).bottom = (paramPoint.y - 1);
          }
          i = ((Rect)localObject2).width() % 4;
          j = ((Rect)localObject2).height() % 4;
          if (i != 0) {
            ((Rect)localObject2).right -= i;
          }
          if (j != 0) {
            ((Rect)localObject2).bottom -= j;
          }
          if ((((Rect)localObject2).right <= ((Rect)localObject2).left) || (((Rect)localObject2).bottom <= ((Rect)localObject2).top))
          {
            this.lAS = false;
            GMTrace.o(6180055285760L, 46045);
            return false;
          }
        }
        if (!cR(this.mMode, 0))
        {
          releaseDecoder();
          this.lAS = false;
          GMTrace.o(6180055285760L, 46045);
          return false;
        }
        localObject2 = new c(paramArrayOfByte, paramPoint.x, paramPoint.y, (Rect)localObject2);
        paramRect = new int[2];
        paramRect[0] = ((c)localObject2).width;
        paramRect[1] = ((c)localObject2).height;
        j = 0;
        i = j;
        if (!com.tencent.mm.compatible.d.c.sG())
        {
          i = j;
          if (!paramBoolean1)
          {
            i = 90;
            paramRect[0] = ((c)localObject2).height;
            paramRect[1] = ((c)localObject2).width;
          }
        }
        w.d("MicroMsg.scanner.QBarDecoder", "rotate angle: " + i);
        if (this.oAo == null)
        {
          this.oAo = new byte[((c)localObject2).width * ((c)localObject2).height * 3 / 2];
          this.oAp = new byte[((c)localObject2).width * ((c)localObject2).height];
          w.d("MicroMsg.scanner.QBarDecoder", "tempOutBytes = null, new byte[%s]", new Object[] { Integer.valueOf(((c)localObject2).width * ((c)localObject2).height * 3 / 2) });
        }
        while (this.oAo.length == ((c)localObject2).width * ((c)localObject2).height * 3 / 2)
        {
          w.d("MicroMsg.scanner.QBarDecoder", "decode prepare , cost:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
          i = QbarNative.a(this.oAo, paramRect, paramArrayOfByte, paramPoint.x, paramPoint.y, ((c)localObject2).left, ((c)localObject2).top, ((c)localObject2).width, ((c)localObject2).height, i);
          if (i == 1) {
            break;
          }
          w.e("MicroMsg.scanner.QBarDecoder", "decode pro_result %s", new Object[] { Integer.valueOf(i) });
          this.lAS = false;
          GMTrace.o(6180055285760L, 46045);
          return false;
        }
        this.oAo = null;
        this.oAo = new byte[((c)localObject2).width * ((c)localObject2).height * 3 / 2];
        this.oAp = null;
        this.oAp = new byte[((c)localObject2).width * ((c)localObject2).height];
        w.d("MicroMsg.scanner.QBarDecoder", "tempOutBytes size change, new byte[%s]", new Object[] { Integer.valueOf(((c)localObject2).width * ((c)localObject2).height * 3 / 2) });
      }
      this.lAS = false;
    }
    catch (Exception paramArrayOfByte)
    {
      w.printErrStackTrace("MicroMsg.scanner.QBarDecoder", paramArrayOfByte, "decodeInternal error", new Object[0]);
    }
    w.i("MicroMsg.scanner.QBarDecoder", "decode() finish, resultText = [%s], cost:%d", new Object[] { this.oAb, Long.valueOf(System.currentTimeMillis() - l2) });
    long l1;
    long l3;
    if (!bg.nm(this.oAb))
    {
      GMTrace.o(6180055285760L, 46045);
      return true;
      System.arraycopy(this.oAo, 0, this.oAp, 0, this.oAp.length);
      w.d("MicroMsg.scanner.QBarDecoder", "decode, rotate and gray, cost:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
      if (this.oAp != null) {
        w.d("MicroMsg.scanner.QBarDecoder", "tempGrayData.len: %d, width: %d, height: %d", new Object[] { Integer.valueOf(this.oAp.length), Integer.valueOf(paramRect[0]), Integer.valueOf(paramRect[1]) });
      }
      if (this.oAp != null)
      {
        if (r.hkT)
        {
          paramArrayOfByte = e.ghz + "testScan/";
          FileOp.la(paramArrayOfByte);
          paramArrayOfByte = paramArrayOfByte + r.hkV;
          paramArrayOfByte = paramArrayOfByte + "_" + paramRect[0] + "_" + paramRect[1];
          FileOp.j(paramArrayOfByte, this.oAp);
          r.hkV = (r.hkV + 1) % r.hkU;
          w.i("MicroMsg.scanner.QBarDecoder", "save test scan data in file: %s", new Object[] { paramArrayOfByte });
        }
        l1 = System.currentTimeMillis();
        j = oAn.i(this.oAp, paramRect[0], paramRect[1]);
        l3 = System.currentTimeMillis();
        paramArrayOfByte = oAn;
        if (paramArrayOfByte.GetPossibleInfo(QbarNative.xOM, paramArrayOfByte.xOR) != 0)
        {
          i = QbarNative.xOM.hasQrcode;
          break label1602;
        }
      }
    }
    for (;;)
    {
      label1299:
      paramArrayOfByte = oAn;
      float f;
      if (paramArrayOfByte.GetPossibleInfo(QbarNative.xOM, paramArrayOfByte.xOR) != 0)
      {
        f = QbarNative.xOM.qrcodeAreaRatio;
        label1325:
        w.i("MicroMsg.scanner.QBarDecoder", "after scanImage, result:%d,hasCode: %s, areaRatio: %f", new Object[] { Integer.valueOf(j), Boolean.valueOf(paramBoolean1), Float.valueOf(f) });
        if ((j <= 0) && (paramBoolean1) && (this.ozY != null) && (f < 0.1F))
        {
          paramArrayOfByte = new Bundle();
          paramArrayOfByte.putInt("zoom_action", 6);
          paramArrayOfByte.putInt("zoom_type", 1);
          paramArrayOfByte.putInt("zoom_scale", (int)(100.0D * Math.sqrt(0.1F / f)));
          this.ozY.E(paramArrayOfByte);
        }
        l.oto.cO(paramRect[0], paramRect[1]);
        l.oto.bcs();
        i = j;
        l1 = l3 - l1;
        label1473:
        l3 = System.currentTimeMillis();
        l.oto.di(l1);
        w.d("MicroMsg.scanner.QBarDecoder", "decode ScanImage %s, cost:%d", new Object[] { Integer.valueOf(i), Long.valueOf(l3 - l2) });
        if (i == 1) {
          break label1568;
        }
        this.lAS = false;
        GMTrace.o(6180055285760L, 46045);
        return false;
        i = 0;
      }
      label1568:
      label1602:
      while (i == 0)
      {
        paramBoolean1 = false;
        break label1299;
        f = 0.0F;
        break label1325;
        i = -1;
        l1 = 0L;
        break label1473;
        l.oto.bcq();
        l.oto.dj(l1);
        bdp();
        break;
        GMTrace.o(6180055285760L, 46045);
        return false;
      }
      paramBoolean1 = true;
    }
  }
  
  private void bdp()
  {
    GMTrace.i(6180323721216L, 46047);
    Object localObject4 = new StringBuilder();
    Object localObject3 = new StringBuilder();
    Object localObject2 = new StringBuilder();
    Object localObject1 = new StringBuilder();
    int[] arrayOfInt = new int[2];
    int i = oAn.a((StringBuilder)localObject4, (StringBuilder)localObject3, (StringBuilder)localObject2, (StringBuilder)localObject1, arrayOfInt);
    String str;
    if (i == 1)
    {
      w.d("MicroMsg.scanner.QBarDecoder", "decode type:%s, sCharset: %s, sBinaryMethod: %s, data:%s, gResult:%s", new Object[] { ((StringBuilder)localObject4).toString(), ((StringBuilder)localObject2).toString(), ((StringBuilder)localObject1).toString(), ((StringBuilder)localObject3).toString(), Integer.valueOf(i) });
      if (!bg.nm(((StringBuilder)localObject3).toString()))
      {
        str = ((StringBuilder)localObject4).toString();
        if ((!str.equals("QR_CODE")) && (!str.equals("WX_CODE"))) {
          break label329;
        }
        this.oAb = ((StringBuilder)localObject3).toString();
      }
    }
    for (oAc = 1;; oAc = 2)
    {
      this.eDg = p.FZ(((StringBuilder)localObject4).toString());
      this.eDh = arrayOfInt[0];
      localObject3 = l.oto;
      localObject4 = ((StringBuilder)localObject4).toString();
      str = this.oAb;
      localObject2 = ((StringBuilder)localObject2).toString();
      i = arrayOfInt[0];
      int j = arrayOfInt[1];
      localObject1 = ((StringBuilder)localObject1).toString();
      w.i("MicroMsg.QBarEngineReporter", "setDecodeResult, decodeTypeName: %s, dataContent: %s, dataCharSet: %s, qrCodeVersion: %s, pyramidLv: %s, binarizerMethod: %s", new Object[] { localObject4, str, localObject2, Integer.valueOf(i), Integer.valueOf(j), localObject1 });
      ((l)localObject3).otv = ((String)localObject4);
      ((l)localObject3).otw = str;
      ((l)localObject3).otx = ((String)localObject2);
      ((l)localObject3).oty = i;
      ((l)localObject3).otz = j;
      ((l)localObject3).otA = ((String)localObject1);
      GMTrace.o(6180323721216L, 46047);
      return;
      label329:
      this.oAb = (str + "," + localObject3);
    }
  }
  
  private boolean cR(int paramInt1, int paramInt2)
  {
    GMTrace.i(6180189503488L, 46046);
    if (!this.oAm)
    {
      HashSet localHashSet = new HashSet();
      if (paramInt1 == 1) {
        if (paramInt2 != 1)
        {
          localHashSet.add(Integer.valueOf(2));
          localHashSet.add(Integer.valueOf(3));
          localHashSet.add(Integer.valueOf(4));
          localHashSet.add(Integer.valueOf(5));
        }
      }
      for (;;)
      {
        bool = a(paramInt2, localHashSet);
        GMTrace.o(6180189503488L, 46046);
        return bool;
        localHashSet.add(Integer.valueOf(2));
        localHashSet.add(Integer.valueOf(3));
        localHashSet.add(Integer.valueOf(5));
        continue;
        if (paramInt1 == 2)
        {
          if (paramInt2 != 1)
          {
            localHashSet.add(Integer.valueOf(0));
            localHashSet.add(Integer.valueOf(3));
            localHashSet.add(Integer.valueOf(4));
          }
          else
          {
            localHashSet.add(Integer.valueOf(0));
            localHashSet.add(Integer.valueOf(3));
          }
        }
        else if (paramInt2 != 1)
        {
          localHashSet.add(Integer.valueOf(2));
          localHashSet.add(Integer.valueOf(0));
          localHashSet.add(Integer.valueOf(3));
          localHashSet.add(Integer.valueOf(4));
          localHashSet.add(Integer.valueOf(5));
        }
        else
        {
          localHashSet.add(Integer.valueOf(2));
          localHashSet.add(Integer.valueOf(0));
          localHashSet.add(Integer.valueOf(3));
          localHashSet.add(Integer.valueOf(5));
        }
      }
    }
    boolean bool = this.oAm;
    GMTrace.o(6180189503488L, 46046);
    return bool;
  }
  
  public final com.tencent.mm.plugin.ab.a.d a(d.a parama, Set<Integer> paramSet)
  {
    GMTrace.i(14311636336640L, 106630);
    com.tencent.mm.plugin.ab.a.d locald = new com.tencent.mm.plugin.ab.a.d();
    synchronized (this.gwY)
    {
      try
      {
        this.oAb = null;
        if ((paramSet != null) && (!paramSet.isEmpty()) && (!a(0, paramSet)))
        {
          releaseDecoder();
          this.lAS = false;
          GMTrace.o(14311636336640L, 106630);
          return null;
        }
        if (!cR(0, 1))
        {
          releaseDecoder();
          this.lAS = false;
          GMTrace.o(14311636336640L, 106630);
          return null;
        }
        w.d("MicroMsg.scanner.QBarDecoder", "directScanQRCodeImg, lumSrc==null:%b", new Object[] { Boolean.valueOf(false) });
        if (parama.bdo() != null) {
          w.i("MicroMsg.scanner.QBarDecoder", "directScanQRCodeImg, lumSrc.getMatrix.length: %d, lumSrc.getWidth: %d, lumSrc.getHeight: %d", new Object[] { Integer.valueOf(parama.bdo().length), Integer.valueOf(parama.width), Integer.valueOf(parama.height) });
        }
        long l1 = System.currentTimeMillis();
        if ((parama.bdo() != null) && (parama.width * parama.height == parama.bdo().length)) {
          l.oto.cO(parama.width, parama.height);
        }
        long l2;
        for (int i = oAn.i(parama.bdo(), parama.width, parama.height);; i = -1)
        {
          l2 = System.currentTimeMillis();
          w.d("MicroMsg.scanner.QBarDecoder", "directScanQRCodeImg decode ScanImage %s, cost: %s", new Object[] { Integer.valueOf(i), Long.valueOf(l2 - l1) });
          l.oto.di(l2 - l1);
          l.oto.bcr();
          if (i == 1) {
            break;
          }
          this.lAS = false;
          GMTrace.o(14311636336640L, 106630);
          return null;
        }
        l.oto.bcq();
        l.oto.dj(l2 - l1);
        bdp();
        locald.result = this.oAb;
        locald.eDg = this.eDg;
        locald.eDh = this.eDh;
        GMTrace.o(14311636336640L, 106630);
        return locald;
      }
      catch (Exception parama)
      {
        w.e("MicroMsg.scanner.QBarDecoder", " Exception in directScanQRCodeImg() " + parama.getMessage());
        w.printErrStackTrace("MicroMsg.scanner.QBarDecoder", parama, "", new Object[0]);
        GMTrace.o(14311636336640L, 106630);
        return locald;
      }
    }
  }
  
  public final boolean a(byte[] paramArrayOfByte, Point paramPoint, Rect paramRect)
  {
    GMTrace.i(6179921068032L, 46044);
    if (this.oAr)
    {
      bool1 = this.oAs.a(paramArrayOfByte, paramPoint, paramRect, this.naa);
      w.i("MicroMsg.scanner.QBarDecoder", "decode, isNeedFocus: %s", new Object[] { Boolean.valueOf(bool1) });
      oh localoh = new oh();
      localoh.eTk.eTl = bool1;
      com.tencent.mm.sdk.b.a.vgX.m(localoh);
    }
    long l = System.currentTimeMillis();
    boolean bool2 = a(paramArrayOfByte, paramPoint, paramRect, false, true);
    this.oAq += 1;
    boolean bool1 = bool2;
    if (!bool2)
    {
      bool1 = bool2;
      if (System.currentTimeMillis() - l <= 80L)
      {
        bool1 = a(paramArrayOfByte, paramPoint, paramRect, true, false);
        this.oAq = 0;
      }
    }
    bool2 = bool1;
    if (!bool1)
    {
      bool2 = bool1;
      if (this.oAq >= 3)
      {
        bool2 = a(paramArrayOfByte, paramPoint, paramRect, true, false);
        this.oAq = 0;
      }
    }
    GMTrace.o(6179921068032L, 46044);
    return bool2;
  }
  
  public final void bdl()
  {
    GMTrace.i(6180592156672L, 46049);
    if (this.oAm)
    {
      releaseDecoder();
      this.oAm = false;
    }
    this.oxj = false;
    this.lAS = false;
    GMTrace.o(6180592156672L, 46049);
  }
  
  public final void releaseDecoder()
  {
    GMTrace.i(6180457938944L, 46048);
    w.d("MicroMsg.scanner.QBarDecoder", "releaseDecoder() start, hasInitQBar = %s", new Object[] { Boolean.valueOf(this.oAm) });
    this.oxj = true;
    synchronized (this.gwY)
    {
      if (this.oAm)
      {
        this.oAm = false;
        w.d("MicroMsg.scanner.QBarDecoder", "QbarNative.Release() = [%s]", new Object[] { Integer.valueOf(0) });
        w.d("MicroMsg.scanner.QBarDecoder", "ImgProcessScan.Release() = [%s]", new Object[] { Integer.valueOf(0) });
      }
      this.oAs.release();
      this.oAo = null;
      this.oAp = null;
      c.bdm();
      GMTrace.o(6180457938944L, 46048);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */