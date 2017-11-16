package com.tencent.mm.plugin.sns.lucky.ui;

import android.content.Context;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.q.a.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.i.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.ahh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.wallet_core.ui.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public final class b
  extends BaseAdapter
{
  private LayoutInflater CJ;
  private final String TAG;
  private Context mContext;
  List<a.a> mNm;
  private int mQw;
  
  public b(Context paramContext)
  {
    GMTrace.i(8836089905152L, 65834);
    this.TAG = "SnsLuckyMoneyReceivedRecordListAdapter";
    this.mNm = new ArrayList();
    this.mQw = 1;
    this.mContext = paramContext;
    this.CJ = LayoutInflater.from(paramContext);
    GMTrace.o(8836089905152L, 65834);
  }
  
  private a.a uj(int paramInt)
  {
    GMTrace.i(18436683988992L, 137364);
    a.a locala = (a.a)this.mNm.get(paramInt);
    GMTrace.o(18436683988992L, 137364);
    return locala;
  }
  
  public final int getCount()
  {
    GMTrace.i(8836224122880L, 65835);
    int i = this.mNm.size();
    GMTrace.o(8836224122880L, 65835);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(8836492558336L, 65837);
    GMTrace.o(8836492558336L, 65837);
    return 0L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(8836626776064L, 65838);
    View localView;
    if (paramView == null)
    {
      localView = this.CJ.inflate(a.g.sOE, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.jXQ = ((ImageView)localView.findViewById(a.f.sAs));
      paramViewGroup.mOE = ((TextView)localView.findViewById(a.f.sAv));
      paramViewGroup.mOF = ((TextView)localView.findViewById(a.f.sAw));
      paramViewGroup.mNb = ((TextView)localView.findViewById(a.f.sAq));
      paramViewGroup.mQC = ((TextView)localView.findViewById(a.f.sAu));
      localView.setTag(paramViewGroup);
    }
    for (;;)
    {
      a.a locala = uj(paramInt);
      com.tencent.mm.kernel.h.xz();
      x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(locala.iAx);
      label172:
      long l1;
      Object localObject;
      if (locala.iAx != null)
      {
        a.b.n(paramViewGroup.jXQ, locala.iAx);
        TextView localTextView = paramViewGroup.mOF;
        paramView = this.mContext;
        l1 = locala.mEY * 1000L;
        localObject = new GregorianCalendar();
        if (l1 >= 3600000L) {
          break label395;
        }
        paramView = "";
        label216:
        localTextView.setText(paramView);
        paramViewGroup.mOF.setVisibility(0);
        if (localx == null) {
          break label517;
        }
        com.tencent.mm.plugin.luckymoney.b.n.a(this.mContext, paramViewGroup.mOE, localx.vk());
        label251:
        paramView = new ahh();
      }
      try
      {
        if ((locala.mEZ != null) && (locala.mEZ.uNN > 0))
        {
          paramView.aD(com.tencent.mm.platformtools.n.a(locala.mEZ));
          if (paramView.eYB > 0L)
          {
            paramView = this.mContext.getString(a.i.sAf, new Object[] { e.r(paramView.eYB / 100.0D) });
            paramViewGroup.mNb.setText(paramView);
            paramViewGroup.mQC.setVisibility(8);
          }
          for (;;)
          {
            GMTrace.o(8836626776064L, 65838);
            return localView;
            paramViewGroup = (a)paramView.getTag();
            localView = paramView;
            break;
            w.e("SnsLuckyMoneyReceivedRecordListAdapter", "the contact is null,by username:%s", new Object[] { locala.iAx });
            break label172;
            label395:
            long l2 = l1 - new GregorianCalendar(((GregorianCalendar)localObject).get(1), ((GregorianCalendar)localObject).get(2), ((GregorianCalendar)localObject).get(5)).getTimeInMillis();
            if ((l2 > 0L) && (l2 <= 86400000L))
            {
              paramView = new SimpleDateFormat("HH:mm").format(new Date(l1));
              break label216;
            }
            localObject = new Time();
            ((Time)localObject).set(l1);
            paramView = m.a(paramView.getString(a.i.kcd, new Object[] { " " }), (Time)localObject).toString();
            break label216;
            label517:
            w.e("SnsLuckyMoneyReceivedRecordListAdapter", "the contact is null,by username:%s", new Object[] { locala.iAx });
            break label251;
            paramViewGroup.mNb.setVisibility(8);
            paramViewGroup.mQC.setVisibility(0);
          }
        }
      }
      catch (Exception paramView)
      {
        for (;;)
        {
          w.e("SnsLuckyMoneyReceivedRecordListAdapter", paramView.getMessage() + "hbBuffer is error");
          paramViewGroup.mNb.setVisibility(8);
          paramViewGroup.mQC.setVisibility(8);
          paramViewGroup.jXQ.setVisibility(8);
          paramViewGroup.mOE.setVisibility(8);
          paramViewGroup.mOF.setVisibility(8);
          continue;
          paramViewGroup.mNb.setVisibility(8);
          paramViewGroup.mQC.setVisibility(0);
        }
      }
    }
  }
  
  final class a
  {
    ImageView jXQ;
    TextView mNb;
    TextView mOE;
    TextView mOF;
    TextView mQC;
    
    a()
    {
      GMTrace.i(8843471880192L, 65889);
      GMTrace.o(8843471880192L, 65889);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\lucky\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */