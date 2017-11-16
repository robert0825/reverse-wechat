package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.av.k;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;

public class SpecialCheckBoxPreference
  extends Preference
{
  boolean eMr;
  boolean jGN;
  String jNA;
  private boolean jNm;
  x kse;
  Context mContext;
  private ToggleButton tDF;
  private ToggleButton tDG;
  private ToggleButton tDH;
  private CompoundButton.OnCheckedChangeListener tDI;
  
  public SpecialCheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1055353995264L, 7863);
    this.tDI = new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        int i = 0;
        GMTrace.i(1054280253440L, 7855);
        int j = paramAnonymousCompoundButton.getId();
        if (j == R.h.bYZ)
        {
          paramAnonymousCompoundButton = SpecialCheckBoxPreference.this;
          if (paramAnonymousCompoundButton.kse != null)
          {
            at.AR();
            if (c.yP().TV(paramAnonymousCompoundButton.kse.field_username))
            {
              s.o(paramAnonymousCompoundButton.kse.field_username, true);
              GMTrace.o(1054280253440L, 7855);
              return;
            }
            s.n(paramAnonymousCompoundButton.kse.field_username, true);
          }
          GMTrace.o(1054280253440L, 7855);
          return;
        }
        if (j == R.h.bYY)
        {
          paramAnonymousCompoundButton = SpecialCheckBoxPreference.this;
          if (!paramAnonymousCompoundButton.jGN)
          {
            paramAnonymousBoolean = true;
            paramAnonymousCompoundButton.jGN = paramAnonymousBoolean;
            if (paramAnonymousCompoundButton.eMr) {
              if (!paramAnonymousCompoundButton.jGN) {
                break label215;
              }
            }
          }
          for (;;)
          {
            at.AR();
            c.yJ().b(new k(paramAnonymousCompoundButton.jNA, i));
            paramAnonymousCompoundButton.kse.ds(i);
            at.AR();
            c.yK().a(paramAnonymousCompoundButton.jNA, paramAnonymousCompoundButton.kse);
            paramAnonymousCompoundButton.bNb();
            GMTrace.o(1054280253440L, 7855);
            return;
            paramAnonymousBoolean = false;
            break;
            label215:
            i = 1;
          }
        }
        if (j == R.h.bZb)
        {
          paramAnonymousCompoundButton = SpecialCheckBoxPreference.this;
          if (paramAnonymousCompoundButton.kse != null)
          {
            if (a.eE(paramAnonymousCompoundButton.kse.field_type))
            {
              paramAnonymousCompoundButton.kse.uB();
              s.t(paramAnonymousCompoundButton.kse);
              h.bm(paramAnonymousCompoundButton.mContext, paramAnonymousCompoundButton.mContext.getString(R.l.dTx));
              GMTrace.o(1054280253440L, 7855);
              return;
            }
            s.q(paramAnonymousCompoundButton.kse);
            h.bm(paramAnonymousCompoundButton.mContext, paramAnonymousCompoundButton.mContext.getString(R.l.dTF));
          }
        }
        GMTrace.o(1054280253440L, 7855);
      }
    };
    this.jGN = false;
    this.mContext = paramContext;
    GMTrace.o(1055353995264L, 7863);
  }
  
  public SpecialCheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1055488212992L, 7864);
    this.tDI = new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        int i = 0;
        GMTrace.i(1054280253440L, 7855);
        int j = paramAnonymousCompoundButton.getId();
        if (j == R.h.bYZ)
        {
          paramAnonymousCompoundButton = SpecialCheckBoxPreference.this;
          if (paramAnonymousCompoundButton.kse != null)
          {
            at.AR();
            if (c.yP().TV(paramAnonymousCompoundButton.kse.field_username))
            {
              s.o(paramAnonymousCompoundButton.kse.field_username, true);
              GMTrace.o(1054280253440L, 7855);
              return;
            }
            s.n(paramAnonymousCompoundButton.kse.field_username, true);
          }
          GMTrace.o(1054280253440L, 7855);
          return;
        }
        if (j == R.h.bYY)
        {
          paramAnonymousCompoundButton = SpecialCheckBoxPreference.this;
          if (!paramAnonymousCompoundButton.jGN)
          {
            paramAnonymousBoolean = true;
            paramAnonymousCompoundButton.jGN = paramAnonymousBoolean;
            if (paramAnonymousCompoundButton.eMr) {
              if (!paramAnonymousCompoundButton.jGN) {
                break label215;
              }
            }
          }
          for (;;)
          {
            at.AR();
            c.yJ().b(new k(paramAnonymousCompoundButton.jNA, i));
            paramAnonymousCompoundButton.kse.ds(i);
            at.AR();
            c.yK().a(paramAnonymousCompoundButton.jNA, paramAnonymousCompoundButton.kse);
            paramAnonymousCompoundButton.bNb();
            GMTrace.o(1054280253440L, 7855);
            return;
            paramAnonymousBoolean = false;
            break;
            label215:
            i = 1;
          }
        }
        if (j == R.h.bZb)
        {
          paramAnonymousCompoundButton = SpecialCheckBoxPreference.this;
          if (paramAnonymousCompoundButton.kse != null)
          {
            if (a.eE(paramAnonymousCompoundButton.kse.field_type))
            {
              paramAnonymousCompoundButton.kse.uB();
              s.t(paramAnonymousCompoundButton.kse);
              h.bm(paramAnonymousCompoundButton.mContext, paramAnonymousCompoundButton.mContext.getString(R.l.dTx));
              GMTrace.o(1054280253440L, 7855);
              return;
            }
            s.q(paramAnonymousCompoundButton.kse);
            h.bm(paramAnonymousCompoundButton.mContext, paramAnonymousCompoundButton.mContext.getString(R.l.dTF));
          }
        }
        GMTrace.o(1054280253440L, 7855);
      }
    };
    this.jGN = false;
    this.mContext = paramContext;
    GMTrace.o(1055488212992L, 7864);
  }
  
  final boolean bNb()
  {
    GMTrace.i(1055756648448L, 7866);
    boolean bool;
    if (this.eMr) {
      if (this.kse.fji == 0)
      {
        bool = true;
        this.jGN = bool;
      }
    }
    for (;;)
    {
      if ((this.mContext instanceof MMActivity))
      {
        if (this.jGN)
        {
          ((MMActivity)this.mContext).Ba(0);
          GMTrace.o(1055756648448L, 7866);
          return true;
          bool = false;
          break;
          if (this.jNm) {
            continue;
          }
          this.jGN = this.kse.vc();
          continue;
        }
        ((MMActivity)this.mContext).Ba(8);
        GMTrace.o(1055756648448L, 7866);
        return false;
      }
    }
    GMTrace.o(1055756648448L, 7866);
    return false;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(1055622430720L, 7865);
    super.onBindView(paramView);
    this.tDF = ((ToggleButton)paramView.findViewById(R.h.bYZ));
    this.tDG = ((ToggleButton)paramView.findViewById(R.h.bYY));
    this.tDH = ((ToggleButton)paramView.findViewById(R.h.bZb));
    this.jNA = ((MMActivity)this.mContext).getIntent().getStringExtra("RoomInfo_Id");
    this.eMr = ((MMActivity)this.mContext).getIntent().getBooleanExtra("Is_Chatroom", true);
    this.jNm = ((MMActivity)this.mContext).getIntent().getBooleanExtra("Is_Lbsroom", false);
    at.AR();
    this.kse = c.yK().TE(this.jNA);
    if (this.kse != null)
    {
      paramView = this.tDF;
      at.AR();
      paramView.setChecked(c.yP().TV(this.kse.field_username));
      this.tDH.setChecked(a.eE(this.kse.field_type));
      this.tDG.setChecked(bNb());
    }
    this.tDF.setOnCheckedChangeListener(this.tDI);
    this.tDG.setOnCheckedChangeListener(this.tDI);
    this.tDH.setOnCheckedChangeListener(this.tDI);
    GMTrace.o(1055622430720L, 7865);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\preference\SpecialCheckBoxPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */