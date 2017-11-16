package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView;
import com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a;
import com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.List;

public final class n
  extends h
{
  public final ae scF;
  public LinearLayout ska;
  public LinearLayout skb;
  public NoteEditorVoiceBaseView skc;
  public ImageView skd;
  private TextView ske;
  public TextView skf;
  public com.tencent.mm.plugin.wenote.model.a.k skg;
  
  public n(View paramView, com.tencent.mm.plugin.wenote.model.nativenote.manager.k paramk)
  {
    super(paramView, paramk);
    GMTrace.i(17155575775232L, 127819);
    this.scF = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(20585509814272L, 153374);
        if (n.this.skg.sdf)
        {
          n.this.scF.removeMessages(4096);
          GMTrace.o(20585509814272L, 153374);
          return;
        }
        paramAnonymousMessage = " " + com.tencent.mm.bf.b.t(ab.getContext(), n.this.skg.sdt).toString();
        n.this.skf.setText(paramAnonymousMessage);
        sendEmptyMessageDelayed(4096, 500L);
        GMTrace.o(20585509814272L, 153374);
      }
    };
    this.ska = ((LinearLayout)paramView.findViewById(R.h.bRP));
    this.skb = ((LinearLayout)paramView.findViewById(R.h.bRO));
    this.skd = ((ImageView)paramView.findViewById(R.h.bRQ));
    this.ske = ((TextView)paramView.findViewById(R.h.bRR));
    this.skf = ((TextView)paramView.findViewById(R.h.bRS));
    this.skc = ((NoteEditorVoiceBaseView)paramView.findViewById(R.h.bRz));
    paramView = a.bII();
    paramk = this.skc;
    if (paramk != null)
    {
      Iterator localIterator = paramView.fIz.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
      } while (paramk != (a.a)localIterator.next());
    }
    for (;;)
    {
      this.sjB.setVisibility(0);
      this.ska.setVisibility(8);
      this.skb.setVisibility(0);
      this.eId.setVisibility(8);
      this.sjw.setVisibility(8);
      this.sjB.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20583496548352L, 153359);
          if ((n.this.skg != null) && (n.this.skg.scV.booleanValue())) {
            n.this.skg.scW = Boolean.valueOf(true);
          }
          GMTrace.o(20583496548352L, 153359);
        }
      });
      GMTrace.o(17155575775232L, 127819);
      return;
      paramView.fIz.add(paramk);
    }
  }
  
  public final void a(com.tencent.mm.plugin.wenote.model.a.b paramb, int paramInt1, int paramInt2)
  {
    GMTrace.i(17155709992960L, 127820);
    this.skg = ((com.tencent.mm.plugin.wenote.model.a.k)paramb);
    Object localObject1;
    Object localObject2;
    if (this.skg.sdf)
    {
      this.skb.setVisibility(0);
      this.ska.setVisibility(8);
      this.sjB.setPadding(0, 0, 0, 0);
      if (paramb.scO)
      {
        this.skc.setBackgroundResource(R.g.bcf);
        localObject1 = this.skc;
        localObject2 = this.skg.eOR;
        int i = this.skg.eIv;
        String str = this.skg.sdu;
        ((NoteEditorVoiceBaseView)localObject1).path = bg.aq((String)localObject2, "");
        ((NoteEditorVoiceBaseView)localObject1).eIv = i;
        ((NoteEditorVoiceBaseView)localObject1).setText(str);
      }
    }
    for (;;)
    {
      super.a(paramb, paramInt1, paramInt2);
      GMTrace.o(17155709992960L, 127820);
      return;
      this.skc.setBackgroundResource(R.g.bce);
      break;
      this.sjB.setPadding(26, 7, 0, 7);
      this.skb.setVisibility(8);
      this.ska.setVisibility(0);
      localObject1 = this.skd;
      if (((ImageView)localObject1).getAnimation() != null) {
        ((ImageView)localObject1).startAnimation(((ImageView)localObject1).getAnimation());
      }
      for (;;)
      {
        if (!this.skg.scV.booleanValue()) {
          break label348;
        }
        this.scF.sendEmptyMessage(4096);
        this.ske.setText(R.l.dvm);
        localObject1 = " " + com.tencent.mm.bf.b.t(ab.getContext(), this.skg.sdt).toString();
        this.skf.setText((CharSequence)localObject1);
        break;
        localObject2 = new AlphaAnimation(1.0F, 0.0F);
        ((Animation)localObject2).setDuration(500L);
        ((Animation)localObject2).setInterpolator(new LinearInterpolator());
        ((Animation)localObject2).setRepeatCount(-1);
        ((Animation)localObject2).setRepeatMode(2);
        ((ImageView)localObject1).startAnimation((Animation)localObject2);
      }
      label348:
      this.ske.setText(R.l.dvl);
      localObject1 = " " + com.tencent.mm.bf.b.t(ab.getContext(), (int)com.tencent.mm.bf.b.aD(this.skg.eIw)).toString();
      this.skf.setText((CharSequence)localObject1);
    }
  }
  
  public final int bIG()
  {
    GMTrace.i(17155844210688L, 127821);
    GMTrace.o(17155844210688L, 127821);
    return 4;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */