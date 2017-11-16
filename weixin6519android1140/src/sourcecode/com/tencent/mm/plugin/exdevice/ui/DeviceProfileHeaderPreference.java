package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class DeviceProfileHeaderPreference
  extends Preference
{
  protected MMActivity hyB;
  private String joJ;
  private ImageView kEk;
  private TextView kEl;
  private TextView kEm;
  private TextView kEn;
  private View kEo;
  TextView kEp;
  private boolean[] kEq;
  private View.OnClickListener[] kEr;
  String kEs;
  private String kEt;
  private boolean kEu;
  private CharSequence uD;
  
  public DeviceProfileHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11036321120256L, 82227);
    this.kEq = new boolean[6];
    this.kEr = new View.OnClickListener[6];
    this.kEu = false;
    this.hyB = ((MMActivity)paramContext);
    this.kEu = false;
    GMTrace.o(11036321120256L, 82227);
  }
  
  public DeviceProfileHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11036455337984L, 82228);
    this.kEq = new boolean[6];
    this.kEr = new View.OnClickListener[6];
    this.kEu = false;
    this.hyB = ((MMActivity)paramContext);
    this.kEu = false;
    GMTrace.o(11036455337984L, 82228);
  }
  
  private void w(View paramView, int paramInt)
  {
    GMTrace.i(11036723773440L, 82230);
    if (this.kEq[paramInt] != 0) {}
    for (int i = 8;; i = 0)
    {
      paramView.setVisibility(i);
      paramView.setOnClickListener(this.kEr[paramInt]);
      GMTrace.o(11036723773440L, 82230);
      return;
    }
  }
  
  public final void a(int paramInt, View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(11036992208896L, 82232);
    Object localObject;
    switch (paramInt)
    {
    default: 
      GMTrace.o(11036992208896L, 82232);
      return;
    case 0: 
      localObject = this.kEk;
    }
    for (;;)
    {
      this.kEr[paramInt] = paramOnClickListener;
      if (localObject != null) {
        ((View)localObject).setOnClickListener(paramOnClickListener);
      }
      GMTrace.o(11036992208896L, 82232);
      return;
      localObject = this.kEl;
      continue;
      localObject = this.kEm;
      continue;
      localObject = this.kEn;
      continue;
      localObject = this.kEo;
      continue;
      localObject = this.kEp;
    }
  }
  
  public final void cS(String paramString)
  {
    GMTrace.i(11037394862080L, 82235);
    this.kEt = paramString;
    if (this.kEk != null)
    {
      c.a locala = new c.a();
      Bitmap localBitmap = d.Ag(R.g.aWq);
      paramString = localBitmap;
      if (localBitmap != null)
      {
        paramString = localBitmap;
        if (!localBitmap.isRecycled())
        {
          localBitmap = d.a(localBitmap, true, 0.5F * localBitmap.getWidth());
          paramString = localBitmap;
          if (localBitmap != null)
          {
            paramString = localBitmap;
            if (!localBitmap.isRecycled())
            {
              locala.gKS = new BitmapDrawable(localBitmap);
              paramString = localBitmap;
            }
          }
        }
      }
      if ((paramString == null) || (paramString.isRecycled())) {
        locala.gKR = R.g.aWq;
      }
      locala.gKZ = true;
      paramString = locala.Jn();
      n.Jd().a(this.kEt, this.kEk, paramString);
    }
    GMTrace.o(11037394862080L, 82235);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(11036589555712L, 82229);
    w.d("MicroMsg.DeviceProfileHeaderPreference", "onBindView");
    this.kEk = ((ImageView)paramView.findViewById(R.h.bfl));
    this.kEl = ((TextView)paramView.findViewById(R.h.bPo));
    this.kEm = ((TextView)paramView.findViewById(R.h.bvv));
    this.kEn = ((TextView)paramView.findViewById(R.h.btK));
    this.kEo = paramView.findViewById(R.h.bvw);
    this.kEp = ((TextView)paramView.findViewById(R.h.btJ));
    w(this.kEk, 0);
    w(this.kEl, 2);
    w(this.kEm, 1);
    w(this.kEn, 3);
    w(this.kEo, 4);
    w(this.kEp, 5);
    this.kEu = true;
    if (!this.kEu) {
      w.w("MicroMsg.DeviceProfileHeaderPreference", "initView : bindView = " + this.kEu);
    }
    for (;;)
    {
      super.onBindView(paramView);
      GMTrace.o(11036589555712L, 82229);
      return;
      this.kEl.setText(this.uD);
      this.kEn.setText(this.joJ);
      this.kEp.setText(this.kEs);
      cS(this.kEt);
    }
  }
  
  public final void setName(CharSequence paramCharSequence)
  {
    GMTrace.i(11037126426624L, 82233);
    this.uD = paramCharSequence;
    if (this.kEl != null) {
      this.kEl.setText(paramCharSequence);
    }
    GMTrace.o(11037126426624L, 82233);
  }
  
  public final void w(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    GMTrace.i(11036857991168L, 82231);
    Object localObject;
    int j;
    switch (paramInt)
    {
    default: 
      GMTrace.o(11036857991168L, 82231);
      return;
    case 0: 
      localObject = this.kEk;
      boolean[] arrayOfBoolean = this.kEq;
      if (!paramBoolean)
      {
        j = 1;
        label76:
        arrayOfBoolean[paramInt] = j;
        if (localObject != null) {
          if (!paramBoolean) {
            break label159;
          }
        }
      }
      break;
    }
    label159:
    for (paramInt = i;; paramInt = 8)
    {
      ((View)localObject).setVisibility(paramInt);
      GMTrace.o(11036857991168L, 82231);
      return;
      localObject = this.kEl;
      break;
      localObject = this.kEm;
      break;
      localObject = this.kEn;
      break;
      localObject = this.kEo;
      break;
      localObject = this.kEp;
      break;
      j = 0;
      break label76;
    }
  }
  
  public final void wW(String paramString)
  {
    GMTrace.i(11037260644352L, 82234);
    this.joJ = paramString;
    if (this.kEn != null) {
      this.kEn.setText(paramString);
    }
    GMTrace.o(11037260644352L, 82234);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\DeviceProfileHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */