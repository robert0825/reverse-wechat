package com.tencent.c.b;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.c.d.a.c;
import com.tencent.c.d.a.e;
import com.tencent.c.d.a.g;
import com.tencent.c.d.b.d.a;
import com.tencent.c.f.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a
{
  public Context mContext = null;
  public b xQe;
  
  public a(Context paramContext)
  {
    this.mContext = paramContext;
    this.xQe = new b(paramContext);
  }
  
  public static com.tencent.c.c.b.b a(Context paramContext, com.tencent.c.a.a parama, int paramInt)
  {
    if (parama == null) {
      return null;
    }
    com.tencent.c.c.b.b localb = new com.tencent.c.c.b.b();
    localb.xQN = paramInt;
    localb.xQO = null;
    localb.xQP = parama.esM;
    Object localObject = parama.xPZ;
    if (localObject == null)
    {
      localObject = null;
      localb.xQQ = ((byte[])localObject);
      paramContext = com.tencent.c.f.a.bv(paramContext, parama.esM);
      if (paramContext.size() > 1)
      {
        localb.xRf = new ArrayList();
        paramContext = paramContext.iterator();
        while (paramContext.hasNext())
        {
          localObject = (byte[])paramContext.next();
          localb.xRf.add(localObject);
        }
      }
    }
    else
    {
      int i = ((String)localObject).length() / 2;
      byte[] arrayOfByte = new byte[i];
      char[] arrayOfChar = ((String)localObject).toCharArray();
      paramInt = 0;
      for (;;)
      {
        localObject = arrayOfByte;
        if (paramInt >= i) {
          break;
        }
        int j = paramInt * 2;
        int k = (byte)"0123456789ABCDEF".indexOf(arrayOfChar[j]);
        arrayOfByte[paramInt] = ((byte)((byte)"0123456789ABCDEF".indexOf(arrayOfChar[(j + 1)]) | k << 4));
        paramInt += 1;
      }
    }
    localb.xQR = parama.fileSize;
    localb.xQS = parama.xPY;
    localb.xQT = parama.versionCode;
    localb.xQU = parama.versionName;
    localb.xQV = 0;
    if (parama.lLR == 1) {
      localb.xQV |= 0x1;
    }
    localb.xQV |= 0x2;
    if ((!parama.xQa.startsWith("/data")) && (!parama.xQa.startsWith("/system"))) {
      localb.xQV |= 0x4;
    }
    localb.xQW = com.tencent.c.f.a.XU(parama.xQa);
    localb.xQX = 0;
    localb.xQY = 0;
    localb.xQZ = 0;
    localb.xRa = null;
    localb.xRb = 0;
    localb.xRc = false;
    localb.xRd = 0;
    localb.xRe = 0;
    return localb;
  }
  
  public static com.tencent.c.c.b.d cnq()
  {
    com.tencent.c.c.b.d locald = new com.tencent.c.c.b.d();
    for (;;)
    {
      int i;
      try
      {
        locald.xRv = Build.FINGERPRINT;
        locald.xRw = com.tencent.c.f.d.cnI();
        locald.gxw = Build.BRAND;
        locald.model = Build.MODEL;
        locald.xRx = Build.VERSION.SDK_INT;
        locald.xRy = Build.CPU_ABI;
        locald.platform = com.tencent.c.f.d.XV("ro.board.platform");
        if (com.tencent.c.d.a.f.cnu())
        {
          i = 2;
          locald.bZf = i;
          return locald;
        }
        Object localObject2 = com.tencent.c.d.b.d.cnv();
        if (!((Collection)localObject2).isEmpty()) {
          break label358;
        }
        i = 1;
        if (i != 0) {
          break label372;
        }
        Object localObject1 = new ArrayList(3);
        ((List)localObject1).add(new g());
        ((List)localObject1).add(new com.tencent.c.d.a.d());
        if (com.tencent.c.d.b.f.cnw()) {
          ((List)localObject1).add(new c());
        }
        localObject2 = ((List)localObject2).iterator();
        if (((Iterator)localObject2).hasNext())
        {
          d.a locala = (d.a)((Iterator)localObject2).next();
          if (locala == null) {
            continue;
          }
          Iterator localIterator = ((List)localObject1).iterator();
          if (localIterator.hasNext())
          {
            ((com.tencent.c.d.a.b)localIterator.next()).a(locala);
            continue;
          }
          continue;
        }
        localObject1 = ((List)localObject1).iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label372;
        }
        if (!((com.tencent.c.d.a.b)((Iterator)localObject1).next()).cns()) {
          continue;
        }
        i = 1;
      }
      catch (Exception localException)
      {
        return locald;
      }
      if (e.cnt())
      {
        i = 1;
      }
      else
      {
        if (!com.tencent.c.d.a.a.XQ("/system/bin/debuggerd"))
        {
          i = 1;
        }
        else if (!com.tencent.c.d.a.a.XQ("/system/bin/debuggerd64"))
        {
          i = 1;
        }
        else if (!com.tencent.c.d.a.a.XQ("/system/bin/ddexe"))
        {
          i = 1;
        }
        else if (!com.tencent.c.d.a.a.XR("/system/etc/install-recovery.sh"))
        {
          i = 1;
        }
        else if (!com.tencent.c.d.a.a.XR("/system/bin/install-recovery.sh"))
        {
          i = 1;
        }
        else
        {
          h.XW("BootScriptChecker : everything seems ok");
          i = 0;
          break label377;
          i = 0;
          continue;
          label358:
          i = 0;
          continue;
          for (;;)
          {
            if (i == 0) {
              break label375;
            }
            i = 2;
            break;
            label372:
            i = 0;
          }
          label375:
          continue;
        }
        label377:
        if (i != 0) {
          i = 1;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */