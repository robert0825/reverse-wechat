package com.tencent.mm.plugin.collect.reward.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.c;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.ku;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMGridView;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.ak.b.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class QrRewardSelectMoneyUI
  extends QrRewardBaseUI
{
  private int ePH;
  private String hZW;
  private String jXA;
  private String jXB;
  private String jXC;
  private String jXD;
  private String jXE;
  private int jXF;
  private String jXw;
  private String jXy;
  private List<Integer> jYm;
  private ImageView jYn;
  private TextView jYo;
  private TextView jYp;
  private TextView jYq;
  private TextView jYr;
  private MMGridView jYs;
  private TextView jYt;
  private a jYu;
  private String jYv;
  private String jYw;
  
  public QrRewardSelectMoneyUI()
  {
    GMTrace.i(19354464813056L, 144202);
    this.jYm = new ArrayList();
    GMTrace.o(19354464813056L, 144202);
  }
  
  protected final void MP()
  {
    GMTrace.i(19354867466240L, 144205);
    this.jYn = ((ImageView)findViewById(a.f.sFb));
    this.jYo = ((TextView)findViewById(a.f.sFg));
    this.jYp = ((TextView)findViewById(a.f.sFe));
    this.jYq = ((TextView)findViewById(a.f.sFc));
    this.jYr = ((TextView)findViewById(a.f.sFh));
    this.jYs = ((MMGridView)findViewById(a.f.sFd));
    this.jYt = ((TextView)findViewById(a.f.sFf));
    this.jYu = new a((byte)0);
    this.jYs.setAdapter(this.jYu);
    this.jYs.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(19353256853504L, 144193);
        paramAnonymousInt = ((Integer)paramAnonymousAdapterView.getAdapter().getItem(paramAnonymousInt)).intValue();
        QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this, paramAnonymousInt, 1);
        GMTrace.o(19353256853504L, 144193);
      }
    });
    this.jYt.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19358625562624L, 144233);
        QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this, 0, 2);
        GMTrace.o(19358625562624L, 144233);
      }
    });
    GMTrace.o(19354867466240L, 144205);
  }
  
  protected final void aoI()
  {
    GMTrace.i(19354733248512L, 144204);
    GMTrace.o(19354733248512L, 144204);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(19355001683968L, 144206);
    if ((paramk instanceof com.tencent.mm.plugin.collect.reward.a.e))
    {
      paramString = (com.tencent.mm.plugin.collect.reward.a.e)paramk;
      paramString.a(new a.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(19365336449024L, 144283);
          w.d("MicroMsg.QrRewardSelectMoneyUI", "callback succ");
          QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this, paramString.jXd.ubr);
          QrRewardSelectMoneyUI.b(QrRewardSelectMoneyUI.this, paramString.jXd.omt);
          QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this, paramString.jXd.ubd);
          QrRewardSelectMoneyUI.c(QrRewardSelectMoneyUI.this, paramString.jXd.ubo);
          QrRewardSelectMoneyUI.d(QrRewardSelectMoneyUI.this, paramString.jXd.desc);
          QrRewardSelectMoneyUI.e(QrRewardSelectMoneyUI.this, paramString.jXd.ubw);
          QrRewardSelectMoneyUI.f(QrRewardSelectMoneyUI.this, paramString.jXd.ubx);
          QrRewardSelectMoneyUI.g(QrRewardSelectMoneyUI.this, paramString.jXd.ubu);
          QrRewardSelectMoneyUI.h(QrRewardSelectMoneyUI.this, paramString.jXd.ubz);
          QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this, paramString.jXd.ubb);
          if (QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this) == null)
          {
            w.i("MicroMsg.QrRewardSelectMoneyUI", "amt_list is null");
            QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this, new LinkedList());
          }
          QrRewardSelectMoneyUI.b(QrRewardSelectMoneyUI.this);
          GMTrace.o(19365336449024L, 144283);
        }
      }).b(new a.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(19361578352640L, 144255);
          w.e("MicroMsg.QrRewardSelectMoneyUI", "scan response error");
          if (!bg.nm(paramString.jXd.jWt)) {
            Toast.makeText(QrRewardSelectMoneyUI.this, paramString.jXd.jWt, 1).show();
          }
          QrRewardSelectMoneyUI.this.finish();
          GMTrace.o(19361578352640L, 144255);
        }
      }).c(new a.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(19358357127168L, 144231);
          w.e("MicroMsg.QrRewardSelectMoneyUI", "net error: %s", new Object[] { paramString });
          com.tencent.mm.ui.base.h.a(QrRewardSelectMoneyUI.this.vKB.vKW, QrRewardSelectMoneyUI.this.getString(a.i.tgK), null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(19372986859520L, 144340);
              QrRewardSelectMoneyUI.this.finish();
              GMTrace.o(19372986859520L, 144340);
            }
          });
          GMTrace.o(19358357127168L, 144231);
        }
      });
      super.aoI();
      sv(0);
    }
    GMTrace.o(19355001683968L, 144206);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19355135901696L, 144207);
    int i = a.g.sOj;
    GMTrace.o(19355135901696L, 144207);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(19355404337152L, 144209);
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        w.i("MicroMsg.QrRewardSelectMoneyUI", "pay succ");
        finish();
        GMTrace.o(19355404337152L, 144209);
      }
    }
    else {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    GMTrace.o(19355404337152L, 144209);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19354599030784L, 144203);
    super.onCreate(paramBundle);
    hN(1516);
    oM(a.i.sWT);
    sv(4);
    this.jYv = getIntent().getStringExtra("key_qrcode_url");
    this.ePH = getIntent().getIntExtra("key_channel", 0);
    this.hZW = getIntent().getStringExtra("key_web_url");
    w.i("MicroMsg.QrRewardSelectMoneyUI", "do scan code");
    l(new com.tencent.mm.plugin.collect.reward.a.e(this.jYv, this.ePH, this.hZW));
    MP();
    int i = getIntent().getIntExtra("key_scene", 0);
    w.d("MicroMsg.QrRewardSelectMoneyUI", "scene: %s", new Object[] { Integer.valueOf(i) });
    g.ork.i(14721, new Object[] { Integer.valueOf(2), Integer.valueOf(i) });
    GMTrace.o(19354599030784L, 144203);
  }
  
  public void onDestroy()
  {
    GMTrace.i(19355270119424L, 144208);
    super.onDestroy();
    hO(1516);
    GMTrace.o(19355270119424L, 144208);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(19352317329408L, 144186);
      GMTrace.o(19352317329408L, 144186);
    }
    
    public final int getCount()
    {
      GMTrace.i(19352451547136L, 144187);
      int i = QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this).size();
      GMTrace.o(19352451547136L, 144187);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(19352585764864L, 144188);
      Object localObject = QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this).get(paramInt);
      GMTrace.o(19352585764864L, 144188);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(19352719982592L, 144189);
      long l = paramInt;
      GMTrace.o(19352719982592L, 144189);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(19352854200320L, 144190);
      View localView = paramView;
      if (paramView == null) {
        localView = LayoutInflater.from(QrRewardSelectMoneyUI.this.vKB.vKW).inflate(a.g.sOi, paramViewGroup, false);
      }
      paramInt = ((Integer)getItem(paramInt)).intValue();
      paramView = (TextView)localView.findViewById(a.f.sFa);
      int i = paramInt / 100;
      double d = paramInt / 100.0D;
      if (d > i) {
        paramView.setText(String.format("%.2f", new Object[] { Double.valueOf(d) }) + QrRewardSelectMoneyUI.this.getString(a.i.sXd));
      }
      for (;;)
      {
        GMTrace.o(19352854200320L, 144190);
        return localView;
        paramView.setText(String.format("%d", new Object[] { Integer.valueOf(i) }) + QrRewardSelectMoneyUI.this.getString(a.i.sXd));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\collect\reward\ui\QrRewardSelectMoneyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */