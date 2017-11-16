package com.tencent.mm.plugin.qqmail.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.webkit.ConsoleMessage;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.qqmail.b.d;
import com.tencent.mm.plugin.qqmail.b.i;
import com.tencent.mm.plugin.qqmail.b.j;
import com.tencent.mm.plugin.qqmail.b.j.a;
import com.tencent.mm.plugin.qqmail.b.p.a;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.mm.y.at;
import com.tencent.xweb.WebView;
import com.tencent.xweb.l;
import java.io.File;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SuppressLint({"SetJavaScriptEnabled"})
public class ComposeUI
  extends MMActivity
{
  private static List<i> nUn;
  private int mode;
  private int nRV;
  private long nTR;
  private v nTl;
  private Map<String, String> nTs;
  private TextView nUA;
  private ImageView nUB;
  private LinearLayout nUC;
  private TextView nUD;
  private EditText nUE;
  private WebView nUF;
  private j nUG;
  private b nUH;
  public c nUI;
  private r nUJ;
  private String nUK;
  private q nUL;
  public boolean nUM;
  public boolean nUN;
  public boolean nUO;
  private String nUP;
  private String nUQ;
  private String nUR;
  private String nUS;
  private String nUT;
  private String nUU;
  private String nUV;
  private String nUW;
  private String nUX;
  private boolean nUY;
  private boolean nUZ;
  private ScrollView nUo;
  protected MailAddrsViewControl nUp;
  private ImageView nUq;
  private LinearLayout nUr;
  private LinearLayout nUs;
  private MailAddrsViewControl nUt;
  private ImageView nUu;
  private LinearLayout nUv;
  private MailAddrsViewControl nUw;
  private ImageView nUx;
  private EditText nUy;
  private LinearLayout nUz;
  private aj nVa;
  private aj nVb;
  j.a nVc;
  private View.OnClickListener nVd;
  private View.OnClickListener nVe;
  private MenuItem.OnMenuItemClickListener nVf;
  private View.OnClickListener nVg;
  private View.OnClickListener nVh;
  private p.a nVi;
  
  public ComposeUI()
  {
    GMTrace.i(5512456306688L, 41071);
    this.nUI = new c(this);
    this.nRV = 1;
    this.nUM = true;
    this.nUN = true;
    this.nUO = false;
    this.nUP = ("(function() { \nvar imgList = document.getElementsByTagName('img');var result = ''; \nfor (var i = 0; i < imgList.length; i++) {var img = imgList[i];var info = img.id + '@@' + img.src;result += info + '&&'}return result;" + "})()".trim());
    this.nUQ = "document.getElementById('history').innerHTML";
    this.nUR = "<div id=\"htmlContent\" contenteditable=\"true\" >";
    this.nUS = "</div>";
    this.nUT = null;
    this.mode = 5;
    this.nTs = new HashMap();
    this.nTl = com.tencent.mm.plugin.qqmail.b.w.aYF();
    this.nUU = null;
    this.nUV = "weixin://get_img_info/";
    this.nUW = "weixin://get_mail_content/";
    this.nUX = "weixin://img_onclick/";
    this.nUY = false;
    this.nUZ = false;
    this.nVa = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5487491809280L, 40885);
        ComposeUI.this.lf(ComposeUI.a(ComposeUI.this, true));
        GMTrace.o(5487491809280L, 40885);
        return true;
      }
    }, true);
    this.nVb = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5563056390144L, 41448);
        if ((ComposeUI.this.nUM) && (ComposeUI.a(ComposeUI.this, false)) && (ComposeUI.a(ComposeUI.this) == 5))
        {
          ComposeUI.b(ComposeUI.this);
          if (ComposeUI.c(ComposeUI.this) != null) {
            ComposeUI.c(ComposeUI.this).dismiss();
          }
          ComposeUI.a(ComposeUI.this, u.a(ComposeUI.this, ComposeUI.this.getString(R.l.dNX), 2000L));
        }
        GMTrace.o(5563056390144L, 41448);
        return true;
      }
    }, true);
    this.nVc = new j.a()
    {
      public final void onComplete()
      {
        GMTrace.i(5542118424576L, 41292);
        MailAddrsViewControl.b localb = new MailAddrsViewControl.b(ComposeUI.this, ComposeUI.d(ComposeUI.this).EW(null));
        ComposeUI.this.nUp.a(localb);
        ComposeUI.e(ComposeUI.this).a(localb);
        ComposeUI.f(ComposeUI.this).a(localb);
        GMTrace.o(5542118424576L, 41292);
      }
    };
    this.nVd = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5503195283456L, 41002);
        ComposeUI.z(ComposeUI.this).setVisibility(8);
        ComposeUI.A(ComposeUI.this).setVisibility(0);
        ComposeUI.B(ComposeUI.this).setVisibility(0);
        ComposeUI.z(ComposeUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5488565551104L, 40893);
            ComposeUI.A(ComposeUI.this).requestFocus();
            ComposeUI.e(ComposeUI.this).aZn();
            ComposeUI.f(ComposeUI.this).aZn();
            GMTrace.o(5488565551104L, 40893);
          }
        });
        GMTrace.o(5503195283456L, 41002);
      }
    };
    this.nVe = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5504134807552L, 41009);
        paramAnonymousView = ComposeUI.this;
        String str1 = ComposeUI.this.getString(R.l.dNW);
        String str2 = ComposeUI.this.getString(R.l.dNT);
        String str3 = ComposeUI.this.getString(R.l.dNU);
        h.c local1 = new h.c()
        {
          public final void hQ(int paramAnonymous2Int)
          {
            GMTrace.i(5521985765376L, 41142);
            switch (paramAnonymous2Int)
            {
            }
            for (;;)
            {
              GMTrace.o(5521985765376L, 41142);
              return;
              boolean bool = com.tencent.mm.pluginsdk.h.a.a(ComposeUI.this.vKB.vKW, "android.permission.CAMERA", 16, "", "");
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), ComposeUI.this.vKB.vKW });
              if (!bool)
              {
                GMTrace.o(5521985765376L, 41142);
                return;
              }
              ComposeUI.C(ComposeUI.this);
              GMTrace.o(5521985765376L, 41142);
              return;
              k.a(ComposeUI.this, 4, null);
              GMTrace.o(5521985765376L, 41142);
              return;
              Intent localIntent = new Intent(ComposeUI.this, FileExplorerUI.class);
              ComposeUI.this.startActivityForResult(localIntent, 5);
            }
          }
        };
        com.tencent.mm.ui.base.h.a(paramAnonymousView, null, new String[] { str1, str2, str3 }, null, local1);
        GMTrace.o(5504134807552L, 41009);
      }
    };
    this.nVf = new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5504940113920L, 41015);
        if (((ComposeUI.a(ComposeUI.this, false)) && (ComposeUI.a(ComposeUI.this) == 5)) || (ComposeUI.a(ComposeUI.this) == 6)) {
          com.tencent.mm.ui.base.h.a(ComposeUI.this.vKB.vKW, ComposeUI.this.getString(R.l.dOa), "", ComposeUI.this.getString(R.l.dOc), ComposeUI.this.getString(R.l.cSk), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(5562251083776L, 41442);
              ComposeUI.this.setResult(0);
              ComposeUI.this.finish();
              GMTrace.o(5562251083776L, 41442);
            }
          }, null);
        }
        for (;;)
        {
          GMTrace.o(5504940113920L, 41015);
          return true;
          ComposeUI.this.setResult(0);
          ComposeUI.this.finish();
        }
      }
    };
    this.nVg = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5537957675008L, 41261);
        ComposeUI.this.aLo();
        ComposeUI.j(ComposeUI.this).getText().toString();
        ComposeUI.D(ComposeUI.this);
        if (!ComposeUI.this.aYT())
        {
          GMTrace.o(5537957675008L, 41261);
          return;
        }
        paramAnonymousView = ComposeUI.this;
        ComposeUI localComposeUI = ComposeUI.this;
        ComposeUI.this.getString(R.l.cUG);
        ComposeUI.a(paramAnonymousView, com.tencent.mm.ui.base.h.a(localComposeUI, ComposeUI.this.getString(R.l.dNO), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(5532857401344L, 41223);
            ComposeUI.E(ComposeUI.this).aZb();
            ComposeUI.E(ComposeUI.this).nWj = null;
            com.tencent.mm.plugin.qqmail.b.w.aYE().cancel(ComposeUI.F(ComposeUI.this));
            GMTrace.o(5532857401344L, 41223);
          }
        }));
        if (!ComposeUI.E(ComposeUI.this).aZc())
        {
          ComposeUI.G(ComposeUI.this).setMessage(ComposeUI.this.getString(R.l.dNL));
          ComposeUI.E(ComposeUI.this).nWj = new b.b()
          {
            public final void aYU()
            {
              GMTrace.i(5533662707712L, 41229);
              ComposeUI.G(ComposeUI.this).setMessage(ComposeUI.this.getString(R.l.dNL));
              GMTrace.o(5533662707712L, 41229);
            }
            
            public final void onComplete()
            {
              GMTrace.i(5533796925440L, 41230);
              ComposeUI.a(ComposeUI.this, ComposeUI.H(ComposeUI.this));
              GMTrace.o(5533796925440L, 41230);
            }
          };
          GMTrace.o(5537957675008L, 41261);
          return;
        }
        ComposeUI.a(ComposeUI.this, ComposeUI.H(ComposeUI.this));
        GMTrace.o(5537957675008L, 41261);
      }
    };
    this.nVh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5562787954688L, 41446);
        if (!ComposeUI.E(ComposeUI.this).aZc())
        {
          ComposeUI.a(ComposeUI.this, com.tencent.mm.ui.base.h.a(ComposeUI.this, ComposeUI.this.getString(R.l.dNL), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(5568022446080L, 41485);
              ComposeUI.E(ComposeUI.this).aZb();
              ComposeUI.E(ComposeUI.this).nWj = null;
              GMTrace.o(5568022446080L, 41485);
            }
          }));
          ComposeUI.E(ComposeUI.this).nWj = new b.b()
          {
            public final void aYU()
            {
              GMTrace.i(5541715771392L, 41289);
              GMTrace.o(5541715771392L, 41289);
            }
            
            public final void onComplete()
            {
              GMTrace.i(5541849989120L, 41290);
              ComposeUI.G(ComposeUI.this).dismiss();
              s.a(ComposeUI.s(ComposeUI.this), ComposeUI.n(ComposeUI.this), ComposeUI.x(ComposeUI.this));
              ComposeUI.I(ComposeUI.this);
              GMTrace.o(5541849989120L, 41290);
            }
          };
          GMTrace.o(5562787954688L, 41446);
          return;
        }
        s.a(ComposeUI.s(ComposeUI.this), ComposeUI.n(ComposeUI.this), ComposeUI.x(ComposeUI.this));
        ComposeUI.I(ComposeUI.this);
        GMTrace.o(5562787954688L, 41446);
      }
    };
    this.nVi = new p.a()
    {
      public final void onComplete()
      {
        GMTrace.i(5561445777408L, 41436);
        if (ComposeUI.G(ComposeUI.this) != null)
        {
          ComposeUI.G(ComposeUI.this).dismiss();
          ComposeUI.a(ComposeUI.this, null);
        }
        GMTrace.o(5561445777408L, 41436);
      }
      
      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(5561311559680L, 41435);
        if (paramAnonymousInt == -5)
        {
          ComposeUI.this.nUI.a(new c.a()
          {
            public final void aYH()
            {
              GMTrace.i(5567217139712L, 41479);
              ComposeUI.H(ComposeUI.this);
              GMTrace.o(5567217139712L, 41479);
            }
            
            public final void aYI()
            {
              GMTrace.i(5567351357440L, 41480);
              GMTrace.o(5567351357440L, 41480);
            }
          });
          GMTrace.o(5561311559680L, 41435);
          return;
        }
        com.tencent.mm.ui.base.h.a(ComposeUI.this, paramAnonymousString, ComposeUI.this.getString(R.l.dNN), null);
        GMTrace.o(5561311559680L, 41435);
      }
      
      public final void onSuccess(String paramAnonymousString, Map<String, String> paramAnonymousMap)
      {
        GMTrace.i(5561177341952L, 41434);
        com.tencent.mm.ui.base.h.a(ComposeUI.this, R.l.dNP, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(5568827752448L, 41491);
            paramAnonymous2DialogInterface = com.tencent.mm.plugin.qqmail.b.w.aYE().nSR;
            String str = ComposeUI.J(ComposeUI.this);
            paramAnonymous2Int = ComposeUI.K(ComposeUI.this);
            paramAnonymous2DialogInterface = new File(paramAnonymous2DialogInterface.nRU.nSe + com.tencent.mm.plugin.qqmail.b.c.bE(str, paramAnonymous2Int));
            if (paramAnonymous2DialogInterface.exists()) {
              paramAnonymous2DialogInterface.delete();
            }
            ComposeUI.this.setResult(-1);
            ComposeUI.this.finish();
            GMTrace.o(5568827752448L, 41491);
          }
        });
        ComposeUI.d(ComposeUI.this).be(ComposeUI.this.nUp.nWN);
        ComposeUI.d(ComposeUI.this).be(ComposeUI.e(ComposeUI.this).nWN);
        ComposeUI.d(ComposeUI.this).be(ComposeUI.f(ComposeUI.this).nWN);
        GMTrace.o(5561177341952L, 41434);
      }
    };
    GMTrace.o(5512456306688L, 41071);
  }
  
  private void Fc(final String paramString)
  {
    GMTrace.i(5514872225792L, 41089);
    final File localFile = new File(paramString);
    if (!localFile.exists())
    {
      GMTrace.o(5514872225792L, 41089);
      return;
    }
    if (this.nUH.nWf.containsKey(paramString))
    {
      com.tencent.mm.ui.base.h.h(this.vKB.vKW, R.l.dOr, R.l.cUG);
      GMTrace.o(5514872225792L, 41089);
      return;
    }
    final int i = (int)localFile.length();
    if (i > 20971520)
    {
      com.tencent.mm.ui.base.h.a(this, R.l.dOs, R.l.cUG, null);
      GMTrace.o(5514872225792L, 41089);
      return;
    }
    com.tencent.mm.ui.base.h.a(this, getString(R.l.dOu, new Object[] { bg.aF(i) }), getString(R.l.cUG), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5564667002880L, 41460);
        if (ComposeUI.E(ComposeUI.this).aZf() + i > 52428800)
        {
          com.tencent.mm.ui.base.h.a(ComposeUI.this, R.l.dOt, R.l.cUG, null);
          GMTrace.o(5564667002880L, 41460);
          return;
        }
        EditText localEditText;
        if (ComposeUI.j(ComposeUI.this).getText().toString().trim().length() == 0)
        {
          paramAnonymousDialogInterface = localFile.getName().trim();
          paramAnonymousInt = paramAnonymousDialogInterface.lastIndexOf(".");
          localEditText = ComposeUI.j(ComposeUI.this);
          if (paramAnonymousInt <= 0) {
            break label162;
          }
        }
        for (;;)
        {
          localEditText.setText(paramAnonymousDialogInterface.substring(0, paramAnonymousInt));
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "in upload file mode = %d", new Object[] { Integer.valueOf(ComposeUI.a(ComposeUI.this)) });
          ComposeUI.E(ComposeUI.this).dl(paramString, null);
          GMTrace.o(5564667002880L, 41460);
          return;
          label162:
          paramAnonymousInt = paramAnonymousDialogInterface.length();
        }
      }
    }, null);
    GMTrace.o(5514872225792L, 41089);
  }
  
  private static void a(MailAddrsViewControl paramMailAddrsViewControl)
  {
    GMTrace.i(5514603790336L, 41087);
    if (nUn == null)
    {
      GMTrace.o(5514603790336L, 41087);
      return;
    }
    List localList = nUn;
    if (localList != null)
    {
      int i = 0;
      i locali1;
      int j;
      i locali2;
      while (i < paramMailAddrsViewControl.nWN.size())
      {
        locali1 = (i)paramMailAddrsViewControl.nWN.get(i);
        j = 0;
        while (j < localList.size())
        {
          locali2 = (i)localList.get(j);
          if (locali1.mwD.equalsIgnoreCase(locali2.mwD)) {
            break;
          }
          j += 1;
        }
        if (j == localList.size()) {
          paramMailAddrsViewControl.f(locali1);
        }
        i += 1;
      }
      i = 0;
      while (i < localList.size())
      {
        locali1 = (i)localList.get(i);
        j = 0;
        while (j < paramMailAddrsViewControl.nWN.size())
        {
          locali2 = (i)paramMailAddrsViewControl.nWN.get(j);
          if (locali1.mwD.equalsIgnoreCase(locali2.mwD)) {
            break;
          }
          j += 1;
        }
        if (j == paramMailAddrsViewControl.nWN.size()) {
          paramMailAddrsViewControl.e(locali1);
        }
        i += 1;
      }
    }
    GMTrace.o(5514603790336L, 41087);
  }
  
  private void aYQ()
  {
    GMTrace.i(5513261613056L, 41077);
    this.nUp.clearFocus();
    this.nUt.clearFocus();
    this.nUw.clearFocus();
    GMTrace.o(5513261613056L, 41077);
  }
  
  private void aYR()
  {
    GMTrace.i(5513530048512L, 41079);
    if (this.nUF != null)
    {
      this.nUF.clearFocus();
      this.nUF.getSettings().setJavaScriptEnabled(true);
      this.nUF.setWebViewClient(new b());
      this.nUF.setWebChromeClient(new a());
      this.nUF.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(5486954938368L, 40881);
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            GMTrace.o(5486954938368L, 40881);
            return false;
            if (!paramAnonymousView.hasFocus()) {
              paramAnonymousView.requestFocus();
            }
          }
        }
      });
    }
    GMTrace.o(5513530048512L, 41079);
  }
  
  private String aYS()
  {
    GMTrace.i(5514066919424L, 41083);
    String str;
    if (this.mode == 6)
    {
      s.a(this.nUF, this.nUW, this.nUQ);
      if (this.nUU != null)
      {
        int i = this.nUU.indexOf(this.nUR);
        int j = this.nUU.lastIndexOf(this.nUS);
        if ((i != -1) && (j != -1))
        {
          str = this.nUU.substring(i + this.nUR.length(), j + this.nUS.length());
          GMTrace.o(5514066919424L, 41083);
          return str;
        }
        str = this.nUU;
        GMTrace.o(5514066919424L, 41083);
        return str;
      }
    }
    else if (this.mode == 5)
    {
      str = this.nUE.getText().toString();
      GMTrace.o(5514066919424L, 41083);
      return str;
    }
    GMTrace.o(5514066919424L, 41083);
    return null;
  }
  
  private void ahJ()
  {
    GMTrace.i(5513798483968L, 41081);
    if (!k.c(this, com.tencent.mm.compatible.util.e.fRZ, "microMsg." + System.currentTimeMillis() + ".jpg", 3)) {
      Toast.makeText(this, getString(R.l.dWY), 1).show();
    }
    GMTrace.o(5513798483968L, 41081);
  }
  
  static void bf(List<i> paramList)
  {
    GMTrace.i(5514469572608L, 41086);
    nUn = paramList;
    GMTrace.o(5514469572608L, 41086);
  }
  
  private String getSubject()
  {
    int i = 40;
    GMTrace.i(5514201137152L, 41084);
    String str = this.nUy.getText().toString();
    if (str.trim().length() > 0)
    {
      GMTrace.o(5514201137152L, 41084);
      return str;
    }
    str = aYS();
    if (this.mode == 5)
    {
      if (str.length() > 0)
      {
        if (str.length() > 40) {}
        for (;;)
        {
          str = str.substring(0, i);
          GMTrace.o(5514201137152L, 41084);
          return str;
          i = str.length();
        }
      }
    }
    else if ((this.mode == 6) && (!bg.nm(str)))
    {
      if (str.length() > 40) {}
      for (;;)
      {
        str = str.substring(0, i);
        GMTrace.o(5514201137152L, 41084);
        return str;
        i = str.length();
      }
    }
    str = getString(R.l.dOb);
    GMTrace.o(5514201137152L, 41084);
    return str;
  }
  
  protected final void MP()
  {
    GMTrace.i(5513395830784L, 41078);
    this.nUo = ((ScrollView)findViewById(R.h.bVl));
    this.nUp = ((MailAddrsViewControl)findViewById(R.h.bVh));
    this.nUq = ((ImageView)findViewById(R.h.bVc));
    this.nUr = ((LinearLayout)findViewById(R.h.bVk));
    this.nUs = ((LinearLayout)findViewById(R.h.bVg));
    this.nUt = ((MailAddrsViewControl)findViewById(R.h.bVf));
    this.nUu = ((ImageView)findViewById(R.h.bVb));
    this.nUv = ((LinearLayout)findViewById(R.h.bVe));
    this.nUw = ((MailAddrsViewControl)findViewById(R.h.bVd));
    this.nUx = ((ImageView)findViewById(R.h.bVa));
    this.nUy = ((EditText)findViewById(R.h.bVp));
    this.nUz = ((LinearLayout)findViewById(R.h.bUZ));
    this.nUD = ((TextView)findViewById(R.h.bTy));
    this.nUE = ((EditText)findViewById(R.h.bVm));
    this.nUF = MMWebView.a.j(this, R.h.bVn);
    this.nUA = ((TextView)findViewById(R.h.bVj));
    this.nUB = ((ImageView)findViewById(R.h.bVi));
    this.nUC = ((LinearLayout)findViewById(R.h.bTx));
    this.nUp.aZj();
    this.nUt.aZj();
    this.nUw.aZj();
    Object localObject3 = getIntent().getStringExtra("mail_content");
    Object localObject4 = getIntent().getStringArrayListExtra("mail_attach");
    final Object localObject1 = getIntent().getStringArrayListExtra("mail_attach_title");
    Object localObject2 = com.tencent.mm.plugin.qqmail.b.w.aYE().nSR.bD(this.nUK, this.nRV);
    this.nUH = new b(this, this.nUA, this.nUB, this.nUC, (byte)0);
    int i;
    if (!bg.nm((String)localObject3))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "read mail from extra");
      if (this.mode == 6)
      {
        aYR();
        this.nUp.requestFocus();
        this.nUU = String.format(this.nUT, new Object[] { localObject3 });
        this.nUF.loadDataWithBaseURL("", this.nUU, "text/html", "utf-8", "");
        this.nUE.setVisibility(8);
        this.nUF.setVisibility(0);
        this.nUH.mode = this.mode;
        if (this.mode == 6)
        {
          localObject2 = ((List)localObject4).iterator();
          i = 0;
          label485:
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (String)((Iterator)localObject2).next();
            localObject4 = new File((String)localObject3);
            if (((File)localObject4).exists())
            {
              if ((int)((File)localObject4).length() + this.nUH.aZf() <= 52428800) {
                break label1228;
              }
              com.tencent.mm.ui.base.h.a(this, R.l.dOt, R.l.cUG, null);
            }
          }
        }
        if (this.nRV == 1) {
          break label1584;
        }
        localObject1 = getIntent().getStringArrayExtra("toList");
        localObject3 = getIntent().getStringArrayExtra("ccList");
        localObject4 = getIntent().getStringArrayExtra("bccList");
        localObject2 = getIntent().getStringExtra("subject");
        this.nUp.a((String[])localObject1, false);
        this.nUt.a((String[])localObject3, false);
        this.nUw.a((String[])localObject4, false);
        if (!bg.nm((String)localObject2))
        {
          localObject3 = this.nUy;
          localObject4 = new StringBuilder();
          if (this.nRV != 2) {
            break label1577;
          }
          localObject1 = "Re:";
          label673:
          ((EditText)localObject3).setText((String)localObject1 + (String)localObject2);
        }
        label691:
        if ((this.nUt.nWN.size() > 0) || (this.nUw.nWN.size() > 0))
        {
          this.nUr.setVisibility(8);
          this.nUs.setVisibility(0);
          this.nUv.setVisibility(0);
        }
        if ((this.nRV == 2) && (this.mode != 6) && (this.mode == 5))
        {
          this.nUE.requestFocus();
          this.nUE.setSelection(0);
          this.nUo.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5508295557120L, 41040);
              ComposeUI.g(ComposeUI.this).fullScroll(130);
              GMTrace.o(5508295557120L, 41040);
            }
          }, 1000L);
        }
        this.nUp.nWQ = new c(this.nUq, 0);
        this.nUt.nWQ = new c(this.nUu, 1);
        this.nUw.nWQ = new c(this.nUx, 2);
        localObject1 = new MailAddrsViewControl.a()
        {
          public final void aYV()
          {
            GMTrace.i(5536078626816L, 41247);
            u.a(ComposeUI.this, ComposeUI.this.getString(R.l.dOi), 1500L);
            GMTrace.o(5536078626816L, 41247);
          }
          
          public final void b(final MailAddrsViewControl paramAnonymousMailAddrsViewControl)
          {
            GMTrace.i(5535944409088L, 41246);
            com.tencent.mm.ui.base.h.a(ComposeUI.this.vKB.vKW, ComposeUI.this.getString(R.l.dOi), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(5567754010624L, 41483);
                paramAnonymousMailAddrsViewControl.nWO.setText("");
                ComposeUI.i(ComposeUI.this).postDelayed(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(5508027121664L, 41038);
                    ComposeUI.h(ComposeUI.this);
                    ComposeUI.19.1.this.nVs.requestFocus();
                    ComposeUI.this.aLs();
                    GMTrace.o(5508027121664L, 41038);
                  }
                }, 150L);
                GMTrace.o(5567754010624L, 41483);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(5506282291200L, 41025);
                ComposeUI.i(ComposeUI.this).postDelayed(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(5500510928896L, 40982);
                    ComposeUI.h(ComposeUI.this);
                    ComposeUI.19.2.this.nVs.requestFocus();
                    ComposeUI.this.aLs();
                    GMTrace.o(5500510928896L, 40982);
                  }
                }, 150L);
                GMTrace.o(5506282291200L, 41025);
              }
            });
            GMTrace.o(5535944409088L, 41246);
          }
        };
        this.nUp.nWS = ((MailAddrsViewControl.a)localObject1);
        this.nUt.nWS = ((MailAddrsViewControl.a)localObject1);
        this.nUw.nWS = ((MailAddrsViewControl.a)localObject1);
        this.nUq.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(5497155485696L, 40957);
            paramAnonymousView = new Intent(ComposeUI.this, MailAddrListUI.class);
            paramAnonymousView.putExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA", ComposeUI.this.nUp.a(false, null));
            paramAnonymousView.putExtra("MMActivity.OverrideExitAnimation", R.a.aLE);
            paramAnonymousView.putExtra("MMActivity.OverrideEnterAnimation", R.a.aLs);
            ComposeUI.this.startActivityForResult(paramAnonymousView, 0);
            ComposeUI.this.overridePendingTransition(R.a.aLG, R.a.aLt);
            GMTrace.o(5497155485696L, 40957);
          }
        });
        this.nUu.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(5492994736128L, 40926);
            paramAnonymousView = new Intent(ComposeUI.this, MailAddrListUI.class);
            paramAnonymousView.putExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA", ComposeUI.e(ComposeUI.this).a(false, null));
            paramAnonymousView.putExtra("MMActivity.OverrideExitAnimation", R.a.aLE);
            paramAnonymousView.putExtra("MMActivity.OverrideEnterAnimation", R.a.aLs);
            ComposeUI.this.startActivityForResult(paramAnonymousView, 1);
            ComposeUI.this.overridePendingTransition(R.a.aLG, R.a.aLt);
            GMTrace.o(5492994736128L, 40926);
          }
        });
        this.nUx.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(5564130131968L, 41456);
            paramAnonymousView = new Intent(ComposeUI.this, MailAddrListUI.class);
            paramAnonymousView.putExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA", ComposeUI.f(ComposeUI.this).a(false, null));
            paramAnonymousView.putExtra("MMActivity.OverrideExitAnimation", R.a.aLE);
            paramAnonymousView.putExtra("MMActivity.OverrideEnterAnimation", R.a.aLs);
            ComposeUI.this.startActivityForResult(paramAnonymousView, 2);
            ComposeUI.this.overridePendingTransition(R.a.aLG, R.a.aLt);
            GMTrace.o(5564130131968L, 41456);
          }
        });
        this.nUr.setOnClickListener(this.nVd);
        localObject1 = (ImageView)findViewById(R.h.bVo);
        if ((this.nUN) && (this.nUy.getText().length() > 0)) {
          ((ImageView)localObject1).setVisibility(0);
        }
        this.nUy.setOnFocusChangeListener(new View.OnFocusChangeListener()
        {
          public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
          {
            GMTrace.i(5508832428032L, 41044);
            if (paramAnonymousBoolean) {
              ComposeUI.j(ComposeUI.this).setSelection(ComposeUI.j(ComposeUI.this).getText().length());
            }
            GMTrace.o(5508832428032L, 41044);
          }
        });
        this.nUy.addTextChangedListener(new TextWatcher()
        {
          public final void afterTextChanged(Editable paramAnonymousEditable)
          {
            GMTrace.i(5511114129408L, 41061);
            GMTrace.o(5511114129408L, 41061);
          }
          
          public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(5510979911680L, 41060);
            GMTrace.o(5510979911680L, 41060);
          }
          
          public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            paramAnonymousInt1 = 4;
            GMTrace.i(5510845693952L, 41059);
            if (ComposeUI.this.nUN)
            {
              paramAnonymousCharSequence = localObject1;
              if (ComposeUI.j(ComposeUI.this).getText().length() > 0) {
                paramAnonymousInt1 = 0;
              }
              paramAnonymousCharSequence.setVisibility(paramAnonymousInt1);
              GMTrace.o(5510845693952L, 41059);
              return;
            }
            localObject1.setVisibility(4);
            GMTrace.o(5510845693952L, 41059);
          }
        });
        ((ImageView)localObject1).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(5547084480512L, 41329);
            ComposeUI.j(ComposeUI.this).getText().clear();
            ComposeUI.j(ComposeUI.this).requestFocus();
            GMTrace.o(5547084480512L, 41329);
          }
        });
        this.nUz.setOnClickListener(this.nVe);
        oM(R.l.dOd);
        if (getIntent().getBooleanExtra("show_qqmail", false))
        {
          at.AR();
          i = ((Integer)com.tencent.mm.y.c.xh().get(9, Integer.valueOf(0))).intValue();
          if (i != 0) {
            break label1688;
          }
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ComposeUI", "want to show qqmail address, but unbind qq");
        }
        label1100:
        a(this.nVf);
        if (this.mode != 5) {
          break label1722;
        }
        a(0, getString(R.l.cUs), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(5521717329920L, 41140);
            ComposeUI.k(ComposeUI.this).onClick(null);
            GMTrace.o(5521717329920L, 41140);
            return false;
          }
        });
      }
    }
    for (;;)
    {
      lf(false);
      aYQ();
      GMTrace.o(5513395830784L, 41078);
      return;
      if (this.mode != 5) {
        break;
      }
      this.nUE.setVisibility(0);
      this.nUF.setVisibility(8);
      if (((String)localObject3).indexOf("<div>") != -1)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "set content in html format");
        this.nUE.setText(Html.fromHtml((String)localObject3));
        break;
      }
      this.nUE.setText((CharSequence)localObject3);
      break;
      label1228:
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "in upload file mode = %d", new Object[] { Integer.valueOf(this.mode) });
      this.nUH.dl((String)localObject3, (String)((List)localObject1).get(i));
      i += 1;
      break label485;
      if ((localObject2 != null) && (this.mode == 6))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "read mail from draftMail");
        this.nUp.bh(((d)localObject2).nRX);
        this.nUt.bh(((d)localObject2).nRY);
        this.nUw.bh(((d)localObject2).nRZ);
        this.nUy.setText(((d)localObject2).nSb);
        localObject1 = ((d)localObject2).content;
        this.mode = 5;
        if (((String)localObject1).indexOf("<div>") != -1)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "set content in html format");
          this.nUE.setText(Html.fromHtml((String)localObject1));
        }
        for (;;)
        {
          this.nUH.mode = this.mode;
          this.nUH.bg(((d)localObject2).nSa);
          this.nUH.aZe();
          this.nUF.setVisibility(8);
          this.nUE.setVisibility(0);
          break;
          this.nUE.setText((CharSequence)localObject1);
        }
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "no extra or draf mail content");
      if (this.mode == 6)
      {
        aYR();
        this.nUp.requestFocus();
        this.nUU = String.format(this.nUT, new Object[] { "" });
        this.nUF.loadDataWithBaseURL("", this.nUU, "text/html", "utf-8", "");
        this.nUE.setVisibility(8);
        this.nUF.setVisibility(0);
      }
      for (;;)
      {
        this.nUH.mode = this.mode;
        break;
        if (this.mode == 5)
        {
          this.nUF.setVisibility(8);
          this.nUE.setVisibility(0);
        }
      }
      label1577:
      localObject1 = "Fwd:";
      break label673;
      label1584:
      if ((this.nRV == 2) || (this.nRV == 3))
      {
        this.nUD.setVisibility(0);
        break label691;
      }
      if (this.nRV == 4)
      {
        localObject1 = getIntent().getStringArrayExtra("toList");
        if ((localObject1 == null) || (localObject1.length <= 0)) {
          break label691;
        }
        this.nUp.a((String[])localObject1, false);
        break label691;
      }
      if (this.nRV != 1) {
        break label691;
      }
      localObject1 = getIntent().getStringExtra("subject");
      if (bg.nm((String)localObject1)) {
        break label691;
      }
      this.nUy.setText((CharSequence)localObject1);
      break label691;
      label1688:
      Ve(new o(i) + "@qq.com");
      break label1100;
      label1722:
      if (this.mode == 6)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "set onShareModeSendListener");
        a(0, getString(R.l.cUs), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(5500242493440L, 40980);
            ComposeUI.l(ComposeUI.this).onClick(null);
            GMTrace.o(5500242493440L, 40980);
            return false;
          }
        });
      }
    }
  }
  
  protected final boolean aYT()
  {
    GMTrace.i(5514335354880L, 41085);
    if (!this.nUp.aZm())
    {
      Toast.makeText(this, R.l.dOe, 1).show();
      GMTrace.o(5514335354880L, 41085);
      return false;
    }
    if (!this.nUt.aZm())
    {
      Toast.makeText(this, R.l.dNZ, 1).show();
      GMTrace.o(5514335354880L, 41085);
      return false;
    }
    if (!this.nUw.aZm())
    {
      Toast.makeText(this, R.l.dNY, 1).show();
      GMTrace.o(5514335354880L, 41085);
      return false;
    }
    if (this.nUp.nWN.size() + this.nUt.nWN.size() + this.nUw.nWN.size() > 20)
    {
      Toast.makeText(this, R.l.dOk, 1).show();
      GMTrace.o(5514335354880L, 41085);
      return false;
    }
    GMTrace.o(5514335354880L, 41085);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5512590524416L, 41072);
    int i = R.i.cDY;
    GMTrace.o(5512590524416L, 41072);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5514738008064L, 41088);
    if (paramInt2 != -1)
    {
      GMTrace.o(5514738008064L, 41088);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(5514738008064L, 41088);
      return;
      a(this.nUp);
      aLs();
      GMTrace.o(5514738008064L, 41088);
      return;
      a(this.nUt);
      aLs();
      GMTrace.o(5514738008064L, 41088);
      return;
      a(this.nUw);
      aLs();
      GMTrace.o(5514738008064L, 41088);
      return;
      at.AR();
      paramIntent = k.b(this, paramIntent, com.tencent.mm.y.c.yU());
      if (paramIntent != null)
      {
        Fc(paramIntent);
        aYQ();
        GMTrace.o(5514738008064L, 41088);
        return;
        if (paramIntent != null)
        {
          at.AR();
          paramIntent = com.tencent.mm.ui.tools.a.c(this, paramIntent, com.tencent.mm.y.c.yU());
          if ((paramIntent != null) && (paramIntent.length() > 0))
          {
            Fc(paramIntent);
            aYQ();
            GMTrace.o(5514738008064L, 41088);
            return;
            if (paramIntent != null)
            {
              Fc(paramIntent.getStringExtra("choosed_file_path"));
              aYQ();
            }
          }
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5512724742144L, 41073);
    super.onCreate(paramBundle);
    this.nUT = (this.nUR + "%s" + this.nUS);
    this.nUY = false;
    this.nUZ = false;
    this.nRV = getIntent().getIntExtra("composeType", 1);
    this.nUK = getIntent().getStringExtra("mailid");
    if (this.nUK == null) {
      this.nUK = "";
    }
    this.mode = getIntent().getIntExtra("mail_mode", 5);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ComposeUI", "onCreate, mode = %d", new Object[] { Integer.valueOf(this.mode) });
    MP();
    this.nUG = com.tencent.mm.plugin.qqmail.b.w.aYE().nSQ;
    this.nUG.a(this.nVc);
    this.nUG.aYu();
    this.nVb.z(180000L, 180000L);
    GMTrace.o(5512724742144L, 41073);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5513127395328L, 41076);
    super.onDestroy();
    if (nUn != null) {
      nUn = null;
    }
    this.nUH.aZb();
    b localb = this.nUH;
    at.wS().b(484, localb);
    this.nUG.b(this.nVc);
    this.nUI.release();
    this.nVb.stopTimer();
    GMTrace.o(5513127395328L, 41076);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5513664266240L, 41080);
    if (paramInt == 4)
    {
      this.nVf.onMenuItemClick(null);
      GMTrace.o(5513664266240L, 41080);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(5513664266240L, 41080);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(5512993177600L, 41075);
    super.onPause();
    aLo();
    this.nVa.stopTimer();
    if (this.nUL != null) {
      this.nUL.dismiss();
    }
    GMTrace.o(5512993177600L, 41075);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(5513932701696L, 41082);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(5513932701696L, 41082);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        ahJ();
        GMTrace.o(5513932701696L, 41082);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dNn), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5505745420288L, 41021);
          ComposeUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(5505745420288L, 41021);
        }
      }, null);
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(5512858959872L, 41074);
    super.onResume();
    this.nVa.z(1500L, 1500L);
    GMTrace.o(5512858959872L, 41074);
  }
  
  public void setRequestedOrientation(int paramInt)
  {
    GMTrace.i(5515006443520L, 41090);
    GMTrace.o(5515006443520L, 41090);
  }
  
  private final class a
    extends com.tencent.xweb.h
  {
    public a()
    {
      GMTrace.i(5478633439232L, 40819);
      GMTrace.o(5478633439232L, 40819);
    }
    
    @Deprecated
    public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
    {
      GMTrace.i(19548409430016L, 145647);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "console, consoleMessage: %s", new Object[] { paramConsoleMessage });
      if (paramConsoleMessage != null) {}
      Object localObject4;
      Object localObject3;
      for (Object localObject1 = paramConsoleMessage.message();; localObject1 = null)
      {
        localObject1 = s.PO((String)localObject1);
        if (!((String)localObject1).startsWith(ComposeUI.m(ComposeUI.this))) {
          break label288;
        }
        ComposeUI.this.aLo();
        try
        {
          localObject1 = URLDecoder.decode(((String)localObject1).substring(ComposeUI.m(ComposeUI.this).length()), "utf-8").split("@@");
          localObject4 = localObject1[0].split(":");
          localObject3 = localObject4[0];
          localObject4 = localObject4[1];
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "img onclick, src: %s, msgLocalId: %s, msgSvrId: %s", new Object[] { localObject1[1], localObject3, localObject4 });
          at.AR();
          localObject1 = com.tencent.mm.y.c.yM().cM(Integer.valueOf((String)localObject3).intValue());
          localObject3 = new Intent(ComposeUI.this, MailImageDownloadUI.class);
          ((Intent)localObject3).putExtra("img_msg_id", ((ce)localObject1).field_msgId);
          ((Intent)localObject3).putExtra("img_server_id", ((ce)localObject1).field_msgSvrId);
          ((Intent)localObject3).putExtra("img_download_compress_type", 0);
          ((Intent)localObject3).putExtra("img_download_username", ((ce)localObject1).field_talker);
          ComposeUI.this.startActivity((Intent)localObject3);
          GMTrace.o(19548409430016L, 145647);
          return true;
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ComposeUI", "consoleMessage IMG_ONCLICK, ex = %s", new Object[] { localException.getMessage() });
        }
      }
      label288:
      do
      {
        boolean bool = super.onConsoleMessage(paramConsoleMessage);
        GMTrace.o(19548409430016L, 145647);
        return bool;
        if (localException.startsWith(ComposeUI.n(ComposeUI.this))) {
          try
          {
            ComposeUI.a(ComposeUI.this, URLDecoder.decode(localException.substring(ComposeUI.n(ComposeUI.this).length()), "utf-8"));
            if (ComposeUI.o(ComposeUI.this)) {
              if (ComposeUI.p(ComposeUI.this).indexOf("<img") == -1)
              {
                ComposeUI.q(ComposeUI.this).clear();
                ComposeUI.r(ComposeUI.this);
                GMTrace.o(19548409430016L, 145647);
                return true;
              }
            }
          }
          catch (Exception paramConsoleMessage)
          {
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ComposeUI", "consoleMessage GET_MAIL_CONTENT, ex = %s", new Object[] { paramConsoleMessage.getMessage() });
            }
            s.a(ComposeUI.s(ComposeUI.this), ComposeUI.t(ComposeUI.this), ComposeUI.u(ComposeUI.this));
            GMTrace.o(19548409430016L, 145647);
            return true;
          }
        }
      } while (!localException.startsWith(ComposeUI.t(ComposeUI.this)));
      ComposeUI.q(ComposeUI.this).clear();
      try
      {
        paramConsoleMessage = URLDecoder.decode(localException.substring(ComposeUI.t(ComposeUI.this).length()), "utf-8");
        localObject3 = paramConsoleMessage.split("&&");
        int i = 0;
        while (i < localObject3.length)
        {
          paramConsoleMessage = localObject3[i].split("@@");
          localObject4 = paramConsoleMessage[0].split(":")[1];
          Object localObject2 = paramConsoleMessage[1];
          paramConsoleMessage = (ConsoleMessage)localObject2;
          if (((String)localObject2).startsWith("file://")) {
            paramConsoleMessage = ((String)localObject2).replaceFirst("file://", "");
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "put msgImgInfoMap, msgSvrId: %s, path: %s", new Object[] { localObject4, paramConsoleMessage });
          ComposeUI.q(ComposeUI.this).put(localObject4, paramConsoleMessage);
          i += 1;
        }
        if (!ComposeUI.o(ComposeUI.this)) {
          break label646;
        }
      }
      catch (Exception paramConsoleMessage)
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ComposeUI", "consoleMessage GET_IMG_INFO, ex = %s", new Object[] { paramConsoleMessage.getMessage() });
        GMTrace.o(19548409430016L, 145647);
        return true;
      }
      ComposeUI.r(ComposeUI.this);
      label646:
      GMTrace.o(19548409430016L, 145647);
      return true;
    }
  }
  
  private final class b
    extends com.tencent.xweb.n
  {
    private boolean nVw;
    
    public b()
    {
      GMTrace.i(5501987323904L, 40993);
      this.nVw = false;
      GMTrace.o(5501987323904L, 40993);
    }
    
    public final void a(WebView paramWebView, String paramString)
    {
      GMTrace.i(19547604123648L, 145641);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ComposeUI", "onPageFinished, url = %s, firstTimeLoaded = %b", new Object[] { paramString, Boolean.valueOf(this.nVw) });
      if (!this.nVw)
      {
        this.nVw = true;
        s.a(ComposeUI.s(ComposeUI.this), ComposeUI.n(ComposeUI.this), ComposeUI.x(ComposeUI.this));
      }
      super.a(paramWebView, paramString);
      GMTrace.o(19547604123648L, 145641);
    }
    
    public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(19547469905920L, 145640);
      super.b(paramWebView, paramString, paramBitmap);
      if (!ComposeUI.v(ComposeUI.this))
      {
        s.b(ComposeUI.s(ComposeUI.this));
        ComposeUI.w(ComposeUI.this);
      }
      GMTrace.o(19547469905920L, 145640);
    }
    
    public final boolean b(WebView paramWebView, String paramString)
    {
      GMTrace.i(19547335688192L, 145639);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ComposeUI", "shouldOverrideUrlLoading, url = %s", new Object[] { paramString });
      Object localObject;
      if (paramString.startsWith(ComposeUI.m(ComposeUI.this)))
      {
        ComposeUI.this.aLo();
        try
        {
          paramWebView = URLDecoder.decode(paramString.substring(ComposeUI.m(ComposeUI.this).length()), "utf-8").split("@@");
          localObject = paramWebView[0].split(":");
          paramString = localObject[0];
          localObject = localObject[1];
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "img onclick, src: %s, msgLocalId: %s, msgSvrId: %s", new Object[] { paramWebView[1], paramString, localObject });
          at.AR();
          paramWebView = com.tencent.mm.y.c.yM().cM(Integer.valueOf(paramString).intValue());
          paramString = new Intent(ComposeUI.this, MailImageDownloadUI.class);
          paramString.putExtra("img_msg_id", paramWebView.field_msgId);
          paramString.putExtra("img_server_id", paramWebView.field_msgSvrId);
          paramString.putExtra("img_download_compress_type", 0);
          paramString.putExtra("img_download_username", paramWebView.field_talker);
          ComposeUI.this.startActivity(paramString);
          GMTrace.o(19547335688192L, 145639);
          return true;
        }
        catch (Exception paramWebView)
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ComposeUI", "shouldOverrideUrlLoading IMG_ONCLICK, ex = %s", new Object[] { paramWebView.getMessage() });
        }
      }
      do
      {
        GMTrace.o(19547335688192L, 145639);
        return true;
        if (paramString.startsWith(ComposeUI.n(ComposeUI.this))) {
          try
          {
            ComposeUI.a(ComposeUI.this, URLDecoder.decode(paramString.substring(ComposeUI.n(ComposeUI.this).length()), "utf-8"));
            if (ComposeUI.o(ComposeUI.this)) {
              if (ComposeUI.p(ComposeUI.this).indexOf("<img") == -1)
              {
                ComposeUI.q(ComposeUI.this).clear();
                ComposeUI.r(ComposeUI.this);
                GMTrace.o(19547335688192L, 145639);
                return true;
              }
            }
          }
          catch (Exception paramWebView)
          {
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ComposeUI", "shouldOverrideUrlLoading GET_MAIL_CONTENT, ex = %s", new Object[] { paramWebView.getMessage() });
            }
            s.a(ComposeUI.s(ComposeUI.this), ComposeUI.t(ComposeUI.this), ComposeUI.u(ComposeUI.this));
            GMTrace.o(19547335688192L, 145639);
            return true;
          }
        }
      } while (!paramString.startsWith(ComposeUI.t(ComposeUI.this)));
      ComposeUI.q(ComposeUI.this).clear();
      try
      {
        paramWebView = URLDecoder.decode(paramString.substring(ComposeUI.t(ComposeUI.this).length()), "utf-8");
        localObject = paramWebView.split("&&");
        int i = 0;
        while (i < localObject.length)
        {
          paramWebView = localObject[i].split("@@");
          String str = paramWebView[0].split(":")[1];
          paramString = paramWebView[1];
          paramWebView = paramString;
          if (paramString.startsWith("file://")) {
            paramWebView = paramString.replaceFirst("file://", "");
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ComposeUI", "put msgImgInfoMap, msgSvrId: %s, path: %s", new Object[] { str, paramWebView });
          ComposeUI.q(ComposeUI.this).put(str, paramWebView);
          i += 1;
        }
        if (!ComposeUI.o(ComposeUI.this)) {
          break label591;
        }
      }
      catch (Exception paramWebView)
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ComposeUI", "shouldOverrideUrlLoading GET_IMG_INFO, ex = %s", new Object[] { paramWebView.getMessage() });
        GMTrace.o(19547335688192L, 145639);
        return true;
      }
      ComposeUI.r(ComposeUI.this);
      label591:
      GMTrace.o(19547335688192L, 145639);
      return true;
    }
  }
  
  private final class c
    extends MailAddrsViewControl.c
  {
    private ImageView nVx;
    private int tag;
    
    public c(ImageView paramImageView, int paramInt)
    {
      GMTrace.i(5501718888448L, 40991);
      this.nVx = paramImageView;
      this.tag = paramInt;
      GMTrace.o(5501718888448L, 40991);
    }
    
    public final void gH(boolean paramBoolean)
    {
      int i = 0;
      GMTrace.i(5501853106176L, 40992);
      ComposeUI.y(ComposeUI.this);
      Object localObject;
      if (ComposeUI.this.nUO) {
        localObject = this.nVx;
      }
      for (;;)
      {
        ((ImageView)localObject).setVisibility(i);
        if (((this.tag == 1) || (this.tag == 2)) && (!paramBoolean)) {
          ComposeUI.z(ComposeUI.this).postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5506550726656L, 41027);
              if ((!ComposeUI.e(ComposeUI.this).nWO.isFocused()) && (!ComposeUI.f(ComposeUI.this).nWO.isFocused()) && (ComposeUI.e(ComposeUI.this).nWN.size() == 0) && (ComposeUI.f(ComposeUI.this).nWN.size() == 0) && (ComposeUI.e(ComposeUI.this).aZi()) && (ComposeUI.f(ComposeUI.this).aZi()))
              {
                ComposeUI.z(ComposeUI.this).setVisibility(0);
                ComposeUI.A(ComposeUI.this).setVisibility(8);
                ComposeUI.B(ComposeUI.this).setVisibility(8);
              }
              GMTrace.o(5506550726656L, 41027);
            }
          }, 10L);
        }
        GMTrace.o(5501853106176L, 40992);
        return;
        ImageView localImageView = this.nVx;
        localObject = localImageView;
        if (!paramBoolean)
        {
          i = 4;
          localObject = localImageView;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\ui\ComposeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */