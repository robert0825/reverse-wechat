package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.qqmail.b.p.a;
import com.tencent.mm.plugin.qqmail.b.p.c;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import java.util.HashMap;
import java.util.Map;

public class AttachDownloadPage
  extends MMActivity
{
  private long eJe;
  private long haU;
  private int hak;
  private TextView hql;
  private TextView iBh;
  private ProgressBar jeL;
  private Button lhG;
  private Button lhI;
  private View lhL;
  private String nRW;
  private String nSK;
  private long nTR;
  private MMImageView nUc;
  private ImageView nUd;
  private ImageView nUe;
  private TextView nUf;
  private String nUg;
  private int nUh;
  private boolean nUi;
  private String nUj;
  private boolean nUk;
  private int retryCount;
  
  public AttachDownloadPage()
  {
    GMTrace.i(5480244051968L, 40831);
    this.nUi = false;
    this.haU = 0L;
    this.nUk = true;
    this.hak = 0;
    this.retryCount = 0;
    GMTrace.o(5480244051968L, 40831);
  }
  
  private void aYK()
  {
    GMTrace.i(5481183576064L, 40838);
    this.lhL.setVisibility(0);
    this.lhG.setVisibility(8);
    this.lhI.setVisibility(8);
    this.nUd.setVisibility(0);
    this.nUe.setVisibility(8);
    this.nUf.setVisibility(8);
    this.hql.setVisibility(8);
    this.iBh.setVisibility(8);
    this.nUd.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5555003326464L, 41388);
        AttachDownloadPage.a(AttachDownloadPage.this, 2);
        com.tencent.mm.plugin.qqmail.b.w.aYE().cancel(AttachDownloadPage.b(AttachDownloadPage.this));
        AttachDownloadPage.c(AttachDownloadPage.this);
        AttachDownloadPage.d(AttachDownloadPage.this);
        GMTrace.o(5555003326464L, 41388);
      }
    });
    this.nUe.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5568290881536L, 41487);
        AttachDownloadPage.e(AttachDownloadPage.this);
        AttachDownloadPage.f(AttachDownloadPage.this);
        GMTrace.o(5568290881536L, 41487);
      }
    });
    GMTrace.o(5481183576064L, 40838);
  }
  
  private void aYL()
  {
    GMTrace.i(5481317793792L, 40839);
    if (this.nUh == 1)
    {
      if (FileExplorerUI.PF(this.nUj))
      {
        if (this.hak == 3)
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("key_favorite", true);
          localIntent.putExtra("key_favorite_source_type", 9);
          localIntent.putExtra("key_image_path", gG(false));
          com.tencent.mm.plugin.qqmail.a.a.hnH.c(this.vKB.vKW, localIntent);
          finish();
          GMTrace.o(5481317793792L, 40839);
          return;
        }
        if ((this.hak == 0) || (this.nUk))
        {
          this.retryCount = 0;
          this.nUk = false;
          aYM();
          aYK();
          GMTrace.o(5481317793792L, 40839);
          return;
        }
      }
      this.lhL.setVisibility(8);
      this.hql.setVisibility(0);
      this.nUf.setVisibility(8);
      this.lhG.setVisibility(0);
      this.lhI.setVisibility(8);
      this.iBh.setVisibility(0);
      this.lhG.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5532588965888L, 41221);
          AttachDownloadPage.g(AttachDownloadPage.this);
          GMTrace.o(5532588965888L, 41221);
        }
      });
      if (this.hak == 3)
      {
        this.hql.setText(R.l.dHA);
        this.iBh.setText(R.l.dHx);
        this.iBh.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(5485881196544L, 40873);
            AttachDownloadPage.b(AttachDownloadPage.this, AttachDownloadPage.a(AttachDownloadPage.this));
            GMTrace.o(5485881196544L, 40873);
          }
        });
        lf(true);
        GMTrace.o(5481317793792L, 40839);
        return;
      }
      this.hql.setText(R.l.dHA);
      if (this.hak == 2) {
        this.iBh.setText(R.l.dHz);
      }
      for (;;)
      {
        this.iBh.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(5551245230080L, 41360);
            AttachDownloadPage.e(AttachDownloadPage.this);
            AttachDownloadPage.f(AttachDownloadPage.this);
            AttachDownloadPage.h(AttachDownloadPage.this);
            GMTrace.o(5551245230080L, 41360);
          }
        });
        GMTrace.o(5481317793792L, 40839);
        return;
        this.iBh.setText(R.l.dHy);
      }
    }
    if (this.nUh == 0)
    {
      this.lhL.setVisibility(8);
      this.lhG.setVisibility(8);
      this.lhI.setVisibility(0);
      this.nUf.setVisibility(8);
      this.hql.setVisibility(0);
      this.iBh.setVisibility(8);
      if (this.hak != 3) {
        break label445;
      }
      this.lhI.setText(R.l.dHv);
      lf(true);
    }
    for (;;)
    {
      this.hql.setText(R.l.dHu);
      this.lhI.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5488833986560L, 40895);
          if (AttachDownloadPage.i(AttachDownloadPage.this) == 3)
          {
            AttachDownloadPage.b(AttachDownloadPage.this, AttachDownloadPage.a(AttachDownloadPage.this));
            GMTrace.o(5488833986560L, 40895);
            return;
          }
          AttachDownloadPage.h(AttachDownloadPage.this);
          AttachDownloadPage.e(AttachDownloadPage.this);
          AttachDownloadPage.f(AttachDownloadPage.this);
          GMTrace.o(5488833986560L, 40895);
        }
      });
      GMTrace.o(5481317793792L, 40839);
      return;
      label445:
      if (this.hak == 2) {
        this.lhI.setText(R.l.dHB);
      } else {
        this.lhI.setText(R.l.dHt);
      }
    }
  }
  
  private void aYM()
  {
    GMTrace.i(5481452011520L, 40840);
    aYP();
    if (this.hak == 4) {
      if (this.retryCount < 5)
      {
        this.retryCount += 1;
        aYM();
      }
    }
    for (;;)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("mailid", this.nRW);
      localHashMap.put("attachid", this.nSK);
      localHashMap.put("username", "");
      localHashMap.put("offset", this.haU);
      localHashMap.put("datalen", this.eJe);
      localHashMap.put("default_attach_name", aYN() + ".temp");
      p.c localc = new p.c();
      localc.nTc = false;
      localc.nTd = false;
      this.nTR = com.tencent.mm.plugin.qqmail.b.w.aYE().a("/cgi-bin/mmdownload", localHashMap, localc, new p.a()
      {
        public final void onComplete()
        {
          GMTrace.i(5507221815296L, 41032);
          GMTrace.o(5507221815296L, 41032);
        }
        
        public final void onError(int paramAnonymousInt, String paramAnonymousString)
        {
          GMTrace.i(5507087597568L, 41031);
          AttachDownloadPage.a(AttachDownloadPage.this, 4);
          if (AttachDownloadPage.m(AttachDownloadPage.this) < 5)
          {
            AttachDownloadPage.n(AttachDownloadPage.this);
            AttachDownloadPage.f(AttachDownloadPage.this);
            GMTrace.o(5507087597568L, 41031);
            return;
          }
          AttachDownloadPage.d(AttachDownloadPage.this);
          GMTrace.o(5507087597568L, 41031);
        }
        
        public final void onProgress(int paramAnonymousInt)
        {
          GMTrace.i(5506819162112L, 41029);
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AttachDownloadPage", "download progress : " + paramAnonymousInt);
          AttachDownloadPage.j(AttachDownloadPage.this);
          AttachDownloadPage.a(AttachDownloadPage.this, 1);
          GMTrace.o(5506819162112L, 41029);
        }
        
        public final void onSuccess(String paramAnonymousString, Map<String, String> paramAnonymousMap)
        {
          GMTrace.i(5506953379840L, 41030);
          e.g(AttachDownloadPage.k(AttachDownloadPage.this), AttachDownloadPage.l(AttachDownloadPage.this) + ".temp", AttachDownloadPage.l(AttachDownloadPage.this));
          AttachDownloadPage.a(AttachDownloadPage.this, 3);
          Toast.makeText(AttachDownloadPage.this, AttachDownloadPage.this.getString(R.l.dns) + " : " + AttachDownloadPage.a(AttachDownloadPage.this), 5000).show();
          AttachDownloadPage.d(AttachDownloadPage.this);
          GMTrace.o(5506953379840L, 41030);
        }
      });
      GMTrace.o(5481452011520L, 40840);
      return;
      aYL();
      continue;
      if (this.hak == 3)
      {
        e.g(this.nUg, aYN() + ".temp", aYN());
        this.hak = 3;
        aYL();
      }
    }
  }
  
  private String aYN()
  {
    GMTrace.i(5481720446976L, 40842);
    int i = this.nSK.hashCode();
    int j = this.nUj.lastIndexOf(".");
    String str2 = "";
    String str1;
    if (j != -1)
    {
      str1 = this.nUj.substring(0, j);
      str2 = this.nUj.substring(j, this.nUj.length());
    }
    for (;;)
    {
      str1 = String.format("%s_%d%s", new Object[] { str1, Integer.valueOf(i & 0xFFFF), str2 });
      GMTrace.o(5481720446976L, 40842);
      return str1;
      str1 = this.nUj;
    }
  }
  
  private String aYO()
  {
    GMTrace.i(5481988882432L, 40844);
    String str = this.nUg + this.nUj;
    GMTrace.o(5481988882432L, 40844);
    return str;
  }
  
  private void aYP()
  {
    GMTrace.i(5482123100160L, 40845);
    if (e.aZ(gG(true)))
    {
      this.haU = e.aY(gG(true));
      this.hak = 2;
      GMTrace.o(5482123100160L, 40845);
      return;
    }
    if (e.aZ(gG(false)))
    {
      this.hak = 3;
      GMTrace.o(5482123100160L, 40845);
      return;
    }
    if (e.aZ(aYO()))
    {
      if (e.aY(aYO()) == this.eJe)
      {
        e.g(this.nUg, this.nUj, aYN());
        this.hak = 3;
        GMTrace.o(5482123100160L, 40845);
        return;
      }
      if (e.aY(aYO()) > this.eJe)
      {
        b.deleteFile(aYO());
        this.haU = 0L;
        this.hak = 4;
        GMTrace.o(5482123100160L, 40845);
        return;
      }
      this.haU = 0L;
      this.hak = 0;
      GMTrace.o(5482123100160L, 40845);
      return;
    }
    this.haU = 0L;
    this.hak = 0;
    GMTrace.o(5482123100160L, 40845);
  }
  
  private String gG(boolean paramBoolean)
  {
    GMTrace.i(5481854664704L, 40843);
    StringBuilder localStringBuilder = new StringBuilder().append(this.nUg).append(aYN());
    if (!paramBoolean) {}
    for (String str = "";; str = ".temp")
    {
      str = str;
      GMTrace.o(5481854664704L, 40843);
      return str;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(5481049358336L, 40837);
    this.nUc = ((MMImageView)findViewById(R.h.bvl));
    this.lhL = findViewById(R.h.bvc);
    this.jeL = ((ProgressBar)findViewById(R.h.bvb));
    this.nUd = ((ImageView)findViewById(R.h.bvg));
    this.nUe = ((ImageView)findViewById(R.h.bve));
    this.nUf = ((TextView)findViewById(R.h.beX));
    this.lhG = ((Button)findViewById(R.h.beZ));
    this.lhI = ((Button)findViewById(R.h.beW));
    this.hql = ((TextView)findViewById(R.h.beY));
    this.iBh = ((TextView)findViewById(R.h.bfa));
    if (FileExplorerUI.PF(this.nUj)) {
      this.nUc.setBackgroundResource(R.k.cLY);
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(5541447335936L, 41287);
          AttachDownloadPage.this.finish();
          GMTrace.o(5541447335936L, 41287);
          return true;
        }
      });
      a(0, R.k.cNO, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(5534333796352L, 41234);
          paramAnonymousMenuItem = AttachDownloadPage.this;
          String str = AttachDownloadPage.this.getString(R.l.dNH);
          h.c local1 = new h.c()
          {
            public final void hQ(int paramAnonymous2Int)
            {
              GMTrace.i(5486686502912L, 40879);
              switch (paramAnonymous2Int)
              {
              }
              for (;;)
              {
                GMTrace.o(5486686502912L, 40879);
                return;
                AttachDownloadPage.a(AttachDownloadPage.this, AttachDownloadPage.a(AttachDownloadPage.this));
              }
            }
          };
          h.a(paramAnonymousMenuItem, "", new String[] { str }, "", false, local1);
          GMTrace.o(5534333796352L, 41234);
          return true;
        }
      });
      lf(false);
      aYP();
      if (this.hak != 1) {
        break;
      }
      aYK();
      GMTrace.o(5481049358336L, 40837);
      return;
      if (FileExplorerUI.PG(this.nUj))
      {
        this.nUc.setImageResource(R.k.cJo);
      }
      else
      {
        int i = q.Oo(e.bb(this.nUj));
        if (i > 0) {
          this.nUc.setImageResource(i);
        } else {
          this.nUc.setImageResource(R.k.cJl);
        }
      }
    }
    aYL();
    GMTrace.o(5481049358336L, 40837);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5480378269696L, 40832);
    int i = R.i.cpv;
    GMTrace.o(5480378269696L, 40832);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5481586229248L, 40841);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramInt1, paramInt2, paramIntent, true, R.l.dnn, R.l.dno, 3);
    GMTrace.o(5481586229248L, 40841);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5480512487424L, 40833);
    super.onCreate(paramBundle);
    this.nUh = getIntent().getIntExtra("is_preview", 0);
    this.nUi = getIntent().getBooleanExtra("is_compress", false);
    this.nUj = getIntent().getStringExtra("attach_name");
    this.nRW = getIntent().getStringExtra("mail_id");
    this.nSK = getIntent().getStringExtra("attach_id");
    this.eJe = getIntent().getLongExtra("total_size", 0L);
    com.tencent.mm.plugin.qqmail.b.w.aYE();
    this.nUg = com.tencent.mm.plugin.qqmail.b.p.getDownloadPath();
    sq(this.nUj);
    MP();
    GMTrace.o(5480512487424L, 40833);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5480915140608L, 40836);
    super.onDestroy();
    com.tencent.mm.plugin.qqmail.b.w.aYE().cancel(this.nTR);
    GMTrace.o(5480915140608L, 40836);
  }
  
  protected void onPause()
  {
    GMTrace.i(5480780922880L, 40835);
    super.onPause();
    GMTrace.o(5480780922880L, 40835);
  }
  
  protected void onResume()
  {
    GMTrace.i(5480646705152L, 40834);
    super.onResume();
    GMTrace.o(5480646705152L, 40834);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\ui\AttachDownloadPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */