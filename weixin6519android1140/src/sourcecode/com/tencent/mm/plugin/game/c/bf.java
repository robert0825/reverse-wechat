package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class bf
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPD;
  public String lPE;
  public String lPj;
  public int lRX;
  public String lRY;
  public boolean lRZ;
  
  public bf()
  {
    GMTrace.i(12634585825280L, 94135);
    GMTrace.o(12634585825280L, 94135);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12634720043008L, 94136);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      if (this.lPj != null) {
        paramVarArgs.e(2, this.lPj);
      }
      if (this.lPD != null) {
        paramVarArgs.e(3, this.lPD);
      }
      paramVarArgs.fk(4, this.lRX);
      if (this.lPE != null) {
        paramVarArgs.e(6, this.lPE);
      }
      if (this.lRY != null) {
        paramVarArgs.e(7, this.lRY);
      }
      paramVarArgs.ah(8, this.lRZ);
      GMTrace.o(12634720043008L, 94136);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eBt == null) {
        break label586;
      }
    }
    label586:
    for (int i = b.a.a.b.b.a.f(1, this.eBt) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPj);
      }
      i = paramInt;
      if (this.lPD != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPD);
      }
      i += b.a.a.a.fh(4, this.lRX);
      paramInt = i;
      if (this.lPE != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.lPE);
      }
      i = paramInt;
      if (this.lRY != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.lRY);
      }
      paramInt = b.a.a.b.b.a.cK(8);
      GMTrace.o(12634720043008L, 94136);
      return i + (paramInt + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12634720043008L, 94136);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bf localbf = (bf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 5: 
        default: 
          GMTrace.o(12634720043008L, 94136);
          return -1;
        case 1: 
          localbf.eBt = locala.yqV.readString();
          GMTrace.o(12634720043008L, 94136);
          return 0;
        case 2: 
          localbf.lPj = locala.yqV.readString();
          GMTrace.o(12634720043008L, 94136);
          return 0;
        case 3: 
          localbf.lPD = locala.yqV.readString();
          GMTrace.o(12634720043008L, 94136);
          return 0;
        case 4: 
          localbf.lRX = locala.yqV.nj();
          GMTrace.o(12634720043008L, 94136);
          return 0;
        case 6: 
          localbf.lPE = locala.yqV.readString();
          GMTrace.o(12634720043008L, 94136);
          return 0;
        case 7: 
          localbf.lRY = locala.yqV.readString();
          GMTrace.o(12634720043008L, 94136);
          return 0;
        }
        localbf.lRZ = locala.csU();
        GMTrace.o(12634720043008L, 94136);
        return 0;
      }
      GMTrace.o(12634720043008L, 94136);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */