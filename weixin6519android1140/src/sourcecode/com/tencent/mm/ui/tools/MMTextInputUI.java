package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.k;

public class MMTextInputUI
  extends MMActivity
{
  private int fMw;
  private int jrU;
  private EditText wjB;
  private TextView xib;
  private int xic;
  private boolean xid;
  
  public MMTextInputUI()
  {
    GMTrace.i(2026687692800L, 15100);
    GMTrace.o(2026687692800L, 15100);
  }
  
  private void goBack()
  {
    GMTrace.i(2026956128256L, 15102);
    if (getIntent().getBooleanExtra("key_show_confirm", false))
    {
      h.a(this.vKB.vKW, getString(a.k.ggr), "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2009373605888L, 14971);
          MMTextInputUI.this.aLo();
          MMTextInputUI.this.setResult(0);
          MMTextInputUI.this.finish();
          GMTrace.o(2009373605888L, 14971);
        }
      }, null);
      GMTrace.o(2026956128256L, 15102);
      return;
    }
    aLo();
    setResult(0);
    finish();
    GMTrace.o(2026956128256L, 15102);
  }
  
  public int getLayoutId()
  {
    GMTrace.i(2026821910528L, 15101);
    int i = a.h.geV;
    GMTrace.o(2026821910528L, 15101);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2027224563712L, 15104);
    super.onCreate(paramBundle);
    this.wjB = ((EditText)findViewById(a.g.gei));
    this.xib = ((TextView)findViewById(a.g.geb));
    this.wjB.setHint(bg.aq(getIntent().getStringExtra("key_hint"), ""));
    this.wjB.append(bg.aq(getIntent().getStringExtra("key_value"), ""));
    this.fMw = (getIntent().getIntExtra("key_max_count", -1) << 1);
    this.jrU = 0;
    this.xic = Math.max(this.fMw - 120, this.fMw * 9 / 10);
    this.xid = getIntent().getBooleanExtra("key_nullable", false);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1935016984576L, 14417);
        MMTextInputUI.a(MMTextInputUI.this);
        GMTrace.o(1935016984576L, 14417);
        return false;
      }
    });
    a(0, getString(a.k.cTh), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1957431345152L, 14584);
        MMTextInputUI.this.y(MMTextInputUI.b(MMTextInputUI.this).getText());
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("key_result", MMTextInputUI.b(MMTextInputUI.this).getText());
        MMTextInputUI.this.setResult(-1, paramAnonymousMenuItem);
        MMTextInputUI.this.finish();
        GMTrace.o(1957431345152L, 14584);
        return true;
      }
    }, p.b.vLG);
    lf(this.xid);
    if ((!this.xid) || (this.fMw > 0)) {
      this.wjB.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          boolean bool = false;
          GMTrace.i(2059034165248L, 15341);
          paramAnonymousEditable = paramAnonymousEditable.toString();
          int i;
          if (!MMTextInputUI.c(MMTextInputUI.this))
          {
            if (paramAnonymousEditable.trim().length() > 0) {
              MMTextInputUI.this.lf(true);
            }
          }
          else
          {
            if (MMTextInputUI.d(MMTextInputUI.this) <= 0) {
              break label424;
            }
            MMTextInputUI.a(MMTextInputUI.this, 0);
            i = 0;
            label65:
            if (i >= paramAnonymousEditable.length()) {
              break label139;
            }
            if (!bg.h(paramAnonymousEditable.charAt(i))) {
              break label119;
            }
            MMTextInputUI.a(MMTextInputUI.this, MMTextInputUI.e(MMTextInputUI.this) + 2);
          }
          for (;;)
          {
            i += 1;
            break label65;
            MMTextInputUI.this.lf(false);
            break;
            label119:
            MMTextInputUI.a(MMTextInputUI.this, MMTextInputUI.e(MMTextInputUI.this) + 1);
          }
          label139:
          if ((MMTextInputUI.e(MMTextInputUI.this) >= MMTextInputUI.f(MMTextInputUI.this)) && (MMTextInputUI.e(MMTextInputUI.this) <= MMTextInputUI.d(MMTextInputUI.this)))
          {
            MMTextInputUI.this.lf(true);
            MMTextInputUI.g(MMTextInputUI.this).setVisibility(0);
            MMTextInputUI.g(MMTextInputUI.this).setTextColor(MMTextInputUI.this.getResources().getColor(a.d.gcu));
            MMTextInputUI.g(MMTextInputUI.this).setText(MMTextInputUI.this.getString(a.k.gcu, new Object[] { Integer.valueOf(MMTextInputUI.d(MMTextInputUI.this) - MMTextInputUI.e(MMTextInputUI.this) >> 1) }));
            GMTrace.o(2059034165248L, 15341);
            return;
          }
          if (MMTextInputUI.e(MMTextInputUI.this) > MMTextInputUI.d(MMTextInputUI.this))
          {
            MMTextInputUI.this.lf(false);
            MMTextInputUI.g(MMTextInputUI.this).setVisibility(0);
            MMTextInputUI.g(MMTextInputUI.this).setTextColor(MMTextInputUI.this.getResources().getColor(a.d.gcv));
            MMTextInputUI.g(MMTextInputUI.this).setText(MMTextInputUI.this.getString(a.k.ggu, new Object[] { Integer.valueOf((MMTextInputUI.e(MMTextInputUI.this) - MMTextInputUI.d(MMTextInputUI.this) >> 1) + 1) }));
            GMTrace.o(2059034165248L, 15341);
            return;
          }
          paramAnonymousEditable = MMTextInputUI.this;
          if (MMTextInputUI.c(MMTextInputUI.this)) {
            bool = true;
          }
          for (;;)
          {
            paramAnonymousEditable.lf(bool);
            MMTextInputUI.g(MMTextInputUI.this).setVisibility(8);
            label424:
            GMTrace.o(2059034165248L, 15341);
            return;
            if (MMTextInputUI.e(MMTextInputUI.this) > 0) {
              bool = true;
            }
          }
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(2058765729792L, 15339);
          GMTrace.o(2058765729792L, 15339);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(2058899947520L, 15340);
          GMTrace.o(2058899947520L, 15340);
        }
      });
    }
    GMTrace.o(2027224563712L, 15104);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2027492999168L, 15106);
    super.onDestroy();
    GMTrace.o(2027492999168L, 15106);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2027090345984L, 15103);
    if (4 == paramInt)
    {
      w.i("MicroMsg.MMTextInputUI", "on back key down");
      goBack();
      GMTrace.o(2027090345984L, 15103);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2027090345984L, 15103);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(2027761434624L, 15108);
    super.onPause();
    GMTrace.o(2027761434624L, 15108);
  }
  
  protected void onResume()
  {
    GMTrace.i(2027627216896L, 15107);
    super.onResume();
    GMTrace.o(2027627216896L, 15107);
  }
  
  public void y(CharSequence paramCharSequence)
  {
    GMTrace.i(2027358781440L, 15105);
    GMTrace.o(2027358781440L, 15105);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\tools\MMTextInputUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */