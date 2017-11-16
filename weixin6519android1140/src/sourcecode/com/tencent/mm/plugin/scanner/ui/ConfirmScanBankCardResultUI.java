package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.oc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class ConfirmScanBankCardResultUI
  extends MMActivity
{
  protected static final Map<String, Bitmap> ovB;
  protected Bitmap mBmp;
  private String ovA;
  private ImageView ovC;
  private EditText ovD;
  
  static
  {
    GMTrace.i(6155761876992L, 45864);
    ovB = new HashMap();
    GMTrace.o(6155761876992L, 45864);
  }
  
  public ConfirmScanBankCardResultUI()
  {
    GMTrace.i(6154553917440L, 45855);
    this.mBmp = null;
    this.ovA = null;
    GMTrace.o(6154553917440L, 45855);
  }
  
  public static void c(Bitmap paramBitmap, String paramString)
  {
    GMTrace.i(6154688135168L, 45856);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()) || (bg.nm(paramString)))
    {
      GMTrace.o(6154688135168L, 45856);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(ab.getContext(), ConfirmScanBankCardResultUI.class);
    localIntent.addFlags(268435456);
    localIntent.putExtra("_card_num_", paramString);
    paramString = "_image_cache_key_" + paramString;
    ovB.put(paramString, paramBitmap);
    localIntent.putExtra("_image_cache_key_", paramString);
    ab.getContext().startActivity(localIntent);
    GMTrace.o(6154688135168L, 45856);
  }
  
  protected final int Qf()
  {
    GMTrace.i(6155359223808L, 45861);
    GMTrace.o(6155359223808L, 45861);
    return 1;
  }
  
  public void finish()
  {
    GMTrace.i(6155090788352L, 45859);
    Intent localIntent = new Intent();
    localIntent.putExtra("BaseScanUI_select_scan_mode", 7);
    localIntent.putExtra("scan_bankcard_with_confirm_ui", true);
    localIntent.addFlags(268435456);
    localIntent.setClass(this, BaseScanUI.class);
    startActivity(localIntent);
    super.finish();
    GMTrace.o(6155090788352L, 45859);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6155225006080L, 45860);
    int i = R.i.ctF;
    GMTrace.o(6155225006080L, 45860);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6154822352896L, 45857);
    super.onCreate(paramBundle);
    oM(R.l.dVV);
    int i;
    if (getIntent() == null)
    {
      w.e("MicroMsg.ConfirmScanBankCardResultUI", "intent is null, return");
      i = 0;
    }
    while (i == 0)
    {
      finish();
      GMTrace.o(6154822352896L, 45857);
      return;
      this.ovA = getIntent().getStringExtra("_image_cache_key_");
      if (bg.nm(this.ovA))
      {
        w.e("MicroMsg.ConfirmScanBankCardResultUI", "bmp cache key is null or nil");
        i = 0;
      }
      else
      {
        this.mBmp = ((Bitmap)ovB.get(this.ovA));
        if ((this.mBmp == null) || (this.mBmp.isRecycled()))
        {
          w.e("MicroMsg.ConfirmScanBankCardResultUI", "bmp invalid, return");
          i = 0;
        }
        else
        {
          i = 1;
        }
      }
    }
    paramBundle = getIntent().getStringExtra("_card_num_");
    if (bg.nm(paramBundle))
    {
      w.e("MicroMsg.ConfirmScanBankCardResultUI", "cardNum is null or nil");
      finish();
      GMTrace.o(6154822352896L, 45857);
      return;
    }
    this.ovC = ((ImageView)findViewById(R.h.bGu));
    this.ovD = ((EditText)findViewById(R.h.bvu));
    this.ovC.setImageBitmap(this.mBmp);
    this.ovD.setText(paramBundle);
    findViewById(R.h.biG).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6081002602496L, 45307);
        if (ConfirmScanBankCardResultUI.a(ConfirmScanBankCardResultUI.this) != null)
        {
          paramAnonymousView = ConfirmScanBankCardResultUI.a(ConfirmScanBankCardResultUI.this).getEditableText().toString();
          if (bg.nm(paramAnonymousView))
          {
            GMTrace.o(6081002602496L, 45307);
            return;
          }
          oc localoc = new oc();
          localoc.eTa.action = 1;
          localoc.eTa.cardNum = paramAnonymousView;
          com.tencent.mm.sdk.b.a.vgX.m(localoc);
          ConfirmScanBankCardResultUI.b(ConfirmScanBankCardResultUI.this);
        }
        GMTrace.o(6081002602496L, 45307);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6132273774592L, 45689);
        ConfirmScanBankCardResultUI.this.finish();
        GMTrace.o(6132273774592L, 45689);
        return true;
      }
    });
    GMTrace.o(6154822352896L, 45857);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6154956570624L, 45858);
    super.onDestroy();
    if (this.ovC != null) {
      this.ovC.setImageBitmap(null);
    }
    if (!bg.nm(this.ovA)) {
      ovB.remove(this.ovA);
    }
    if (this.mBmp != null) {
      this.mBmp.recycle();
    }
    GMTrace.o(6154956570624L, 45858);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\ConfirmScanBankCardResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */