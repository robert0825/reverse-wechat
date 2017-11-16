package com.tencent.mm.ui.chatting;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bt.g;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.w;
import com.tencent.mm.ui.base.z;
import com.tencent.mm.ui.base.z.a;
import com.tencent.mm.ui.base.z.b;
import com.tencent.mm.ui.p;

@a(3)
public class TextPreviewUI
  extends MMActivity
{
  private TextView jU;
  private CharSequence text;
  private z wHi;
  private com.tencent.mm.ui.widget.h wHj;
  private CharSequence wHk;
  private View wHl;
  private final int wHm;
  private final int wHn;
  private final int wHo;
  private TextView wzQ;
  
  public TextPreviewUI()
  {
    GMTrace.i(19190450749440L, 142980);
    this.jU = null;
    this.wzQ = null;
    this.text = null;
    this.wHm = 0;
    this.wHn = 1;
    this.wHo = 2;
    GMTrace.o(19190450749440L, 142980);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19190584967168L, 142981);
    int i = R.i.csB;
    GMTrace.o(19190584967168L, 142981);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(19190987620352L, 142984);
    finish();
    GMTrace.o(19190987620352L, 142984);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19190719184896L, 142982);
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    if (d.et(19)) {
      getWindow().setFlags(201327616, 201327616);
    }
    for (;;)
    {
      this.wHl = findViewById(R.h.cgO);
      this.text = getIntent().getCharSequenceExtra("key_chat_text");
      this.jU = ((TextView)findViewById(R.h.bCp));
      this.wzQ = ((TextView)findViewById(R.h.bCq));
      CharSequence localCharSequence = this.text;
      TextView localTextView = this.wzQ;
      paramBundle = localCharSequence;
      if ((localCharSequence instanceof SpannableString))
      {
        localTextView.setText(((SpannableString)localCharSequence).toString());
        com.tencent.mm.pluginsdk.ui.d.h.e(localTextView, 1);
        paramBundle = localTextView.getText();
      }
      this.text = paramBundle;
      this.jU.setText(g.bRE().a(this.vKB.vKW, this.text, this.jU.getTextSize()));
      this.wHj = new com.tencent.mm.ui.widget.h(this.vKB.vKW, this.jU);
      this.wHj.xqI = true;
      this.wHj.xqG = new View.OnCreateContextMenuListener()
      {
        public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
        {
          GMTrace.i(19188034830336L, 142962);
          paramAnonymousContextMenu.clear();
          paramAnonymousContextMenu.add(0, 0, 0, TextPreviewUI.this.getResources().getString(R.l.cSp));
          paramAnonymousContextMenu.add(1, 1, 0, TextPreviewUI.this.getResources().getString(R.l.dIC));
          paramAnonymousContextMenu.add(1, 2, 0, TextPreviewUI.this.getResources().getString(R.l.dIB));
          GMTrace.o(19188034830336L, 142962);
        }
      };
      this.wHj.qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(19174613057536L, 142862);
          switch (paramAnonymousMenuItem.getItemId())
          {
          }
          for (;;)
          {
            GMTrace.o(19174613057536L, 142862);
            return;
            ((ClipboardManager)TextPreviewUI.this.vKB.vKW.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(TextPreviewUI.a(TextPreviewUI.this), TextPreviewUI.a(TextPreviewUI.this)));
            if (TextPreviewUI.b(TextPreviewUI.this) != null)
            {
              TextPreviewUI.b(TextPreviewUI.this).caN();
              TextPreviewUI.b(TextPreviewUI.this).caM();
            }
            Toast.makeText(TextPreviewUI.this.vKB.vKW, TextPreviewUI.this.vKB.vKW.getString(R.l.cSq), 0).show();
            GMTrace.o(19174613057536L, 142862);
            return;
            if (TextPreviewUI.b(TextPreviewUI.this) != null)
            {
              TextPreviewUI.b(TextPreviewUI.this).caM();
              paramAnonymousMenuItem = TextPreviewUI.b(TextPreviewUI.this);
              paramAnonymousMenuItem.eWb = true;
              if (paramAnonymousMenuItem.wih != null) {
                paramAnonymousMenuItem.wih.wiB.dismiss();
              }
              if (paramAnonymousMenuItem.wii != null) {
                paramAnonymousMenuItem.wii.wiB.dismiss();
              }
              TextPreviewUI.b(TextPreviewUI.this).eq(0, TextPreviewUI.c(TextPreviewUI.this).getText().length());
              TextPreviewUI.b(TextPreviewUI.this).eWb = false;
              paramAnonymousMenuItem = TextPreviewUI.b(TextPreviewUI.this);
              paramAnonymousMenuItem.a(paramAnonymousMenuItem.wih);
              paramAnonymousMenuItem.a(paramAnonymousMenuItem.wii);
            }
            af.i(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19192195579904L, 142993);
                if (TextPreviewUI.b(TextPreviewUI.this) != null) {
                  TextPreviewUI.b(TextPreviewUI.this).caO();
                }
                GMTrace.o(19192195579904L, 142993);
              }
            }, 100L);
            GMTrace.o(19174613057536L, 142862);
            return;
            TextPreviewUI.b(TextPreviewUI.this.vKB.vKW, TextPreviewUI.a(TextPreviewUI.this));
          }
        }
      };
      if (this.wHi == null)
      {
        paramBundle = new z.a(this.jU, this.wHj);
        paramBundle.wip = R.e.aOQ;
        paramBundle.wiA = 18.0F;
        paramBundle.wiq = R.e.aNo;
        this.wHi = new z(paramBundle);
      }
      this.wHi.wik = new w()
      {
        public final void Q(CharSequence paramAnonymousCharSequence)
        {
          GMTrace.i(19179579113472L, 142899);
          TextPreviewUI.a(TextPreviewUI.this, paramAnonymousCharSequence);
          GMTrace.o(19179579113472L, 142899);
        }
      };
      this.wHl.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19171391832064L, 142838);
          if (TextPreviewUI.b(TextPreviewUI.this) != null)
          {
            if (TextPreviewUI.b(TextPreviewUI.this).eWb)
            {
              TextPreviewUI.this.finish();
              GMTrace.o(19171391832064L, 142838);
              return;
            }
            TextPreviewUI.b(TextPreviewUI.this).caN();
            TextPreviewUI.b(TextPreviewUI.this).caM();
          }
          GMTrace.o(19171391832064L, 142838);
        }
      });
      this.jU.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19185082040320L, 142940);
          if (TextPreviewUI.b(TextPreviewUI.this) != null)
          {
            if (TextPreviewUI.b(TextPreviewUI.this).eWb)
            {
              TextPreviewUI.this.finish();
              GMTrace.o(19185082040320L, 142940);
              return;
            }
            TextPreviewUI.b(TextPreviewUI.this).caN();
            TextPreviewUI.b(TextPreviewUI.this).caM();
          }
          GMTrace.o(19185082040320L, 142940);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(19190316531712L, 142979);
          TextPreviewUI.this.finish();
          GMTrace.o(19190316531712L, 142979);
          return true;
        }
      });
      GMTrace.o(19190719184896L, 142982);
      return;
      getWindow().setFlags(1024, 1024);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(19191121838080L, 142985);
    super.onDestroy();
    GMTrace.o(19191121838080L, 142985);
  }
  
  protected void onResume()
  {
    GMTrace.i(19190853402624L, 142983);
    super.onResume();
    if ((this.wHi != null) && (!this.wHi.eWb)) {
      this.wHi.caO();
    }
    GMTrace.o(19190853402624L, 142983);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\TextPreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */