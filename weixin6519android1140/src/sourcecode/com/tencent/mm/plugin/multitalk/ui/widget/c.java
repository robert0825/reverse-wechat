package com.tencent.mm.plugin.multitalk.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.multitalk.a.e;
import com.tencent.mm.plugin.multitalk.a.i;
import com.tencent.mm.plugin.multitalk.a.o;
import com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.r;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import com.tencent.pb.talkroom.sdk.d;
import java.util.ArrayList;
import java.util.List;

public final class c
  implements View.OnClickListener
{
  private TextView jtt;
  private MultiTalkMainUI non;
  private View noo;
  private TextView nop;
  private ImageView noq;
  private LinearLayout nor;
  private ImageButton nos;
  private ImageButton not;
  
  public c(MultiTalkMainUI paramMultiTalkMainUI)
  {
    GMTrace.i(4782177648640L, 35630);
    this.non = paramMultiTalkMainUI;
    this.noo = paramMultiTalkMainUI.findViewById(R.h.bHK);
    this.nop = ((TextView)paramMultiTalkMainUI.findViewById(R.h.bHM));
    this.noq = ((ImageView)paramMultiTalkMainUI.findViewById(R.h.bHL));
    this.nor = ((LinearLayout)paramMultiTalkMainUI.findViewById(R.h.cff));
    this.jtt = ((TextView)paramMultiTalkMainUI.findViewById(R.h.bHv));
    this.nos = ((ImageButton)paramMultiTalkMainUI.findViewById(R.h.bHN));
    this.not = ((ImageButton)paramMultiTalkMainUI.findViewById(R.h.bHJ));
    this.nos.setOnClickListener(this);
    this.not.setOnClickListener(this);
    GMTrace.o(4782177648640L, 35630);
  }
  
  public final void aRX()
  {
    GMTrace.i(4782446084096L, 35632);
    this.noo.setVisibility(8);
    GMTrace.o(4782446084096L, 35632);
  }
  
  public final void n(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4782311866368L, 35631);
    this.noo.setVisibility(0);
    Object localObject = i.aRI();
    ArrayList localArrayList = new ArrayList();
    int i;
    if (!bg.nm((String)localObject))
    {
      i = 0;
      while (i < paramMultiTalkGroup.xOB.size())
      {
        if (!((MultiTalkGroupMember)paramMultiTalkGroup.xOB.get(i)).xOC.equals(localObject)) {
          localArrayList.add(((MultiTalkGroupMember)paramMultiTalkGroup.xOB.get(i)).xOC);
        }
        i += 1;
      }
      this.nop.setText(h.a(this.non, r.fs((String)localObject)));
      a.b.a(this.noq, (String)localObject, 0.1F, true);
    }
    if (localArrayList.size() > 0)
    {
      this.jtt.setVisibility(0);
      this.jtt.setText(R.l.dJW);
      this.nor.setVisibility(0);
      this.nor.removeAllViews();
      i = 0;
      while (i < localArrayList.size())
      {
        paramMultiTalkGroup = new ImageView(this.non.vKB.vKW);
        localObject = new LinearLayout.LayoutParams(b.nog, b.nog);
        if (i != 0) {
          ((LinearLayout.LayoutParams)localObject).leftMargin = b.noe;
        }
        paramMultiTalkGroup.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.nor.addView(paramMultiTalkGroup);
        a.b.a(paramMultiTalkGroup, (String)localArrayList.get(i), 0.1F, false);
        i += 1;
      }
      GMTrace.o(4782311866368L, 35631);
      return;
    }
    this.jtt.setVisibility(8);
    this.nor.setVisibility(8);
    GMTrace.o(4782311866368L, 35631);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(4782580301824L, 35633);
    if (paramView.getId() == R.h.bHJ)
    {
      o.aRR().c(true, false, false);
      GMTrace.o(4782580301824L, 35633);
      return;
    }
    if (paramView.getId() == R.h.bHN)
    {
      paramView = o.aRR();
      if (paramView.aRq())
      {
        w.i("MicroMsg.MT.MultiTalkManager", "acceptCurrentMultiTalk: %s", new Object[] { i.h(paramView.nmp) });
        o.aRQ().nlX.dn(paramView.nmp.xOx, paramView.nmp.xKw);
        GMTrace.o(4782580301824L, 35633);
        return;
      }
      w.e("MicroMsg.MT.MultiTalkManager", "acceptCurrentMultiTalk: Not in MultiTalking");
    }
    GMTrace.o(4782580301824L, 35633);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\ui\widget\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */