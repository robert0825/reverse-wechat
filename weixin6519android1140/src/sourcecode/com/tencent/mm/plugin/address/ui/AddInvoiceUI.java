package com.tencent.mm.plugin.address.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.address.model.i;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.ags;
import com.tencent.mm.protocal.c.azw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public class AddInvoiceUI
  extends MMActivity
  implements e, InvoiceEditView.a
{
  private int IJ;
  private String eQO;
  private int huL;
  private Button huM;
  private Button huN;
  private TextView huO;
  private TextView huP;
  private TextView huQ;
  private TextView huR;
  private InvoiceEditView huS;
  private InvoiceEditView huT;
  private InvoiceEditView huU;
  private InvoiceEditView huV;
  private InvoiceEditView huW;
  private InvoiceEditView huX;
  private InvoiceEditView huY;
  private InvoiceEditView huZ;
  private Dialog hul;
  private com.tencent.mm.plugin.o.a.b hva;
  private com.tencent.mm.plugin.o.a.b hvb;
  private boolean hvc;
  private boolean hvd;
  
  public AddInvoiceUI()
  {
    GMTrace.i(15203647356928L, 113276);
    this.huL = 0;
    this.huM = null;
    this.huN = null;
    this.huR = null;
    this.hva = null;
    this.hvb = new com.tencent.mm.plugin.o.a.b();
    this.hul = null;
    this.hvc = false;
    this.hvd = false;
    this.eQO = "";
    this.IJ = 0;
    GMTrace.o(15203647356928L, 113276);
  }
  
  private boolean QS()
  {
    boolean bool3 = false;
    GMTrace.i(15204586881024L, 113283);
    boolean bool4 = true;
    boolean bool5 = true;
    boolean bool2 = true;
    boolean bool1;
    if (((this.huN != null) && (this.huN.isActivated())) || ((this.hva != null) && (this.hva.type != null) && (this.hva.type.equals("0"))))
    {
      this.huV.setVisibility(0);
      this.huW.setVisibility(0);
      this.huX.setVisibility(0);
      this.huY.setVisibility(0);
      this.huZ.setVisibility(0);
      this.huT.setVisibility(0);
      this.huU.setVisibility(8);
      bool1 = bool2;
      if (!this.huN.isActivated())
      {
        bool1 = bool2;
        if (!this.hva.type.equals("0")) {
          bool1 = false;
        }
      }
      if (!this.huT.QW())
      {
        if (this.huT.getText().length() > 100) {
          S(getString(R.l.bIl), 100);
        }
        bool1 = false;
      }
      if ((this.huN == null) || (!this.huN.isActivated()) || (this.huT.getText().length() != 0)) {
        break label926;
      }
      bool1 = false;
    }
    label923:
    label926:
    for (;;)
    {
      lf(bool1);
      if (!this.huV.QW())
      {
        if (this.huV.getText().length() > 0)
        {
          ViewStub localViewStub = (ViewStub)findViewById(R.h.clg);
          if (localViewStub != null)
          {
            localViewStub.inflate();
            this.huO = ((TextView)findViewById(R.h.clf));
          }
          if (this.huO != null) {
            this.huO.setVisibility(0);
          }
        }
        if (!this.huW.QW())
        {
          if (this.huW.getText().length() > 100) {
            S(getString(R.l.bHX), 100);
          }
          bool1 = false;
        }
        if (!this.huX.QW())
        {
          if (this.huX.getText().length() > 100) {
            S(getString(R.l.bIc), 100);
          }
          bool1 = false;
        }
        if (!this.huY.QW())
        {
          if (this.huY.getText().length() > 100) {
            S(getString(R.l.bHU), 100);
          }
          bool1 = false;
        }
        if (this.huZ.QW()) {
          break label923;
        }
        bool1 = bool3;
        if (this.huZ.getText().length() > 48)
        {
          S(getString(R.l.bHV), 39);
          bool1 = bool3;
        }
      }
      for (;;)
      {
        GMTrace.o(15204586881024L, 113283);
        return bool1;
        if (this.huO == null) {
          break;
        }
        this.huO.setVisibility(8);
        break;
        if (((this.huM != null) && (this.huM.isActivated())) || ((this.hva != null) && (this.hva.type != null) && (this.hva.type.equals("1"))))
        {
          this.huV.setVisibility(8);
          this.huW.setVisibility(8);
          this.huX.setVisibility(8);
          this.huY.setVisibility(8);
          this.huZ.setVisibility(8);
          this.huT.setVisibility(8);
          this.huU.setVisibility(0);
          bool1 = bool4;
          if (!this.huM.isActivated())
          {
            bool1 = bool4;
            if (!this.hva.type.equals("1")) {
              bool1 = false;
            }
          }
          if (!this.huU.QW())
          {
            if (this.huU.getText().length() > 100) {
              S(getString(R.l.bIl), 100);
            }
            bool1 = false;
          }
          bool2 = bool1;
          if (this.huM != null)
          {
            bool2 = bool1;
            if (this.huM.isActivated())
            {
              bool2 = bool1;
              if (this.huU.getText().length() == 0) {
                bool2 = false;
              }
            }
          }
          lf(bool2);
          bool1 = bool2;
        }
        else
        {
          this.huV.setVisibility(0);
          this.huW.setVisibility(0);
          this.huX.setVisibility(0);
          this.huY.setVisibility(0);
          this.huZ.setVisibility(0);
          this.huU.setVisibility(8);
          this.huT.setVisibility(0);
          this.huU.setVisibility(8);
          bool1 = bool5;
          if (this.huM != null)
          {
            bool1 = bool5;
            if (!this.huM.isActivated())
            {
              bool1 = bool5;
              if (this.huN != null)
              {
                bool1 = bool5;
                if (!this.huN.isActivated()) {
                  bool1 = false;
                }
              }
            }
          }
          if (!this.huT.QW()) {
            bool1 = false;
          }
          if (!this.huV.QW()) {
            bool1 = false;
          }
          if (!this.huW.QW()) {
            bool1 = false;
          }
          if (!this.huX.QW()) {
            bool1 = false;
          }
          bool2 = bool1;
          if (!this.huY.QW()) {
            bool2 = false;
          }
          bool1 = bool3;
          if (this.huZ.QW()) {
            bool1 = bool2;
          }
        }
      }
    }
  }
  
  private void QU()
  {
    int k = 1;
    GMTrace.i(15204989534208L, 113286);
    if (((this.huL != 0) && (this.hva != null) && (this.hvb.type != null) && (!this.hvb.type.equals("")) && (!this.hvb.type.equals(this.hva.type))) || ((this.huL == 0) && (this.hvb.type != null) && (!this.hvb.type.equals("")))) {}
    for (int i = 1;; i = 0)
    {
      int j = i;
      if (this.huM != null)
      {
        j = i;
        if (this.huN != null)
        {
          j = i;
          if (!this.huM.isActivated())
          {
            j = i;
            if (!this.huN.isActivated())
            {
              j = i;
              if (this.hva == null) {
                j = 1;
              }
            }
          }
        }
      }
      if (this.huT.QX()) {
        j = 1;
      }
      if (this.huU.QX()) {
        j = 1;
      }
      if (this.huV.QX()) {
        j = 1;
      }
      if (this.huW.QX()) {
        j = 1;
      }
      if (this.huX.QX()) {
        j = 1;
      }
      if (this.huY.QX()) {
        j = 1;
      }
      if (this.huZ.QX()) {}
      for (i = k;; i = j)
      {
        if (i != 0)
        {
          h.a(this, false, this.vKB.vKW.getString(R.l.dDJ), "", this.vKB.vKW.getString(R.l.dDI), this.vKB.vKW.getString(R.l.dDH), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(15211968856064L, 113338);
              AddInvoiceUI.this.setResult(0);
              AddInvoiceUI.this.finish();
              GMTrace.o(15211968856064L, 113338);
            }
          }, null);
          GMTrace.o(15204989534208L, 113286);
          return;
        }
        setResult(0);
        finish();
        GMTrace.o(15204989534208L, 113286);
        return;
      }
    }
  }
  
  private void S(String paramString, int paramInt)
  {
    GMTrace.i(15205123751936L, 113287);
    h.a(this, getString(R.l.dDL, new Object[] { paramString, Integer.valueOf(paramInt) }), getString(R.l.cUG), false, null);
    GMTrace.o(15205123751936L, 113287);
  }
  
  public final void MP()
  {
    GMTrace.i(15203915792384L, 113278);
    this.IJ = 0;
    MMScrollView localMMScrollView = (MMScrollView)findViewById(R.h.bIj);
    if (localMMScrollView != null) {
      localMMScrollView.a(localMMScrollView, localMMScrollView);
    }
    this.huM = ((Button)findViewById(R.h.bIa));
    if (this.huM != null) {
      this.huM.setVisibility(0);
    }
    this.huN = ((Button)findViewById(R.h.bHY));
    if (this.huN != null) {
      this.huN.setVisibility(0);
    }
    if ((this.huL == 0) && (this.huN != null)) {
      this.huN.setActivated(true);
    }
    if (this.huN != null) {
      this.huN.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(15203513139200L, 113275);
          if (paramAnonymousMotionEvent.getAction() == 0)
          {
            GMTrace.o(15203513139200L, 113275);
            return true;
          }
          if (paramAnonymousMotionEvent.getAction() != 1)
          {
            GMTrace.o(15203513139200L, 113275);
            return false;
          }
          if (!AddInvoiceUI.a(AddInvoiceUI.this).isActivated()) {
            AddInvoiceUI.a(AddInvoiceUI.this).setActivated(true);
          }
          if (AddInvoiceUI.a(AddInvoiceUI.this).isActivated())
          {
            AddInvoiceUI.b(AddInvoiceUI.this).setActivated(false);
            AddInvoiceUI.c(AddInvoiceUI.this).type = "0";
          }
          AddInvoiceUI.d(AddInvoiceUI.this);
          GMTrace.o(15203513139200L, 113275);
          return true;
        }
      });
    }
    if (this.huM != null) {
      this.huM.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(15202842050560L, 113270);
          if (paramAnonymousMotionEvent.getAction() == 0)
          {
            GMTrace.o(15202842050560L, 113270);
            return true;
          }
          if (paramAnonymousMotionEvent.getAction() != 1)
          {
            GMTrace.o(15202842050560L, 113270);
            return false;
          }
          if (!AddInvoiceUI.b(AddInvoiceUI.this).isActivated()) {
            AddInvoiceUI.b(AddInvoiceUI.this).setActivated(true);
          }
          if (AddInvoiceUI.b(AddInvoiceUI.this).isActivated())
          {
            AddInvoiceUI.a(AddInvoiceUI.this).setActivated(false);
            AddInvoiceUI.c(AddInvoiceUI.this).type = "1";
          }
          AddInvoiceUI.d(AddInvoiceUI.this);
          GMTrace.o(15202842050560L, 113270);
          return true;
        }
      });
    }
    this.huS = ((InvoiceEditView)findViewById(R.h.bIm));
    this.huT = ((InvoiceEditView)findViewById(R.h.bIl));
    this.huU = ((InvoiceEditView)findViewById(R.h.bIb));
    this.huV = ((InvoiceEditView)findViewById(R.h.bIk));
    this.huW = ((InvoiceEditView)findViewById(R.h.bHX));
    this.huX = ((InvoiceEditView)findViewById(R.h.bIc));
    this.huY = ((InvoiceEditView)findViewById(R.h.bHU));
    this.huZ = ((InvoiceEditView)findViewById(R.h.bHV));
    this.huV.hvy = true;
    this.huV.hvr = true;
    this.huV.hvz = this;
    this.huS.hvz = this;
    this.huT.hvz = this;
    this.huU.hvz = this;
    this.huW.hvz = this;
    this.huX.hvz = this;
    this.huY.hvz = this;
    this.huZ.hvz = this;
    if (this.huL != 0)
    {
      this.huP = ((TextView)findViewById(R.h.chy));
      this.huP.setVisibility(8);
      this.huQ = ((TextView)findViewById(R.h.cjc));
      this.hva = com.tencent.mm.plugin.address.a.a.QN().hL(this.huL);
      if ((this.hva == null) || (this.hva.type == null) || (!this.hva.type.equals("0"))) {
        break label698;
      }
      this.huQ.setText(getString(R.l.dDO));
      this.huQ.setVisibility(0);
      this.huN.setVisibility(8);
      this.huM.setVisibility(8);
      if (this.hva != null)
      {
        this.huS.nG(this.hva.type);
        this.huT.nG(this.hva.title);
        this.huU.nG(this.hva.mhR);
        this.huV.nG(this.hva.mhS);
        this.huW.nG(this.hva.mhY);
        this.huX.nG(this.hva.mhW);
        this.huY.nG(this.hva.mhU);
        this.huZ.nG(this.hva.mhT);
      }
    }
    if ((this.hvd) || (this.hvc))
    {
      this.huR = ((TextView)findViewById(R.h.bJo));
      if (this.huR != null) {
        this.huR.setVisibility(0);
      }
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(15203244703744L, 113273);
          AddInvoiceUI.e(AddInvoiceUI.this);
          GMTrace.o(15203244703744L, 113273);
          return true;
        }
      });
      a(0, getString(R.l.cUp), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(15201768308736L, 113262);
          if (AddInvoiceUI.f(AddInvoiceUI.this) == 0) {
            g.ork.i(14199, new Object[] { Integer.valueOf(3) });
          }
          while ((AddInvoiceUI.a(AddInvoiceUI.this) != null) && (AddInvoiceUI.a(AddInvoiceUI.this).isActivated()) && (AddInvoiceUI.g(AddInvoiceUI.this).getText().length() == 0))
          {
            AddInvoiceUI.this.QV();
            GMTrace.o(15201768308736L, 113262);
            return false;
            g.ork.i(14199, new Object[] { Integer.valueOf(4) });
          }
          if ((AddInvoiceUI.b(AddInvoiceUI.this) != null) && (AddInvoiceUI.b(AddInvoiceUI.this).isActivated()) && (AddInvoiceUI.h(AddInvoiceUI.this).getText().length() == 0))
          {
            AddInvoiceUI.this.QV();
            GMTrace.o(15201768308736L, 113262);
            return false;
          }
          if ((AddInvoiceUI.f(AddInvoiceUI.this) != 0) && (AddInvoiceUI.h(AddInvoiceUI.this).getText().length() == 0) && (AddInvoiceUI.g(AddInvoiceUI.this).getText().length() == 0))
          {
            AddInvoiceUI.this.QV();
            GMTrace.o(15201768308736L, 113262);
            return false;
          }
          if (AddInvoiceUI.i(AddInvoiceUI.this).getText().length() > 100)
          {
            paramAnonymousMenuItem = AddInvoiceUI.this;
            h.a(paramAnonymousMenuItem, paramAnonymousMenuItem.getString(R.l.dDM), paramAnonymousMenuItem.getString(R.l.cUG), false, null);
            GMTrace.o(15201768308736L, 113262);
            return false;
          }
          if (!AddInvoiceUI.d(AddInvoiceUI.this))
          {
            if (((AddInvoiceUI.a(AddInvoiceUI.this) != null) && (AddInvoiceUI.a(AddInvoiceUI.this).isActivated())) || ((AddInvoiceUI.j(AddInvoiceUI.this) != null) && (AddInvoiceUI.j(AddInvoiceUI.this).type != null) && (AddInvoiceUI.j(AddInvoiceUI.this).type.equals("0"))))
            {
              if (!AddInvoiceUI.k(AddInvoiceUI.this).QW())
              {
                paramAnonymousMenuItem = AddInvoiceUI.this;
                h.a(paramAnonymousMenuItem, paramAnonymousMenuItem.getString(R.l.dDR), paramAnonymousMenuItem.getString(R.l.cUG), false, null);
              }
              if (!AddInvoiceUI.l(AddInvoiceUI.this).QW())
              {
                paramAnonymousMenuItem = AddInvoiceUI.this;
                h.a(paramAnonymousMenuItem, paramAnonymousMenuItem.getString(R.l.dDK), paramAnonymousMenuItem.getString(R.l.cUG), false, null);
              }
            }
            GMTrace.o(15201768308736L, 113262);
            return true;
          }
          if (AddInvoiceUI.a(AddInvoiceUI.this).isActivated()) {
            AddInvoiceUI.c(AddInvoiceUI.this).type = "0";
          }
          for (;;)
          {
            if (AddInvoiceUI.j(AddInvoiceUI.this) != null) {
              AddInvoiceUI.c(AddInvoiceUI.this).type = AddInvoiceUI.j(AddInvoiceUI.this).type;
            }
            AddInvoiceUI.c(AddInvoiceUI.this).title = AddInvoiceUI.g(AddInvoiceUI.this).getText();
            AddInvoiceUI.c(AddInvoiceUI.this).mhR = AddInvoiceUI.h(AddInvoiceUI.this).getText();
            AddInvoiceUI.c(AddInvoiceUI.this).mhS = AddInvoiceUI.i(AddInvoiceUI.this).getText();
            AddInvoiceUI.c(AddInvoiceUI.this).mhQ = AddInvoiceUI.f(AddInvoiceUI.this);
            AddInvoiceUI.c(AddInvoiceUI.this).mhW = AddInvoiceUI.k(AddInvoiceUI.this).getText();
            AddInvoiceUI.c(AddInvoiceUI.this).mhU = AddInvoiceUI.m(AddInvoiceUI.this).getText();
            AddInvoiceUI.c(AddInvoiceUI.this).mhT = AddInvoiceUI.l(AddInvoiceUI.this).getText();
            AddInvoiceUI.c(AddInvoiceUI.this).mhY = AddInvoiceUI.n(AddInvoiceUI.this).getText();
            AddInvoiceUI.o(AddInvoiceUI.this);
            GMTrace.o(15201768308736L, 113262);
            return true;
            if (AddInvoiceUI.b(AddInvoiceUI.this).isActivated()) {
              AddInvoiceUI.c(AddInvoiceUI.this).type = "1";
            }
          }
        }
      }, p.b.vLG);
      lf(false);
      QS();
      GMTrace.o(15203915792384L, 113278);
      return;
      label698:
      if ((this.hva == null) || (this.hva.type == null) || (!this.hva.type.equals("1"))) {
        break;
      }
      this.huQ.setText(getString(R.l.dDQ));
      break;
      this.huR = ((TextView)findViewById(R.h.bJo));
      if (this.huR != null) {
        this.huR.setVisibility(8);
      }
    }
  }
  
  public final void QT()
  {
    GMTrace.i(15204721098752L, 113284);
    QS();
    GMTrace.o(15204721098752L, 113284);
  }
  
  public final void QV()
  {
    GMTrace.i(15205257969664L, 113288);
    h.a(this, getString(R.l.dDW), getString(R.l.cUG), false, null);
    GMTrace.o(15205257969664L, 113288);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(15204452663296L, 113282);
    w.i("MicroMsg.AddInvoiceUI", "errType " + paramInt1 + ",errCode " + paramInt2 + ",errMsg " + paramString);
    if (this.hul != null) {
      this.hul.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramk.getType() == 1180)
      {
        paramString = ((i)paramk).huo;
        if ((paramString != null) && (paramString.uNV != null) && (paramString.uNV.size() > 0) && (paramString.uNV.get(0) != null)) {
          this.IJ = ((ags)paramString.uNV.get(0)).ufO;
        }
        at.wS().b(1180, this);
        paramString = new com.tencent.mm.plugin.address.model.b();
        at.wS().a(paramString, 0);
        GMTrace.o(15204452663296L, 113282);
        return;
      }
      if (paramk.getType() == 1191)
      {
        at.wS().b(1191, this);
        if (this.hvc)
        {
          w.i("MicroMsg.AddInvoiceUI", "isLaunchFromWebview true...");
          paramk = this.hvb;
          if (paramk == null)
          {
            w.e("MicroMsg.InvoiceUtil", "invoiceObj == null");
            paramString = null;
          }
          for (;;)
          {
            setResult(-1, paramString);
            finish();
            GMTrace.o(15204452663296L, 113282);
            return;
            paramString = new Intent();
            paramString.putExtra("type", paramk.type);
            if ((paramk.type != null) && (paramk.type.equals("1")))
            {
              paramString.putExtra("title", paramk.mhR);
            }
            else
            {
              paramString.putExtra("title", paramk.title);
              paramString.putExtra("tax_number", paramk.mhS);
              paramString.putExtra("company_address", paramk.mhY);
              paramString.putExtra("telephone", paramk.mhW);
              paramString.putExtra("bank_name", paramk.mhU);
              paramString.putExtra("bank_account", paramk.mhT);
            }
          }
        }
        if ((this.huL == 0) && (this.IJ != 0))
        {
          paramString = new Intent();
          paramString.setClass(this, QrcodeInvoiceUI.class);
          paramString.putExtra("invoice_id", this.IJ);
          startActivity(paramString);
          this.IJ = 0;
        }
        finish();
        GMTrace.o(15204452663296L, 113282);
      }
    }
    else
    {
      h.a(this, getString(R.l.dDT), getString(R.l.cUG), false, null);
    }
    GMTrace.o(15204452663296L, 113282);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(15204318445568L, 113281);
    int i = R.i.cBs;
    GMTrace.o(15204318445568L, 113281);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(15204184227840L, 113280);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(15204184227840L, 113280);
      return;
      if (paramInt2 == -1)
      {
        String str = paramIntent.getStringExtra("karea_result");
        if (!bg.nm(str))
        {
          w.d("MicroMsg.AddInvoiceUI", "AREA_RESULT:" + str);
          this.huX.nG(str);
        }
        str = paramIntent.getStringExtra("kpost_code");
        if (!bg.nm(str))
        {
          w.d("MicroMsg.AddInvoiceUI", "post:" + str);
          this.huX.nG(str);
        }
        this.eQO = paramIntent.getStringExtra("kwcode");
        GMTrace.o(15204184227840L, 113280);
        return;
        if (paramInt2 != -1) {
          w.i("MicroMsg.AddInvoiceUI", "MallRecharge pay result : cancel");
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(15203781574656L, 113277);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    this.hvc = paramBundle.getBooleanExtra("launch_from_webview", false);
    this.hvd = paramBundle.getBooleanExtra("launch_from_invoicelist_webview", false);
    at.wS().a(1191, this);
    w.d("MicroMsg.AddInvoiceUI", "index Oncreate");
    this.hvb = new com.tencent.mm.plugin.o.a.b();
    this.huL = getIntent().getIntExtra("invoice_id", 0);
    if (this.huL == 0) {
      oM(R.l.dYv);
    }
    for (;;)
    {
      MP();
      GMTrace.o(15203781574656L, 113277);
      return;
      oM(R.l.dZq);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(15204050010112L, 113279);
    at.wS().b(1180, this);
    at.wS().b(1191, this);
    getWindow().setSoftInputMode(3);
    super.onDestroy();
    GMTrace.o(15204050010112L, 113279);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(15204855316480L, 113285);
    if (paramInt == 4)
    {
      QU();
      GMTrace.o(15204855316480L, 113285);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(15204855316480L, 113285);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\ui\AddInvoiceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */