package com.tencent.mm.ui.contact;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.ui.contact.a.a;

public class SelectSpecialContactUI
  extends MMBaseSelectContactUI
{
  private int jRc;
  private String title;
  
  public SelectSpecialContactUI()
  {
    GMTrace.i(1735703658496L, 12932);
    GMTrace.o(1735703658496L, 12932);
  }
  
  protected final void PY()
  {
    GMTrace.i(1735837876224L, 12933);
    super.PY();
    this.title = getIntent().getStringExtra("titile");
    this.jRc = getIntent().getIntExtra("list_attr", 0);
    GMTrace.o(1735837876224L, 12933);
  }
  
  protected final boolean PZ()
  {
    GMTrace.i(1736106311680L, 12935);
    GMTrace.o(1736106311680L, 12935);
    return false;
  }
  
  protected final boolean Qa()
  {
    GMTrace.i(1736240529408L, 12936);
    GMTrace.o(1736240529408L, 12936);
    return false;
  }
  
  protected final String Qb()
  {
    GMTrace.i(1736374747136L, 12937);
    String str = this.title;
    GMTrace.o(1736374747136L, 12937);
    return str;
  }
  
  protected final o Qc()
  {
    GMTrace.i(1736508964864L, 12938);
    w localw = new w(this, getIntent().getStringExtra("filter_type"));
    GMTrace.o(1736508964864L, 12938);
    return localw;
  }
  
  protected final m Qd()
  {
    GMTrace.i(1736643182592L, 12939);
    GMTrace.o(1736643182592L, 12939);
    return null;
  }
  
  public final void hF(int paramInt)
  {
    GMTrace.i(1735972093952L, 12934);
    Object localObject = cgy().DC(paramInt);
    if (localObject == null)
    {
      GMTrace.o(1735972093952L, 12934);
      return;
    }
    if (((a)localObject).iBi == null)
    {
      GMTrace.o(1735972093952L, 12934);
      return;
    }
    localObject = ((a)localObject).iBi.field_username;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SelectSpecialContactUI", "ClickUser=%s", new Object[] { localObject });
    Intent localIntent = new Intent();
    if (s.ew(this.jRc, 16384))
    {
      localIntent.putExtra("Select_Contact", (String)localObject);
      setResult(-1, localIntent);
      finish();
      GMTrace.o(1735972093952L, 12934);
      return;
    }
    if (s.ew(this.jRc, 32768))
    {
      localIntent.putExtra("Contact_User", (String)localObject);
      d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
      finish();
      GMTrace.o(1735972093952L, 12934);
      return;
    }
    localIntent.setClass(this, En_5b8fbb1e.class);
    localIntent.putExtra("Chat_User", (String)localObject);
    localIntent.putExtra("finish_direct", true);
    startActivity(localIntent);
    finish();
    GMTrace.o(1735972093952L, 12934);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\contact\SelectSpecialContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */