package com.tencent.mm.ui.applet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.k;

public class SecurityImage
  extends LinearLayout
{
  private i oaD;
  public String vRa;
  public String vRb;
  public int vRd;
  ProgressBar vXN;
  ImageView vXO;
  Button vXP;
  EditText vXQ;
  b vXR;
  
  public SecurityImage(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1849788727296L, 13782);
    this.vRa = null;
    this.vRb = null;
    this.vRd = 0;
    this.vXN = null;
    this.vXO = null;
    this.vXP = null;
    this.vXQ = null;
    this.oaD = null;
    GMTrace.o(1849788727296L, 13782);
  }
  
  private void lu(boolean paramBoolean)
  {
    int j = 0;
    GMTrace.i(1850325598208L, 13786);
    Object localObject = this.vXO;
    if (paramBoolean)
    {
      i = 255;
      ((ImageView)localObject).setAlpha(i);
      localObject = this.vXO;
      if (!paramBoolean) {
        break label85;
      }
    }
    label85:
    for (int i = 0;; i = -5592406)
    {
      ((ImageView)localObject).setBackgroundColor(i);
      localObject = this.vXN;
      i = j;
      if (paramBoolean) {
        i = 4;
      }
      ((ProgressBar)localObject).setVisibility(i);
      GMTrace.o(1850325598208L, 13786);
      return;
      i = 40;
      break;
    }
  }
  
  public final void a(int paramInt, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    GMTrace.i(1849922945024L, 13783);
    lu(true);
    this.vRa = paramString1;
    this.vRb = paramString2;
    this.vRd = paramInt;
    Bitmap localBitmap = d.bg(paramArrayOfByte);
    if (localBitmap != null)
    {
      w.i("MicroMsg.SecurityImage", "dkwt setSecImg sid:%s key:%s imgBuf:%d [%d %d]", new Object[] { paramString1, paramString2, Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(localBitmap.getWidth()), Integer.valueOf(localBitmap.getHeight()) });
      this.vRa = paramString1;
      this.vRb = paramString2;
      this.vRd = paramInt;
      if (localBitmap != null)
      {
        this.vXO.setImageBitmap(localBitmap);
        GMTrace.o(1849922945024L, 13783);
        return;
      }
      w.e("MicroMsg.SecurityImage", "setSecImg failed, decode failed");
      GMTrace.o(1849922945024L, 13783);
      return;
    }
    if (paramArrayOfByte == null) {}
    for (paramInt = -1;; paramInt = paramArrayOfByte.length)
    {
      w.e("MicroMsg.SecurityImage", "dkwt setSecImg ERROR sid:%s key:%s imgBuf:%d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
      GMTrace.o(1849922945024L, 13783);
      return;
    }
  }
  
  public final String bZo()
  {
    GMTrace.i(1850057162752L, 13784);
    if (this.vXQ == null)
    {
      GMTrace.o(1850057162752L, 13784);
      return "";
    }
    String str = this.vXQ.getText().toString().trim();
    GMTrace.o(1850057162752L, 13784);
    return str;
  }
  
  public final void dismiss()
  {
    GMTrace.i(1850191380480L, 13785);
    if (this.oaD != null)
    {
      this.oaD.dismiss();
      this.oaD = null;
    }
    GMTrace.o(1850191380480L, 13785);
  }
  
  public static final class a
  {
    public static SecurityImage a(Context paramContext, int paramInt1, int paramInt2, byte[] paramArrayOfByte, String paramString1, String paramString2, final DialogInterface.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener, DialogInterface.OnDismissListener paramOnDismissListener, SecurityImage.b paramb)
    {
      GMTrace.i(1851936210944L, 13798);
      SecurityImage localSecurityImage = (SecurityImage)View.inflate(paramContext, a.h.gfO, null);
      if (localSecurityImage.vXR != null) {
        localSecurityImage.vXR.vXU = null;
      }
      localSecurityImage.vXR = paramb;
      localSecurityImage.vXR.vXU = localSecurityImage;
      localSecurityImage.vXN = ((ProgressBar)localSecurityImage.findViewById(a.g.gdQ));
      localSecurityImage.vXO = ((ImageView)localSecurityImage.findViewById(a.g.gcZ));
      localSecurityImage.vXP = ((Button)localSecurityImage.findViewById(a.g.gcX));
      localSecurityImage.vXQ = ((EditText)localSecurityImage.findViewById(a.g.gcY));
      localSecurityImage.vXP.setOnClickListener(new SecurityImage.1(localSecurityImage));
      localSecurityImage.a(paramInt2, paramArrayOfByte, paramString1, paramString2);
      paramContext = new i.a(paramContext);
      paramContext.BN(paramInt1);
      paramContext.BQ(a.k.cSo).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1846970155008L, 13761);
          paramOnClickListener.onClick(paramAnonymousDialogInterface, paramAnonymousInt);
          GMTrace.o(1846970155008L, 13761);
        }
      });
      paramContext.d(paramOnCancelListener);
      paramContext.dg(localSecurityImage);
      paramContext.lz(true);
      SecurityImage.a(localSecurityImage, paramContext.aax());
      SecurityImage.c(localSecurityImage).setOnDismissListener(paramOnDismissListener);
      SecurityImage.c(localSecurityImage).show();
      GMTrace.o(1851936210944L, 13798);
      return localSecurityImage;
    }
  }
  
  public static abstract class b
  {
    public SecurityImage vXU;
    
    public b()
    {
      GMTrace.i(1844956889088L, 13746);
      GMTrace.o(1844956889088L, 13746);
    }
    
    public abstract void bYp();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\applet\SecurityImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */