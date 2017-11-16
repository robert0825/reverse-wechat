package com.tencent.mm.plugin.backup.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.azr;
import com.tencent.mm.protocal.c.ek;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.LinkedList;

public final class b
{
  public static int a(a parama)
  {
    GMTrace.i(14818979348480L, 110410);
    int i = e.aY(parama.filePath);
    if ((i <= 0) || (parama.iZI == null))
    {
      localObject = new StringBuilder("filePath error or bakitem is null ").append(parama.filePath);
      if (parama.iZI == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.e("MicroMsg.BackupPackUtil", bool);
        GMTrace.o(14818979348480L, 110410);
        return 0;
      }
    }
    if (parama.iZK)
    {
      GMTrace.o(14818979348480L, 110410);
      return i;
    }
    if ((i < 8192) && (parama.iZI.tTe.uNN == 0))
    {
      if (parama.eGK == 5) {
        if (parama.iZN == null)
        {
          w.e("MicroMsg.BackupPackUtil", "MMBAK_EMOJI type but emojiInfo is null!");
          localObject = null;
        }
      }
      for (;;)
      {
        localObject = new azp().be((byte[])localObject);
        parama.iZI.tTf = i;
        parama.iZI.tTg = parama.eGK;
        parama.iZI.tTe = ((azp)localObject);
        GMTrace.o(14818979348480L, 110410);
        return i;
        localObject = ((c)h.j(c.class)).getEmojiMgr().a(parama.iZN);
        continue;
        localObject = e.d(parama.filePath, 0, -1);
      }
    }
    if (parama.iZJ == null)
    {
      w.e("MicroMsg.BackupPackUtil", "error addupMediaList == null");
      GMTrace.o(14818979348480L, 110410);
      return 0;
    }
    Object localObject = parama.iZI.tPW.toString() + "_" + parama.iZI.tPX.toString() + "_" + parama.iZI.tQd + "_backup" + parama.iZL;
    w.d("MicroMsg.BackupPackUtil", "filePath " + parama.filePath + " " + (String)localObject);
    parama.iZI.tTc.add(new azq().Rq((String)localObject));
    parama.iZI.tTd.add(new azr().Ad(parama.eGK));
    if (parama.iZF == null) {
      parama.iZF = new u();
    }
    parama.iZF.jhY = parama.iZI.tQd;
    parama.iZF.mediaId = ((String)localObject);
    parama.iZF.path = parama.filePath;
    parama.iZF.type = parama.eGK;
    if (!parama.iZM) {
      parama.iZJ.add(parama.iZF);
    }
    parama.iZI.tTb = parama.iZI.tTc.size();
    GMTrace.o(14818979348480L, 110410);
    return 0;
  }
  
  public static final class a
  {
    int eGK;
    String filePath;
    u iZF;
    ek iZI;
    LinkedList<u> iZJ;
    boolean iZK;
    String iZL;
    boolean iZM;
    EmojiInfo iZN;
    
    public a(String paramString1, ek paramek, LinkedList<u> paramLinkedList, int paramInt, boolean paramBoolean1, String paramString2, boolean paramBoolean2)
    {
      GMTrace.i(14818710913024L, 110408);
      this.iZK = true;
      this.filePath = paramString1;
      this.iZI = paramek;
      this.iZJ = paramLinkedList;
      this.eGK = paramInt;
      this.iZK = paramBoolean1;
      this.iZL = paramString2;
      this.iZM = paramBoolean2;
      this.iZF = null;
      GMTrace.o(14818710913024L, 110408);
    }
    
    public a(String paramString, ek paramek, LinkedList<u> paramLinkedList, int paramInt, boolean paramBoolean1, boolean paramBoolean2, u paramu)
    {
      GMTrace.i(14818576695296L, 110407);
      this.iZK = true;
      this.filePath = paramString;
      this.iZI = paramek;
      this.iZJ = paramLinkedList;
      this.eGK = paramInt;
      this.iZK = paramBoolean1;
      this.iZM = paramBoolean2;
      this.iZF = paramu;
      GMTrace.o(14818576695296L, 110407);
    }
    
    public a(String paramString, ek paramek, LinkedList<u> paramLinkedList, boolean paramBoolean1, boolean paramBoolean2, EmojiInfo paramEmojiInfo)
    {
      GMTrace.i(14818845130752L, 110409);
      this.iZK = true;
      this.filePath = paramString;
      this.iZI = paramek;
      this.iZJ = paramLinkedList;
      this.eGK = 5;
      this.iZK = paramBoolean1;
      this.iZM = paramBoolean2;
      this.iZF = null;
      this.iZN = paramEmojiInfo;
      GMTrace.o(14818845130752L, 110409);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */