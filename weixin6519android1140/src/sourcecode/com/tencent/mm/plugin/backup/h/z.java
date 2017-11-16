package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class z
  extends com.tencent.mm.bm.a
{
  public LinkedList<String> jhS;
  public String jha;
  public long jil;
  public long jim;
  public String jin;
  public String jio;
  
  public z()
  {
    GMTrace.i(14831461597184L, 110503);
    this.jhS = new LinkedList();
    GMTrace.o(14831461597184L, 110503);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14831595814912L, 110504);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jha == null) {
        throw new b("Not all required fields were included: BakChatName");
      }
      if (this.jin == null) {
        throw new b("Not all required fields were included: MsgDataID");
      }
      if (this.jio == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.jha != null) {
        paramVarArgs.e(1, this.jha);
      }
      paramVarArgs.T(2, this.jil);
      paramVarArgs.T(3, this.jim);
      if (this.jin != null) {
        paramVarArgs.e(4, this.jin);
      }
      if (this.jio != null) {
        paramVarArgs.e(5, this.jio);
      }
      paramVarArgs.d(6, 1, this.jhS);
      GMTrace.o(14831595814912L, 110504);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jha == null) {
        break label618;
      }
    }
    label618:
    for (paramInt = b.a.a.b.b.a.f(1, this.jha) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.S(2, this.jil) + b.a.a.a.S(3, this.jim);
      paramInt = i;
      if (this.jin != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jin);
      }
      i = paramInt;
      if (this.jio != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jio);
      }
      paramInt = b.a.a.a.c(6, 1, this.jhS);
      GMTrace.o(14831595814912L, 110504);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jhS.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.jha == null) {
          throw new b("Not all required fields were included: BakChatName");
        }
        if (this.jin == null) {
          throw new b("Not all required fields were included: MsgDataID");
        }
        if (this.jio == null) {
          throw new b("Not all required fields were included: NickName");
        }
        GMTrace.o(14831595814912L, 110504);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        z localz = (z)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14831595814912L, 110504);
          return -1;
        case 1: 
          localz.jha = locala.yqV.readString();
          GMTrace.o(14831595814912L, 110504);
          return 0;
        case 2: 
          localz.jil = locala.yqV.nk();
          GMTrace.o(14831595814912L, 110504);
          return 0;
        case 3: 
          localz.jim = locala.yqV.nk();
          GMTrace.o(14831595814912L, 110504);
          return 0;
        case 4: 
          localz.jin = locala.yqV.readString();
          GMTrace.o(14831595814912L, 110504);
          return 0;
        case 5: 
          localz.jio = locala.yqV.readString();
          GMTrace.o(14831595814912L, 110504);
          return 0;
        }
        localz.jhS.add(locala.yqV.readString());
        GMTrace.o(14831595814912L, 110504);
        return 0;
      }
      GMTrace.o(14831595814912L, 110504);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */