package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;

public class ProfileEditPhoneNumberView
  extends ProfileItemView
  implements MMPhoneNumberEditText.a
{
  public String tuh;
  public String tui;
  public String[] tuj;
  private LinearLayout tuk;
  private boolean tul;
  public a tum;
  
  public ProfileEditPhoneNumberView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1182995054592L, 8814);
    this.tul = false;
    GMTrace.o(1182995054592L, 8814);
  }
  
  public ProfileEditPhoneNumberView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1183129272320L, 8815);
    this.tul = false;
    GMTrace.o(1183129272320L, 8815);
  }
  
  private void aR(String paramString, boolean paramBoolean)
  {
    GMTrace.i(1184739885056L, 8827);
    MMPhoneNumberEditText localMMPhoneNumberEditText = (MMPhoneNumberEditText)LayoutInflater.from(getContext()).inflate(R.i.cDJ, null);
    localMMPhoneNumberEditText.setHint(ab.getResources().getString(R.l.cQv));
    if (paramBoolean)
    {
      localMMPhoneNumberEditText.ttO = true;
      localMMPhoneNumberEditText.ttM = localMMPhoneNumberEditText.getResources().getDrawable(R.k.cMP);
      localMMPhoneNumberEditText.ttM.setBounds(0, 0, localMMPhoneNumberEditText.ttM.getIntrinsicWidth(), localMMPhoneNumberEditText.ttM.getIntrinsicHeight());
      localMMPhoneNumberEditText.setFocusable(false);
      localMMPhoneNumberEditText.bKS();
    }
    localMMPhoneNumberEditText.ttN = this;
    localMMPhoneNumberEditText.setText(paramString);
    localMMPhoneNumberEditText.setSelection(localMMPhoneNumberEditText.getText().length());
    paramString = new LinearLayout.LayoutParams(-1, -2);
    paramString.setMargins(0, a.fromDPToPix(getContext(), 12), 0, 0);
    this.tuk.addView(localMMPhoneNumberEditText, paramString);
    GMTrace.o(1184739885056L, 8827);
  }
  
  private void bLb()
  {
    GMTrace.i(1184068796416L, 8822);
    if (this.tum != null) {
      this.tum.aic();
    }
    GMTrace.o(1184068796416L, 8822);
  }
  
  private void h(MMPhoneNumberEditText paramMMPhoneNumberEditText)
  {
    GMTrace.i(1184874102784L, 8828);
    this.tuk.removeView(paramMMPhoneNumberEditText);
    this.tuk.getChildAt(this.tuk.getChildCount() - 1).requestFocus();
    GMTrace.o(1184874102784L, 8828);
  }
  
  public final boolean L(x paramx)
  {
    GMTrace.i(1183666143232L, 8819);
    this.kse = paramx;
    GMTrace.o(1183666143232L, 8819);
    return true;
  }
  
  public final int aXW()
  {
    GMTrace.i(1183263490048L, 8816);
    int i = R.i.cDK;
    GMTrace.o(1183263490048L, 8816);
    return i;
  }
  
  public final boolean aXX()
  {
    GMTrace.i(1183800360960L, 8820);
    int j;
    if (!bg.nm(this.tuh))
    {
      aR(this.tuh, true);
      j = 1;
    }
    for (int i = 1;; i = 0)
    {
      int k = i;
      if (!bg.nm(this.tui))
      {
        this.tuj = this.tui.split(",");
        for (;;)
        {
          k = i;
          if (i >= this.tuj.length + j) {
            break;
          }
          aR(this.tuj[(i - j)].trim(), false);
          i += 1;
        }
      }
      if (k < 5) {
        aR(null, false);
      }
      for (this.tul = false;; this.tul = true)
      {
        GMTrace.o(1183800360960L, 8820);
        return false;
      }
      j = 0;
    }
  }
  
  public final void bKU()
  {
    GMTrace.i(1184471449600L, 8825);
    if (this.tuk.getChildCount() - 1 < 5) {
      aR(null, false);
    }
    for (;;)
    {
      bLb();
      GMTrace.o(1184471449600L, 8825);
      return;
      this.tul = true;
    }
  }
  
  public final void bKV()
  {
    GMTrace.i(1184337231872L, 8824);
    bLb();
    GMTrace.o(1184337231872L, 8824);
  }
  
  public final ArrayList<String> bLa()
  {
    GMTrace.i(1183934578688L, 8821);
    int j = this.tuk.getChildCount();
    if (j == 1)
    {
      GMTrace.o(1183934578688L, 8821);
      return null;
    }
    ArrayList localArrayList = new ArrayList(j - 1);
    int i = 1;
    while (i < j)
    {
      String str = ((MMPhoneNumberEditText)this.tuk.getChildAt(i)).getText().toString();
      if (!bg.nm(str)) {
        localArrayList.add(str);
      }
      i += 1;
    }
    if (!bg.nm(this.tuh)) {
      localArrayList.remove(0);
    }
    GMTrace.o(1183934578688L, 8821);
    return localArrayList;
  }
  
  public void clearFocus()
  {
    GMTrace.i(1183531925504L, 8818);
    int i = 1;
    while (i < this.tuk.getChildCount())
    {
      this.tuk.getChildAt(i).clearFocus();
      i += 1;
    }
    GMTrace.o(1183531925504L, 8818);
  }
  
  public final void f(final MMPhoneNumberEditText paramMMPhoneNumberEditText)
  {
    GMTrace.i(1184203014144L, 8823);
    if (paramMMPhoneNumberEditText.ttO)
    {
      h.a(getContext(), R.l.dCP, 0, R.l.dCO, R.l.dCN, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1152796065792L, 8589);
          ProfileEditPhoneNumberView.this.tuh = "";
          ProfileEditPhoneNumberView.this.tum.bLc();
          ProfileEditPhoneNumberView.a(ProfileEditPhoneNumberView.this, paramMMPhoneNumberEditText);
          if (!ProfileEditPhoneNumberView.a(ProfileEditPhoneNumberView.this)) {
            ProfileEditPhoneNumberView.b(ProfileEditPhoneNumberView.this);
          }
          GMTrace.o(1152796065792L, 8589);
        }
      }, null);
      GMTrace.o(1184203014144L, 8823);
      return;
    }
    h(paramMMPhoneNumberEditText);
    if (this.tul)
    {
      aR(null, false);
      this.tul = false;
    }
    bLb();
    GMTrace.o(1184203014144L, 8823);
  }
  
  public final void g(MMPhoneNumberEditText paramMMPhoneNumberEditText)
  {
    GMTrace.i(1184605667328L, 8826);
    if (this.tuk.getChildCount() - 1 == 1)
    {
      GMTrace.o(1184605667328L, 8826);
      return;
    }
    h(paramMMPhoneNumberEditText);
    if (this.tul) {
      aR(null, false);
    }
    this.tul = false;
    bLb();
    GMTrace.o(1184605667328L, 8826);
  }
  
  public final void init()
  {
    GMTrace.i(1183397707776L, 8817);
    this.tuk = ((LinearLayout)findViewById(R.h.bLS));
    GMTrace.o(1183397707776L, 8817);
  }
  
  public static abstract interface a
  {
    public abstract void aic();
    
    public abstract void bLc();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\ProfileEditPhoneNumberView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */