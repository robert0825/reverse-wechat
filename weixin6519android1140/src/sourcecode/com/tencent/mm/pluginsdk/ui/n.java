package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMEditText;

public final class n
{
  private Context mContext;
  private StringBuilder tvo;
  private SpannableStringBuilder tvp;
  private SpannableString tvq;
  private SpannableStringBuilder tvr;
  private CharacterStyle tvs;
  private int tvt;
  private int tvu;
  public int tvv;
  
  public n(Context paramContext)
  {
    GMTrace.i(1200309141504L, 8943);
    this.tvp = new SpannableStringBuilder();
    this.tvr = new SpannableStringBuilder();
    this.tvs = new ForegroundColorSpan(-5066062);
    this.tvv = 3;
    this.mContext = paramContext;
    GMTrace.o(1200309141504L, 8943);
  }
  
  public final void a(MMEditText paramMMEditText)
  {
    GMTrace.i(1200577576960L, 8945);
    if (paramMMEditText == null)
    {
      GMTrace.o(1200577576960L, 8945);
      return;
    }
    this.tvv = 0;
    this.tvq = g.bRE().a(this.mContext, paramMMEditText.getText().toString(), paramMMEditText.getTextSize());
    w.d("MicroMsg.VoiceInputHelper", "setFinalText emojiSpannableString = %s", new Object[] { this.tvq });
    paramMMEditText.setText(this.tvq);
    paramMMEditText.setSelection(this.tvq.length());
    GMTrace.o(1200577576960L, 8945);
  }
  
  public final void a(MMEditText paramMMEditText, String paramString, boolean paramBoolean)
  {
    GMTrace.i(1200443359232L, 8944);
    if (paramMMEditText == null)
    {
      GMTrace.o(1200443359232L, 8944);
      return;
    }
    if (this.tvo == null) {
      throw new IllegalStateException("You should saveHistory before setText");
    }
    int k = this.tvt + paramString.length();
    this.tvp.clear();
    this.tvr.clear();
    SpannableStringBuilder localSpannableStringBuilder2;
    if (paramBoolean)
    {
      this.tvq = g.bRE().a(this.mContext, this.tvo.subSequence(0, this.tvt), paramMMEditText.getTextSize());
      SpannableStringBuilder localSpannableStringBuilder1 = this.tvp.append(this.tvq);
      localSpannableStringBuilder2 = this.tvr;
      if ((localSpannableStringBuilder2 == null) || (paramString == null) || (paramString.length() == 0)) {
        localSpannableStringBuilder1.append(localSpannableStringBuilder2).append(this.tvo.subSequence(this.tvu, this.tvo.length()));
      }
    }
    for (;;)
    {
      w.d("MicroMsg.VoiceInputHelper", "setText historySelectStart = %s, historySelectEnd = %s, cursor = %s, length = %s, text = %s, spannableStringBuilder = %s", new Object[] { Integer.valueOf(this.tvt), Integer.valueOf(this.tvu), Integer.valueOf(k), Integer.valueOf(this.tvp.length()), paramString, this.tvp });
      paramMMEditText.setText(this.tvp);
      if (k > this.tvp.length()) {
        break label373;
      }
      if (k != 0) {
        break label367;
      }
      paramMMEditText.setSelection(this.tvp.length());
      GMTrace.o(1200443359232L, 8944);
      return;
      int j;
      if (paramString.length() < this.tvv) {
        j = paramString.length();
      }
      for (int i = 0;; i = j - this.tvv)
      {
        localSpannableStringBuilder2.append(paramString).setSpan(this.tvs, i, j, 33);
        break;
        j = paramString.length();
      }
      this.tvq = g.bRE().a(this.mContext, paramString, paramMMEditText.getTextSize());
      this.tvp.append(this.tvq);
    }
    label367:
    paramMMEditText.setSelection(k);
    label373:
    GMTrace.o(1200443359232L, 8944);
  }
  
  public final void b(MMEditText paramMMEditText)
  {
    GMTrace.i(1200711794688L, 8946);
    if (paramMMEditText == null)
    {
      GMTrace.o(1200711794688L, 8946);
      return;
    }
    this.tvt = paramMMEditText.getSelectionStart();
    this.tvu = paramMMEditText.getSelectionEnd();
    this.tvo = new StringBuilder(paramMMEditText.getText());
    w.d("MicroMsg.VoiceInputHelper", "saveHistory historySelectStart = %s, historySelectEnd = %s, historyStringBuilder = %s", new Object[] { Integer.valueOf(this.tvt), Integer.valueOf(this.tvu), this.tvo });
    if (paramMMEditText.getText().toString().equalsIgnoreCase("")) {
      this.tvp.clear();
    }
    GMTrace.o(1200711794688L, 8946);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */