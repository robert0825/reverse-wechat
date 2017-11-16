package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class btk
  extends com.tencent.mm.bm.a
{
  public String kBh;
  public int tOG;
  public long tXu;
  public int uBR;
  public all uBS;
  public String unS;
  public LinkedList<String> vce;
  public LinkedList<nq> vcf;
  
  public btk()
  {
    GMTrace.i(3732192362496L, 27807);
    this.vce = new LinkedList();
    this.vcf = new LinkedList();
    GMTrace.o(3732192362496L, 27807);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3732326580224L, 27808);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 1, this.vce);
      paramVarArgs.fk(2, this.uBR);
      if (this.kBh != null) {
        paramVarArgs.e(3, this.kBh);
      }
      paramVarArgs.fk(4, this.tOG);
      paramVarArgs.T(5, this.tXu);
      if (this.unS != null) {
        paramVarArgs.e(6, this.unS);
      }
      if (this.uBS != null)
      {
        paramVarArgs.fm(7, this.uBS.aYq());
        this.uBS.a(paramVarArgs);
      }
      paramVarArgs.d(8, 8, this.vcf);
      GMTrace.o(3732326580224L, 27808);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 1, this.vce) + 0 + b.a.a.a.fh(2, this.uBR);
      paramInt = i;
      if (this.kBh != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kBh);
      }
      i = paramInt + b.a.a.a.fh(4, this.tOG) + b.a.a.a.S(5, this.tXu);
      paramInt = i;
      if (this.unS != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.unS);
      }
      i = paramInt;
      if (this.uBS != null) {
        i = paramInt + b.a.a.a.fj(7, this.uBS.aYq());
      }
      paramInt = b.a.a.a.c(8, 8, this.vcf);
      GMTrace.o(3732326580224L, 27808);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.vce.clear();
      this.vcf.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3732326580224L, 27808);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      btk localbtk = (btk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3732326580224L, 27808);
        return -1;
      case 1: 
        localbtk.vce.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3732326580224L, 27808);
        return 0;
      case 2: 
        localbtk.uBR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3732326580224L, 27808);
        return 0;
      case 3: 
        localbtk.kBh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3732326580224L, 27808);
        return 0;
      case 4: 
        localbtk.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3732326580224L, 27808);
        return 0;
      case 5: 
        localbtk.tXu = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3732326580224L, 27808);
        return 0;
      case 6: 
        localbtk.unS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3732326580224L, 27808);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new all();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((all)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbtk.uBS = ((all)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3732326580224L, 27808);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new nq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((nq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbtk.vcf.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3732326580224L, 27808);
      return 0;
    }
    GMTrace.o(3732326580224L, 27808);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\btk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */