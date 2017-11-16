package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ayx;
import com.tencent.mm.protocal.c.er;
import java.util.LinkedList;

public final class an
  extends ayx
{
  public String gCG;
  public String lQJ;
  public int lQK;
  public LinkedList<String> lRf;
  public m lRg;
  public int lRh;
  public boolean lRi;
  
  public an()
  {
    GMTrace.i(12645054808064L, 94213);
    this.lRf = new LinkedList();
    GMTrace.o(12645054808064L, 94213);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12645189025792L, 94214);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQJ == null) {
        throw new b("Not all required fields were included: Lang");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lQJ != null) {
        paramVarArgs.e(2, this.lQJ);
      }
      paramVarArgs.d(3, 1, this.lRf);
      if (this.gCG != null) {
        paramVarArgs.e(4, this.gCG);
      }
      if (this.lRg != null)
      {
        paramVarArgs.fm(5, this.lRg.aYq());
        this.lRg.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.lRh);
      paramVarArgs.ah(7, this.lRi);
      paramVarArgs.fk(8, this.lQK);
      GMTrace.o(12645189025792L, 94214);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.lQJ != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lQJ);
      }
      i += b.a.a.a.c(3, 1, this.lRf);
      paramInt = i;
      if (this.gCG != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.gCG);
      }
      i = paramInt;
      if (this.lRg != null) {
        i = paramInt + b.a.a.a.fj(5, this.lRg.aYq());
      }
      paramInt = b.a.a.a.fh(6, this.lRh);
      int j = b.a.a.b.b.a.cK(7);
      int k = b.a.a.a.fh(8, this.lQK);
      GMTrace.o(12645189025792L, 94214);
      return i + paramInt + (j + 1) + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lRf.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.lQJ == null) {
        throw new b("Not all required fields were included: Lang");
      }
      GMTrace.o(12645189025792L, 94214);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      an localan = (an)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12645189025792L, 94214);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localan.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12645189025792L, 94214);
        return 0;
      case 2: 
        localan.lQJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12645189025792L, 94214);
        return 0;
      case 3: 
        localan.lRf.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(12645189025792L, 94214);
        return 0;
      case 4: 
        localan.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12645189025792L, 94214);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new m();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((m)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localan.lRg = ((m)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12645189025792L, 94214);
        return 0;
      case 6: 
        localan.lRh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12645189025792L, 94214);
        return 0;
      case 7: 
        localan.lRi = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(12645189025792L, 94214);
        return 0;
      }
      localan.lQK = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(12645189025792L, 94214);
      return 0;
    }
    GMTrace.o(12645189025792L, 94214);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */