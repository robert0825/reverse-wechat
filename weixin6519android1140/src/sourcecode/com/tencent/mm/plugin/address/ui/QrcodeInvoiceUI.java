package com.tencent.mm.plugin.address.ui;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.o.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p.b;

public class QrcodeInvoiceUI
  extends MMActivity
{
  private int huL;
  private TextView huQ;
  private Dialog hul;
  private InvoiceQrcodeTextView hvV;
  private InvoiceQrcodeTextView hvW;
  private InvoiceQrcodeTextView hvX;
  private InvoiceQrcodeTextView hvY;
  private InvoiceQrcodeTextView hvZ;
  private b hva;
  private InvoiceQrcodeTextView hwa;
  private InvoiceQrcodeTextView hwb;
  Bitmap hwc;
  q hwd;
  ImageView hwe;
  View hwf;
  private float hwg;
  View.OnClickListener hwh;
  private View.OnClickListener hwi;
  
  public QrcodeInvoiceUI()
  {
    GMTrace.i(15654484705280L, 116635);
    this.huL = 0;
    this.hva = null;
    this.hul = null;
    this.hwd = null;
    this.hwg = 0.0F;
    this.hwh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(15650458173440L, 116605);
        if ((paramAnonymousView.getId() == R.h.bId) && (QrcodeInvoiceUI.b(QrcodeInvoiceUI.this) != null) && (QrcodeInvoiceUI.b(QrcodeInvoiceUI.this).isShowing())) {
          QrcodeInvoiceUI.b(QrcodeInvoiceUI.this).dismiss();
        }
        GMTrace.o(15650458173440L, 116605);
      }
    };
    this.hwi = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(15654082052096L, 116632);
        QrcodeInvoiceUI localQrcodeInvoiceUI;
        if ((paramAnonymousView.getId() == R.h.bIf) && (QrcodeInvoiceUI.b(QrcodeInvoiceUI.this) != null))
        {
          localQrcodeInvoiceUI = QrcodeInvoiceUI.this;
          if ((localQrcodeInvoiceUI.hwd != null) && (!localQrcodeInvoiceUI.hwd.isShowing()))
          {
            localQrcodeInvoiceUI.hwd.showAtLocation(paramAnonymousView.getRootView(), 17, 0, 0);
            localQrcodeInvoiceUI.hwd.setFocusable(true);
            localQrcodeInvoiceUI.hwd.setTouchable(true);
            localQrcodeInvoiceUI.hwd.setBackgroundDrawable(new ColorDrawable(16777215));
            localQrcodeInvoiceUI.hwd.setOutsideTouchable(true);
            localQrcodeInvoiceUI.hwf.setVisibility(0);
            localQrcodeInvoiceUI.hwe.setOnClickListener(localQrcodeInvoiceUI.hwh);
            localQrcodeInvoiceUI.hwe.setImageBitmap(localQrcodeInvoiceUI.hwc);
            if (localQrcodeInvoiceUI.hwc == null) {
              break label172;
            }
            w.e("MicroMsg.QrcodeInvoiceUI", "updatePopWindowContent mQRCodeBmp != null");
          }
        }
        for (;;)
        {
          localQrcodeInvoiceUI.hwd.update();
          QrcodeInvoiceUI.d(QrcodeInvoiceUI.this);
          GMTrace.o(15654082052096L, 116632);
          return;
          label172:
          w.i("MicroMsg.QrcodeInvoiceUI", "updatePopWindowContent mQRCodeBmp == null");
        }
      }
    };
    GMTrace.o(15654484705280L, 116635);
  }
  
  public final void MP()
  {
    GMTrace.i(15654887358464L, 116638);
    findViewById(R.h.bVD);
    this.hvV = ((InvoiceQrcodeTextView)findViewById(R.h.bVF));
    if (this.hvV != null) {
      this.hvV.QZ();
    }
    this.hvW = ((InvoiceQrcodeTextView)findViewById(R.h.bVB));
    if (this.hvW != null) {
      this.hvW.QZ();
    }
    this.hvX = ((InvoiceQrcodeTextView)findViewById(R.h.bVE));
    if (this.hvX != null) {
      this.hvX.QZ();
    }
    this.hvY = ((InvoiceQrcodeTextView)findViewById(R.h.bVA));
    if (this.hvY != null) {
      this.hvY.QZ();
    }
    this.hvZ = ((InvoiceQrcodeTextView)findViewById(R.h.bVC));
    if (this.hvZ != null) {
      this.hvZ.QZ();
    }
    this.hwa = ((InvoiceQrcodeTextView)findViewById(R.h.bVy));
    if (this.hwa != null) {
      this.hwa.QZ();
    }
    this.hwb = ((InvoiceQrcodeTextView)findViewById(R.h.bVz));
    if (this.hwb != null) {
      this.hwb.QZ();
    }
    this.hvX.hvy = true;
    this.hvX.hvr = true;
    if (this.huL != 0)
    {
      this.huQ = ((TextView)findViewById(R.h.bVH));
      this.hva = com.tencent.mm.plugin.address.a.a.QN().hL(this.huL);
      if (this.hva == null)
      {
        w.i("MicroMsg.QrcodeInvoiceUI", "invoiceSvrObj is null ,now finish..");
        finish();
      }
      if ((this.hva != null) && (this.hva.type != null) && (this.hva.type.equals("0")))
      {
        this.huQ.setText(getString(R.l.dDO));
        this.hvW.setVisibility(8);
        if ((this.hva.mhS != null) && (!this.hva.mhS.equals("")))
        {
          this.hvX.setVisibility(0);
          this.hvX.nG(this.hva.mhS);
          if ((this.hva.mhY == null) || (this.hva.mhY.equals(""))) {
            break label907;
          }
          this.hvY.setVisibility(0);
          this.hvY.nG(this.hva.mhY);
          label430:
          if ((this.hva.mhW == null) || (this.hva.mhW.equals(""))) {
            break label919;
          }
          this.hvZ.setVisibility(0);
          this.hvZ.nG(this.hva.mhW);
          label477:
          if ((this.hva.mhU == null) || (this.hva.mhU.equals(""))) {
            break label931;
          }
          this.hwa.setVisibility(0);
          this.hwa.nG(this.hva.mhU);
          label524:
          if ((this.hva.mhT == null) || (this.hva.mhT.equals(""))) {
            break label943;
          }
          this.hwb.setVisibility(0);
          this.hwb.nG(this.hva.mhT);
          label571:
          this.huQ.setVisibility(0);
          if (this.hva != null)
          {
            this.hvV.nG(this.hva.title);
            this.hvW.nG(this.hva.mhR);
          }
          if (this.hwd == null)
          {
            localObject = View.inflate(this, R.i.czY, null);
            ((View)localObject).setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(15654350487552L, 116634);
                if ((QrcodeInvoiceUI.b(QrcodeInvoiceUI.this) != null) && (QrcodeInvoiceUI.b(QrcodeInvoiceUI.this).isShowing())) {
                  QrcodeInvoiceUI.b(QrcodeInvoiceUI.this).dismiss();
                }
                GMTrace.o(15654350487552L, 116634);
              }
            });
            this.hwf = ((View)localObject).findViewById(R.h.bIe);
            this.hwe = ((ImageView)((View)localObject).findViewById(R.h.bId));
            this.hwd = new q((View)localObject, -1, -1, true);
            this.hwd.setClippingEnabled(false);
            this.hwd.update();
            this.hwd.setBackgroundDrawable(new ColorDrawable(16777215));
            this.hwd.setOnDismissListener(new PopupWindow.OnDismissListener()
            {
              public final void onDismiss()
              {
                GMTrace.i(15653813616640L, 116630);
                QrcodeInvoiceUI.c(QrcodeInvoiceUI.this);
                GMTrace.o(15653813616640L, 116630);
              }
            });
          }
        }
      }
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(15653276745728L, 116626);
          QrcodeInvoiceUI.this.setResult(0);
          QrcodeInvoiceUI.this.finish();
          GMTrace.o(15653276745728L, 116626);
          return true;
        }
      });
      a(0, getString(R.l.cSC), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(15653545181184L, 116628);
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.setClass(QrcodeInvoiceUI.this, AddInvoiceUI.class);
          paramAnonymousMenuItem.putExtra("invoice_id", QrcodeInvoiceUI.a(QrcodeInvoiceUI.this));
          QrcodeInvoiceUI.this.startActivity(paramAnonymousMenuItem);
          GMTrace.o(15653545181184L, 116628);
          return true;
        }
      }, p.b.vLG);
      if ((this.hva == null) || (this.hva.mhZ == null) || (this.hva.mhZ.equals(""))) {
        break label1074;
      }
      localObject = (ImageView)findViewById(R.h.bIf);
      if (localObject != null)
      {
        ((ImageView)localObject).setVisibility(0);
        this.hwc = com.tencent.mm.bo.a.a.b(this, this.hva.mhZ, 0, 3);
        ((ImageView)localObject).setImageBitmap(this.hwc);
        ((ImageView)localObject).setOnClickListener(this.hwi);
      }
      localObject = findViewById(R.h.bIg);
      if (localObject != null) {
        ((View)localObject).setVisibility(0);
      }
      localObject = (TextView)findViewById(R.h.bVw);
      if (localObject != null) {
        ((TextView)localObject).setVisibility(0);
      }
      GMTrace.o(15654887358464L, 116638);
      return;
      this.hvX.setVisibility(8);
      break;
      label907:
      this.hvY.setVisibility(8);
      break label430;
      label919:
      this.hvZ.setVisibility(8);
      break label477;
      label931:
      this.hwa.setVisibility(8);
      break label524;
      label943:
      this.hwb.setVisibility(8);
      break label571;
      if ((this.hva == null) || (this.hva.type == null) || (!this.hva.type.equals("1"))) {
        break label571;
      }
      this.huQ.setText(getString(R.l.dDQ));
      this.hvV.setVisibility(8);
      this.hvX.setVisibility(8);
      this.hvY.setVisibility(8);
      this.hvZ.setVisibility(8);
      this.hwa.setVisibility(8);
      this.hwb.setVisibility(8);
      break label571;
      w.i("MicroMsg.QrcodeInvoiceUI", "serverId is 0,now finish...");
      finish();
    }
    label1074:
    Object localObject = (ImageView)findViewById(R.h.bIf);
    if (localObject != null) {
      ((ImageView)localObject).setVisibility(8);
    }
    localObject = findViewById(R.h.bIg);
    if (localObject != null) {
      ((View)localObject).setVisibility(8);
    }
    localObject = (TextView)findViewById(R.h.bVw);
    if (localObject != null) {
      ((TextView)localObject).setVisibility(8);
    }
    GMTrace.o(15654887358464L, 116638);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(15655290011648L, 116641);
    int i = R.i.cCm;
    GMTrace.o(15655290011648L, 116641);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(15655155793920L, 116640);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(15655155793920L, 116640);
      return;
      if (paramInt2 == -1)
      {
        String str = paramIntent.getStringExtra("karea_result");
        if (!bg.nm(str))
        {
          w.d("MicroMsg.QrcodeInvoiceUI", "AREA_RESULT:" + str);
          this.hvZ.nG(str);
        }
        paramIntent = paramIntent.getStringExtra("kpost_code");
        if (!bg.nm(paramIntent))
        {
          w.d("MicroMsg.QrcodeInvoiceUI", "post:" + paramIntent);
          this.hvZ.nG(paramIntent);
        }
        GMTrace.o(15655155793920L, 116640);
        return;
        if (paramInt2 != -1) {
          w.i("MicroMsg.QrcodeInvoiceUI", "MallRecharge pay result : cancel");
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(15654618923008L, 116636);
    super.onCreate(paramBundle);
    w.d("MicroMsg.QrcodeInvoiceUI", "index Oncreate");
    this.huL = getIntent().getIntExtra("invoice_id", 0);
    oM(R.l.dDS);
    GMTrace.o(15654618923008L, 116636);
  }
  
  public void onDestroy()
  {
    GMTrace.i(15655021576192L, 116639);
    super.onDestroy();
    GMTrace.o(15655021576192L, 116639);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(15655424229376L, 116642);
    if (paramInt == 4)
    {
      setResult(0);
      finish();
      GMTrace.o(15655424229376L, 116642);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(15655424229376L, 116642);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(15654753140736L, 116637);
    getWindow().setSoftInputMode(3);
    super.onResume();
    MP();
    GMTrace.o(15654753140736L, 116637);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\ui\QrcodeInvoiceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */