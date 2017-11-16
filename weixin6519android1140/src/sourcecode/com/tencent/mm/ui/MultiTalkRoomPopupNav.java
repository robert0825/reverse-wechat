package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.as.b;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.g;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiTalkRoomPopupNav
  extends LinearLayout
{
  public int vNA;
  public a vNB;
  private final int vNC;
  public LinearLayout vND;
  public boolean vNE;
  public b vNF;
  public LinearLayout vNs;
  public View vNt;
  public TextView vNu;
  public TextView vNv;
  public TextView vNw;
  public String vNx;
  public String vNy;
  public boolean vNz;
  
  public MultiTalkRoomPopupNav(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1906428608512L, 14204);
    this.vNA = b.vNK;
    this.vNC = 6;
    this.vNE = false;
    this.vNF = new b();
    MP();
    GMTrace.o(1906428608512L, 14204);
  }
  
  @TargetApi(11)
  public MultiTalkRoomPopupNav(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1906294390784L, 14203);
    this.vNA = b.vNK;
    this.vNC = 6;
    this.vNE = false;
    this.vNF = new b();
    MP();
    GMTrace.o(1906294390784L, 14203);
  }
  
  private void MP()
  {
    GMTrace.i(1906562826240L, 14205);
    inflate(getContext(), R.i.cCE, this);
    this.vNs = ((LinearLayout)findViewById(R.h.bOT));
    this.vNt = findViewById(R.h.bOS);
    this.vNu = ((TextView)findViewById(R.h.bOW));
    this.vNv = ((TextView)findViewById(R.h.bOX));
    this.vNw = ((TextView)findViewById(R.h.bOY));
    this.vND = ((LinearLayout)findViewById(R.h.bOO));
    this.vNs.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2075811381248L, 15466);
        if ((p.a.tmc != null) && (p.a.tmd.aR(MultiTalkRoomPopupNav.this.getContext())))
        {
          w.d("MicroMsg.MultiTalkRoomPopupNav", "is voip talking");
          GMTrace.o(2075811381248L, 15466);
          return;
        }
        if ((p.a.tmc != null) && (p.a.tmc.aKD()))
        {
          Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dCZ), 0).show();
          w.d("MicroMsg.MultiTalkRoomPopupNav", "is show loation");
          GMTrace.o(2075811381248L, 15466);
          return;
        }
        MultiTalkRoomPopupNav.a(MultiTalkRoomPopupNav.this);
        GMTrace.o(2075811381248L, 15466);
      }
    });
    GMTrace.o(1906562826240L, 14205);
  }
  
  private void d(String paramString1, List<String> paramList, final String paramString2)
  {
    GMTrace.i(1906965479424L, 14208);
    this.vNt.setVisibility(8);
    this.vNs.setVisibility(8);
    if (this.vNA == b.vNI) {}
    a locala;
    View.OnClickListener local2;
    for (boolean bool = true;; bool = false)
    {
      this.vNB = new a(bool);
      if (p.a.tmd == null) {
        break label293;
      }
      locala = this.vNB;
      local2 = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          int i = 0;
          GMTrace.i(2070308454400L, 15425);
          w.i("MicroMsg.MultiTalkRoomPopupNav", "click enter button..");
          if (paramString2 != null)
          {
            if (p.a.tmd.aRF())
            {
              w.e("MicroMsg.MultiTalkRoomPopupNav", "now is in other voip..");
              h.b(MultiTalkRoomPopupNav.this.getContext(), ab.getContext().getString(R.l.dJV), null, true);
              GMTrace.o(2070308454400L, 15425);
              return;
            }
            paramAnonymousView = p.a.tmd.CU(MultiTalkRoomPopupNav.b(MultiTalkRoomPopupNav.this));
            if (paramAnonymousView.size() != 1) {
              break label247;
            }
            MultiTalkRoomPopupNav.Vk(paramString2);
            g.ork.i(13945, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), MultiTalkRoomPopupNav.b(MultiTalkRoomPopupNav.this), Integer.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomId), Long.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomKey) });
          }
          for (;;)
          {
            MultiTalkRoomPopupNav.e(MultiTalkRoomPopupNav.this).close();
            MultiTalkRoomPopupNav.f(MultiTalkRoomPopupNav.this).setVisibility(0);
            MultiTalkRoomPopupNav.g(MultiTalkRoomPopupNav.this).setVisibility(0);
            MultiTalkRoomPopupNav.h(MultiTalkRoomPopupNav.this).setVisibility(8);
            GMTrace.o(2070308454400L, 15425);
            return;
            label247:
            if (paramAnonymousView.size() >= 9)
            {
              w.e("MicroMsg.MultiTalkRoomPopupNav", "now is up to the limit,memberList size:" + paramAnonymousView.size());
              h.b(MultiTalkRoomPopupNav.this.getContext(), ab.getContext().getString(R.l.dJX, new Object[] { Integer.valueOf(9) }), null, true);
              paramAnonymousView = g.ork;
              if (MultiTalkRoomPopupNav.d(MultiTalkRoomPopupNav.this) == MultiTalkRoomPopupNav.b.vNI) {
                i = 1;
              }
              paramAnonymousView.i(13945, new Object[] { Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(1), MultiTalkRoomPopupNav.b(MultiTalkRoomPopupNav.this), Integer.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomId), Long.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomKey) });
              GMTrace.o(2070308454400L, 15425);
              return;
            }
            if (p.a.tmd.aRE())
            {
              w.e("MicroMsg.MultiTalkRoomPopupNav", "now is inviting other people voip..");
              h.b(MultiTalkRoomPopupNav.this.getContext(), ab.getContext().getString(R.l.dJU), null, true);
              paramAnonymousView = g.ork;
              if (MultiTalkRoomPopupNav.d(MultiTalkRoomPopupNav.this) == MultiTalkRoomPopupNav.b.vNI) {}
              for (i = 1;; i = 0)
              {
                paramAnonymousView.i(13945, new Object[] { Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(1), MultiTalkRoomPopupNav.b(MultiTalkRoomPopupNav.this), Integer.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomId), Long.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomKey) });
                GMTrace.o(2070308454400L, 15425);
                return;
              }
            }
            MultiTalkRoomPopupNav.a(MultiTalkRoomPopupNav.this, paramString2);
          }
        }
      };
      paramString2 = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          int i = 1;
          GMTrace.i(2087354105856L, 15552);
          w.i("MicroMsg.MultiTalkRoomPopupNav", "click cancel button..");
          if (MultiTalkRoomPopupNav.d(MultiTalkRoomPopupNav.this) == MultiTalkRoomPopupNav.b.vNI)
          {
            w.i("MicroMsg.MultiTalkRoomPopupNav", "reject multiTalk!");
            boolean bool = p.a.tmd.CW(paramString2);
            p.a.tmd.CX(paramString2);
            paramAnonymousView = g.ork;
            if (bool) {
              i = 0;
            }
            paramAnonymousView.i(13945, new Object[] { Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i), MultiTalkRoomPopupNav.b(MultiTalkRoomPopupNav.this), Integer.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomId), Long.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomKey) });
          }
          for (;;)
          {
            MultiTalkRoomPopupNav.e(MultiTalkRoomPopupNav.this).close();
            MultiTalkRoomPopupNav.f(MultiTalkRoomPopupNav.this).setVisibility(0);
            MultiTalkRoomPopupNav.g(MultiTalkRoomPopupNav.this).setVisibility(0);
            MultiTalkRoomPopupNav.h(MultiTalkRoomPopupNav.this).setVisibility(8);
            GMTrace.o(2087354105856L, 15552);
            return;
            g.ork.i(13945, new Object[] { Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), MultiTalkRoomPopupNav.b(MultiTalkRoomPopupNav.this), Integer.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomId), Long.valueOf(MultiTalkRoomPopupNav.c(MultiTalkRoomPopupNav.this).field_roomKey) });
          }
        }
      };
      locala.titleView.setText(paramString1);
      locala.vNH.setVisibility(0);
      locala.vNG.vND.setVisibility(0);
      locala.vNG.vND.removeAllViews();
      paramString1 = paramList.iterator();
      while (paramString1.hasNext())
      {
        paramList = (String)paramString1.next();
        ImageView localImageView = new ImageView(locala.vNG.getContext());
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(a.fromDPToPix(ab.getContext(), 26), a.fromDPToPix(ab.getContext(), 26));
        localLayoutParams.rightMargin = a.fromDPToPix(ab.getContext(), 10);
        localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        localImageView.setLayoutParams(localLayoutParams);
        locala.vNG.vND.addView(localImageView);
        a.b.a(localImageView, paramList, 0.1F, false);
      }
    }
    ((Button)locala.vNG.findViewById(R.h.bOK)).setOnClickListener(local2);
    ((Button)locala.vNG.findViewById(R.h.bOJ)).setOnClickListener(paramString2);
    label293:
    GMTrace.o(1906965479424L, 14208);
  }
  
  public static List<String> k(List<String> paramList, String paramString)
  {
    GMTrace.i(1907233914880L, 14210);
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList1 = new ArrayList();
    Object localObject = paramList;
    if (paramString != null)
    {
      localObject = paramList;
      if (paramString != "")
      {
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          localObject = (String)paramList.next();
          if ((localObject != null) && (!((String)localObject).equals(paramString))) {
            localArrayList1.add(localObject);
          }
        }
        localObject = localArrayList1;
      }
    }
    paramList = ((List)localObject).iterator();
    while (paramList.hasNext()) {
      localArrayList2.add((String)paramList.next());
    }
    GMTrace.o(1907233914880L, 14210);
    return localArrayList2;
  }
  
  public final void Vj(String paramString)
  {
    GMTrace.i(1906697043968L, 14206);
    this.vNt.setBackgroundResource(R.g.aYc);
    this.vNu.setTextColor(getResources().getColor(R.e.aOv));
    this.vNu.setText(paramString);
    if ((this.vND == null) || (this.vND.getVisibility() != 0))
    {
      this.vNu.setVisibility(0);
      this.vNw.setVisibility(8);
      this.vNv.setVisibility(8);
      this.vND.setVisibility(8);
    }
    GMTrace.o(1906697043968L, 14206);
  }
  
  public final void bYg()
  {
    GMTrace.i(1906831261696L, 14207);
    this.vNE = false;
    setVisibility(8);
    if (this.vNB != null) {
      this.vNB.close();
    }
    GMTrace.o(1906831261696L, 14207);
  }
  
  public final void cy(List<String> paramList)
  {
    GMTrace.i(1907099697152L, 14209);
    if ((this.vND != null) && (this.vND.getVisibility() == 0))
    {
      this.vND.removeAllViews();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        ImageView localImageView = new ImageView(getContext());
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(a.fromDPToPix(ab.getContext(), 26), a.fromDPToPix(ab.getContext(), 26));
        localLayoutParams.rightMargin = a.fromDPToPix(ab.getContext(), 10);
        localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        localImageView.setLayoutParams(localLayoutParams);
        this.vND.addView(localImageView);
        a.b.a(localImageView, str, 0.1F, false);
      }
    }
    GMTrace.o(1907099697152L, 14209);
  }
  
  public final class a
  {
    private Button kWK;
    TextView titleView;
    LinearLayout vNH;
    
    public a(boolean paramBoolean)
    {
      GMTrace.i(3086605090816L, 22997);
      this.kWK = ((Button)MultiTalkRoomPopupNav.this.findViewById(R.h.bOJ));
      this.titleView = ((TextView)MultiTalkRoomPopupNav.this.findViewById(R.h.bOV));
      this.vNH = ((LinearLayout)MultiTalkRoomPopupNav.this.findViewById(R.h.bOM));
      if (paramBoolean)
      {
        this.vNH.setBackgroundResource(R.g.aYd);
        this.kWK.setTextColor(MultiTalkRoomPopupNav.this.getResources().getColor(R.e.aOv));
        GMTrace.o(3086605090816L, 22997);
        return;
      }
      this.vNH.setBackgroundResource(R.g.aYc);
      this.kWK.setTextColor(MultiTalkRoomPopupNav.this.getResources().getColor(R.e.aNb));
      GMTrace.o(3086605090816L, 22997);
    }
    
    public final void close()
    {
      GMTrace.i(16020362231808L, 119361);
      this.vNH.setVisibility(8);
      GMTrace.o(16020362231808L, 119361);
    }
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(1881732546560L, 14020);
      vNI = 1;
      vNJ = 2;
      vNK = 3;
      vNL = new int[] { vNI, vNJ, vNK };
      GMTrace.o(1881732546560L, 14020);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\MultiTalkRoomPopupNav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */