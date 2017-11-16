package com.tencent.mm.wallet_core.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.cg;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.ui.base.q;
import java.util.ArrayList;

public final class c
{
  public q hwd;
  private ImageView hwe;
  private View hwf;
  private View.OnClickListener hwh;
  private MMActivity iPC;
  public boolean jER;
  private Bitmap jIK;
  private View jIN;
  private ImageView jIO;
  private MMVerticalTextView jIP;
  private ArrayList<Bitmap> jIR;
  public Bitmap nBT;
  public Bitmap nBU;
  private String nCo;
  private String nzY;
  public ViewGroup xEH;
  private boolean xEI;
  
  public c(MMActivity paramMMActivity)
  {
    this(paramMMActivity, false);
    GMTrace.i(1508204609536L, 11237);
    GMTrace.o(1508204609536L, 11237);
  }
  
  public c(MMActivity paramMMActivity, boolean paramBoolean)
  {
    GMTrace.i(1508070391808L, 11236);
    this.nBT = null;
    this.nBU = null;
    this.jIK = null;
    this.nCo = "";
    this.nzY = "";
    this.jER = true;
    this.jIR = new ArrayList();
    this.hwd = null;
    this.xEI = false;
    this.hwh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1503775424512L, 11204);
        if (((paramAnonymousView.getId() == a.f.bTF) || (paramAnonymousView.getId() == a.f.bTD)) && (c.this.hwd != null) && (c.this.hwd.isShowing())) {
          c.this.hwd.dismiss();
        }
        GMTrace.o(1503775424512L, 11204);
      }
    };
    this.iPC = paramMMActivity;
    this.xEI = paramBoolean;
    GMTrace.o(1508070391808L, 11236);
  }
  
  private void cmk()
  {
    GMTrace.i(1509009915904L, 11243);
    if (this.jER)
    {
      this.jIO.setOnClickListener(this.hwh);
      Bitmap localBitmap = this.jIK;
      if (this.nBU != null)
      {
        this.jIK = e.t(this.nBU);
        w.i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp != null");
      }
      for (;;)
      {
        this.jIO.setImageBitmap(this.jIK);
        this.jIR.add(0, localBitmap);
        if (this.jIR.size() < 2) {
          break;
        }
        int i = this.jIR.size() - 1;
        while (i > 1)
        {
          e.u((Bitmap)this.jIR.remove(i));
          i -= 1;
        }
        this.jIK = null;
        w.e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp == null");
      }
      this.hwf.setVisibility(8);
      this.jIN.setVisibility(0);
      this.jIP.setText(e.XC(this.nzY));
      this.hwd.update();
      GMTrace.o(1509009915904L, 11243);
      return;
    }
    this.hwe.setOnClickListener(this.hwh);
    this.hwe.setImageBitmap(this.nBT);
    if (this.nBT != null) {
      w.e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp != null");
    }
    for (;;)
    {
      this.hwf.setVisibility(0);
      this.jIN.setVisibility(8);
      break;
      w.i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp == null");
    }
  }
  
  public final void cmi()
  {
    GMTrace.i(1508875698176L, 11242);
    if ((this.hwd != null) && (this.hwd.isShowing())) {
      cmk();
    }
    GMTrace.o(1508875698176L, 11242);
  }
  
  public final void cmj()
  {
    GMTrace.i(16865128611840L, 125655);
    if (this.xEH != null) {
      this.xEH.setVisibility(0);
    }
    GMTrace.o(16865128611840L, 125655);
  }
  
  public final void dismiss()
  {
    GMTrace.i(16865262829568L, 125656);
    if ((this.hwd != null) && (this.hwd.isShowing())) {
      this.hwd.dismiss();
    }
    GMTrace.o(16865262829568L, 125656);
  }
  
  public final void ft(String paramString1, String paramString2)
  {
    GMTrace.i(1508338827264L, 11238);
    this.nCo = paramString1;
    this.nzY = paramString2;
    GMTrace.o(1508338827264L, 11238);
  }
  
  public final void init()
  {
    GMTrace.i(1508473044992L, 11239);
    View localView;
    if (this.hwd == null)
    {
      if (!this.xEI) {
        break label226;
      }
      localView = View.inflate(this.iPC, a.g.sPJ, null);
      MMVerticalTextView localMMVerticalTextView = (MMVerticalTextView)localView.findViewById(a.f.sCw);
      this.xEH = ((ViewGroup)localView.findViewById(a.f.sEu));
      localMMVerticalTextView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1507265085440L, 11230);
          w.d("MicroMsg.OfflinePopupWindow", "on click know");
          c.this.xEH.setVisibility(8);
          paramAnonymousView = new cg();
          paramAnonymousView.eDF.eDG = 1;
          a.vgX.m(paramAnonymousView);
          GMTrace.o(1507265085440L, 11230);
        }
      });
      localView.findViewById(a.f.sEt).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16864323305472L, 125649);
          w.d("MicroMsg.OfflinePopupWindow", "root on click");
          if ((c.this.hwd != null) && (c.this.hwd.isShowing())) {
            c.this.hwd.dismiss();
          }
          GMTrace.o(16864323305472L, 125649);
        }
      });
    }
    for (;;)
    {
      this.hwf = localView.findViewById(a.f.bTG);
      this.hwe = ((ImageView)localView.findViewById(a.f.bTF));
      this.jIN = localView.findViewById(a.f.bTE);
      this.jIO = ((ImageView)localView.findViewById(a.f.bTD));
      this.jIP = ((MMVerticalTextView)localView.findViewById(a.f.cjY));
      this.hwd = new q(localView, -1, -1, true);
      this.hwd.setClippingEnabled(false);
      this.hwd.update();
      this.hwd.setBackgroundDrawable(new ColorDrawable(16777215));
      this.hwd.setOnDismissListener(new PopupWindow.OnDismissListener()
      {
        public final void onDismiss()
        {
          GMTrace.i(16864994394112L, 125654);
          GMTrace.o(16864994394112L, 125654);
        }
      });
      GMTrace.o(1508473044992L, 11239);
      return;
      label226:
      localView = View.inflate(this.iPC, a.g.sPM, null);
      localView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16864591740928L, 125651);
          if ((c.this.hwd != null) && (c.this.hwd.isShowing())) {
            c.this.hwd.dismiss();
          }
          GMTrace.o(16864591740928L, 125651);
        }
      });
    }
  }
  
  public final void release()
  {
    GMTrace.i(1508607262720L, 11240);
    if ((this.hwd != null) && (this.hwd.isShowing())) {
      this.hwd.dismiss();
    }
    e.u(this.jIK);
    e.an(this.jIR);
    this.jIR.clear();
    this.iPC = null;
    GMTrace.o(1508607262720L, 11240);
  }
  
  public final void v(View paramView, boolean paramBoolean)
  {
    GMTrace.i(1508741480448L, 11241);
    this.jER = paramBoolean;
    if ((this.hwd != null) && (!this.hwd.isShowing()))
    {
      this.hwd.showAtLocation(paramView.getRootView(), 17, 0, 0);
      this.hwd.setFocusable(true);
      this.hwd.setTouchable(true);
      this.hwd.setBackgroundDrawable(new ColorDrawable(16777215));
      this.hwd.setOutsideTouchable(true);
      if (this.jER) {
        cmj();
      }
      cmk();
    }
    GMTrace.o(1508741480448L, 11241);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */