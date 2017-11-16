package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ao.b;
import com.tencent.mm.ao.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.f.a;

public class CdnImageView
  extends MMImageView
  implements a
{
  private static final String twD;
  private ae handler;
  private int lhd;
  private int mAB;
  private String twE;
  public boolean twF;
  public boolean twG;
  private String url;
  
  static
  {
    GMTrace.i(20284459450368L, 151131);
    twD = com.tencent.mm.compatible.util.e.ghz + "wallet/images/";
    GMTrace.o(20284459450368L, 151131);
  }
  
  public CdnImageView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(943282192384L, 7028);
    GMTrace.o(943282192384L, 7028);
  }
  
  public CdnImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(943416410112L, 7029);
    GMTrace.o(943416410112L, 7029);
  }
  
  public CdnImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(943550627840L, 7030);
    this.url = null;
    this.twG = false;
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(941537361920L, 7015);
        Object localObject = bg.aq(paramAnonymousMessage.getData().getString("k_url"), "");
        CdnImageView.a(CdnImageView.this, bg.aq(CdnImageView.a(CdnImageView.this), ""));
        if ((bg.nm(CdnImageView.a(CdnImageView.this))) && (bg.nm((String)localObject)))
        {
          CdnImageView.this.setImageBitmap(null);
          CdnImageView.this.z(null);
          GMTrace.o(941537361920L, 7015);
          return;
        }
        if (!CdnImageView.a(CdnImageView.this).equals(localObject))
        {
          w.d("MicroMsg.CdnImageView", "hy: url not equal. abort this msg");
          GMTrace.o(941537361920L, 7015);
          return;
        }
        paramAnonymousMessage = paramAnonymousMessage.getData().getByteArray("k_data");
        if ((paramAnonymousMessage == null) || (paramAnonymousMessage.length == 0))
        {
          w.e("MicroMsg.CdnImageView", "handleMsg fail, data is null");
          GMTrace.o(941537361920L, 7015);
          return;
        }
        localObject = d.bg(paramAnonymousMessage);
        n.IY();
        b.f(CdnImageView.a(CdnImageView.this), (Bitmap)localObject);
        if (CdnImageView.b(CdnImageView.this)) {
          CdnImageView.a(CdnImageView.this, (Bitmap)localObject);
        }
        paramAnonymousMessage = (Message)localObject;
        if (localObject != null)
        {
          paramAnonymousMessage = (Message)localObject;
          if (CdnImageView.c(CdnImageView.this) > 0)
          {
            paramAnonymousMessage = (Message)localObject;
            if (CdnImageView.d(CdnImageView.this) > 0) {
              paramAnonymousMessage = d.a((Bitmap)localObject, CdnImageView.d(CdnImageView.this), CdnImageView.c(CdnImageView.this), true, false);
            }
          }
        }
        if ((paramAnonymousMessage != null) && (!bg.nm(CdnImageView.e(CdnImageView.this)))) {}
        try
        {
          d.a(paramAnonymousMessage, 100, Bitmap.CompressFormat.JPEG, CdnImageView.e(CdnImageView.this), false);
          localObject = paramAnonymousMessage;
          if (CdnImageView.f(CdnImageView.this))
          {
            localObject = paramAnonymousMessage;
            if (paramAnonymousMessage != null) {
              localObject = d.a(paramAnonymousMessage, false, paramAnonymousMessage.getWidth() * 0.5F);
            }
          }
          CdnImageView.this.setImageBitmap((Bitmap)localObject);
          CdnImageView.this.z((Bitmap)localObject);
          GMTrace.o(941537361920L, 7015);
          return;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.CdnImageView", "save image failed, %s", new Object[] { localException.getMessage() });
          }
        }
      }
    };
    GMTrace.o(943550627840L, 7030);
  }
  
  private String bLB()
  {
    GMTrace.i(20283385708544L, 151123);
    if (!bg.nm(this.twE)) {}
    for (String str = this.twE;; str = twD + g.n(this.url.getBytes()))
    {
      GMTrace.o(20283385708544L, 151123);
      return str;
      FileOp.la(twD);
    }
  }
  
  private boolean bLC()
  {
    GMTrace.i(20283519926272L, 151124);
    try
    {
      Object localObject1 = bLB();
      w.d("MicroMsg.CdnImageView", "useSdcardCache, path: %s", new Object[] { localObject1 });
      if (FileOp.aZ((String)localObject1))
      {
        Object localObject2 = d.RD((String)localObject1);
        w.d("MicroMsg.CdnImageView", "get bitmap from cache path: %s", new Object[] { localObject2 });
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (this.mAB > 0)
          {
            localObject1 = localObject2;
            if (this.lhd > 0) {
              localObject1 = d.a((Bitmap)localObject2, this.lhd, this.mAB, true, false);
            }
          }
          localObject2 = localObject1;
          if (this.twF)
          {
            localObject2 = localObject1;
            if (localObject1 != null) {
              localObject2 = d.a((Bitmap)localObject1, false, ((Bitmap)localObject1).getWidth() * 0.5F);
            }
          }
          setImageBitmap((Bitmap)localObject2);
          z((Bitmap)localObject2);
          GMTrace.o(20283519926272L, 151124);
          return true;
        }
      }
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.CdnImageView", localException, "setBitmapFromLocalCache error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(20283519926272L, 151124);
    }
    return false;
  }
  
  public final void R(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(14460081143808L, 107736);
    h(paramString, paramInt1, paramInt2, -1);
    GMTrace.o(14460081143808L, 107736);
  }
  
  public final void h(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(20985075990528L, 156351);
    this.url = paramString;
    this.mAB = paramInt1;
    this.lhd = paramInt2;
    this.twE = null;
    Bitmap localBitmap;
    if (!bg.nm(this.twE))
    {
      localBitmap = d.RD(this.twE);
      if ((localBitmap != null) && (localBitmap.getWidth() > 0) && (localBitmap.getHeight() > 0))
      {
        setImageBitmap(localBitmap);
        z(localBitmap);
        GMTrace.o(20985075990528L, 156351);
        return;
      }
    }
    if ((paramString == null) || (paramString.length() == 0))
    {
      setVisibility(8);
      GMTrace.o(20985075990528L, 156351);
      return;
    }
    if (paramString.startsWith("http"))
    {
      n.IY();
      localBitmap = b.hC(paramString);
      if (localBitmap != null)
      {
        paramString = localBitmap;
        if (this.mAB > 0)
        {
          paramString = localBitmap;
          if (this.lhd > 0) {
            paramString = d.a(localBitmap, this.mAB, this.lhd, true, false);
          }
        }
        setImageBitmap(paramString);
        z(paramString);
        GMTrace.o(20985075990528L, 156351);
        return;
      }
      if ((!this.twG) || (!bLC()))
      {
        if (paramInt3 > 0) {
          setImageResource(paramInt3);
        }
        com.tencent.mm.sdk.f.e.post(new a(paramString, this.handler), "CdnImageView_download");
      }
      GMTrace.o(20985075990528L, 156351);
      return;
    }
    if (!com.tencent.mm.a.e.aZ(paramString))
    {
      setVisibility(8);
      GMTrace.o(20985075990528L, 156351);
      return;
    }
    if ((this.mAB <= 0) || (this.lhd <= 0)) {}
    for (paramString = d.RD(paramString); paramString == null; paramString = d.e(paramString, this.mAB, this.lhd, true))
    {
      setVisibility(8);
      GMTrace.o(20985075990528L, 156351);
      return;
    }
    setImageBitmap(paramString);
    z(paramString);
    GMTrace.o(20985075990528L, 156351);
  }
  
  public final void setUrl(String paramString)
  {
    GMTrace.i(20984941772800L, 156350);
    h(paramString, 0, 0, -1);
    GMTrace.o(20984941772800L, 156350);
  }
  
  public void z(Bitmap paramBitmap)
  {
    GMTrace.i(943684845568L, 7031);
    GMTrace.o(943684845568L, 7031);
  }
  
  static final class a
    implements Runnable
  {
    private ae handler;
    private String url;
    
    a(String paramString, ae paramae)
    {
      GMTrace.i(965428117504L, 7193);
      this.url = paramString;
      this.handler = paramae;
      GMTrace.o(965428117504L, 7193);
    }
    
    public final void run()
    {
      GMTrace.i(965562335232L, 7194);
      byte[] arrayOfByte = bg.SC(this.url);
      Message localMessage = Message.obtain();
      Bundle localBundle = new Bundle();
      localBundle.putByteArray("k_data", arrayOfByte);
      localBundle.putString("k_url", this.url);
      localMessage.setData(localBundle);
      this.handler.sendMessage(localMessage);
      GMTrace.o(965562335232L, 7194);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\CdnImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */