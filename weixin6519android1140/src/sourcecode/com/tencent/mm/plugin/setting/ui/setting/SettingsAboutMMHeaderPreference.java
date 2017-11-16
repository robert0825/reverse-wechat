package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.az.c;
import com.tencent.mm.az.r;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.Preference;

public class SettingsAboutMMHeaderPreference
  extends Preference
{
  String oHx;
  
  public SettingsAboutMMHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(4592527998976L, 34217);
    this.oHx = "";
    GMTrace.o(4592527998976L, 34217);
  }
  
  public SettingsAboutMMHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4592393781248L, 34216);
    this.oHx = "";
    GMTrace.o(4592393781248L, 34216);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(4592662216704L, 34218);
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(R.h.bcl);
    localTextView.setText(String.format("%s %s", new Object[] { paramView.getResources().getString(R.l.app_name), this.oHx }));
    localTextView.setOnClickListener(new View.OnClickListener()
    {
      private long oHy;
      
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4624069165056L, 34452);
        long l = bg.Pv();
        if ((this.oHy > l) || (l - this.oHy > 300L))
        {
          this.oHy = l;
          GMTrace.o(4624069165056L, 34452);
          return;
        }
        this.oHy = l;
        paramAnonymousView = SettingsAboutMMHeaderPreference.this.mContext;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(String.format("[ver  ] %s %08X\n", new Object[] { f.b(paramAnonymousView, d.tJC, true), Integer.valueOf(d.tJC) }));
        localStringBuilder.append(com.tencent.mm.sdk.platformtools.e.aiJ());
        localStringBuilder.append(String.format("[cid  ] %d\n", new Object[] { Integer.valueOf(f.eqV) }));
        localStringBuilder.append(String.format("[s.ver] %d\n", new Object[] { Integer.valueOf(com.tencent.mm.az.e.GL()) }));
        localStringBuilder.append(String.format("[l.ver] %d\n", new Object[] { Integer.valueOf(c.GL()) }));
        localStringBuilder.append(String.format("[ws.ver] %d\n", new Object[] { Integer.valueOf(r.KK()) }));
        localStringBuilder.append(String.format("[r.ver] %s\n", new Object[] { "0x26051334" }));
        TextView localTextView = new TextView(paramAnonymousView);
        localTextView.setText(localStringBuilder);
        localTextView.setGravity(19);
        localTextView.setTextSize(1, 10.0F);
        localTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        localTextView.setTextColor(-16777216);
        localTextView.setTypeface(Typeface.MONOSPACE);
        int i = paramAnonymousView.getResources().getDimensionPixelSize(R.f.aQq);
        localTextView.setPadding(i, i, i, i);
        h.a(paramAnonymousView, null, localTextView, null);
        GMTrace.o(4624069165056L, 34452);
      }
    });
    GMTrace.o(4592662216704L, 34218);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsAboutMMHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */