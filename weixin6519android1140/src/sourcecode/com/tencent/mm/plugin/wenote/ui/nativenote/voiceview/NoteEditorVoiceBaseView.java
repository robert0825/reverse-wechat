package com.tencent.mm.plugin.wenote.ui.nativenote.voiceview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.wenote.model.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.u;

public class NoteEditorVoiceBaseView
  extends TextView
  implements a.a
{
  private boolean aDI;
  private Context context;
  private int duration;
  public int eIv;
  private AlphaAnimation oiv;
  private AnimationDrawable oiw;
  public String path;
  
  public NoteEditorVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17167655370752L, 127909);
    this.aDI = false;
    this.duration = -1;
    this.path = "";
    this.context = paramContext;
    bbc();
    GMTrace.o(17167655370752L, 127909);
  }
  
  public NoteEditorVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17167789588480L, 127910);
    this.aDI = false;
    this.duration = -1;
    this.path = "";
    this.context = paramContext;
    bbc();
    GMTrace.o(17167789588480L, 127910);
  }
  
  private void bbc()
  {
    GMTrace.i(17167923806208L, 127911);
    this.oiv = new AlphaAnimation(0.1F, 1.0F);
    this.oiv.setDuration(1000L);
    this.oiv.setRepeatCount(-1);
    this.oiv.setRepeatMode(2);
    this.oiw = new AnimationDrawable();
    Drawable localDrawable = getResources().getDrawable(R.k.cLg);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.oiw.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.cLh);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.oiw.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.cLi);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.oiw.addFrame(localDrawable, 300);
    this.oiw.setOneShot(false);
    this.oiw.setVisible(true, true);
    GMTrace.o(17167923806208L, 127911);
  }
  
  public final void NS(String paramString)
  {
    GMTrace.i(17168326459392L, 127914);
    w.d("MicroMsg.NoteEditorVoiceBaseView", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    if (!bg.aq(paramString, "").equals(this.path)) {
      bbd();
    }
    GMTrace.o(17168326459392L, 127914);
  }
  
  public final void bIH()
  {
    GMTrace.i(17168460677120L, 127915);
    bbd();
    GMTrace.o(17168460677120L, 127915);
  }
  
  public final void bbd()
  {
    GMTrace.i(17168058023936L, 127912);
    if ((this.oiv != null) && (this.oiv.isInitialized())) {
      setAnimation(null);
    }
    this.aDI = false;
    setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.k.cLf), null, null, null);
    this.oiw.stop();
    GMTrace.o(17168058023936L, 127912);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(17168192241664L, 127913);
    super.onFinishInflate();
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17169131765760L, 127920);
        String str2 = NoteEditorVoiceBaseView.a(NoteEditorVoiceBaseView.this);
        if (a.bII().axU()) {}
        for (String str1 = "true";; str1 = "false")
        {
          w.i("MicroMsg.NoteEditorVoiceBaseView", "clicked path:%s, player isPlay:%s, path:%s", new Object[] { str2, str1, a.bII().path });
          if ((!com.tencent.mm.p.a.aR(NoteEditorVoiceBaseView.b(NoteEditorVoiceBaseView.this))) && (!com.tencent.mm.p.a.aP(NoteEditorVoiceBaseView.b(NoteEditorVoiceBaseView.this)))) {
            break;
          }
          GMTrace.o(17169131765760L, 127920);
          return;
        }
        if ((!f.ty()) && (!bg.nm(NoteEditorVoiceBaseView.a(NoteEditorVoiceBaseView.this))))
        {
          u.fo(paramAnonymousView.getContext());
          GMTrace.o(17169131765760L, 127920);
          return;
        }
        if (k.bGQ().jsG)
        {
          GMTrace.o(17169131765760L, 127920);
          return;
        }
        if ((bg.aq(NoteEditorVoiceBaseView.a(NoteEditorVoiceBaseView.this), "").equals(a.bII().path)) && (a.bII().axU()))
        {
          paramAnonymousView = NoteEditorVoiceBaseView.this;
          w.d("MicroMsg.NoteEditorVoiceBaseView", "stop play");
          paramAnonymousView.bbd();
          a.bII().ahO();
          GMTrace.o(17169131765760L, 127920);
          return;
        }
        NoteEditorVoiceBaseView.c(NoteEditorVoiceBaseView.this);
        GMTrace.o(17169131765760L, 127920);
      }
    });
    GMTrace.o(17168192241664L, 127913);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\voiceview\NoteEditorVoiceBaseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */