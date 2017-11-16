package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class in
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public int jhC;
  public LinkedList<is> lSa;
  public int tWu;
  public long tXu;
  public int tXv;
  public LinkedList<String> tXw;
  public String tXx;
  
  public in()
  {
    GMTrace.i(3813394087936L, 28412);
    this.tXw = new LinkedList();
    this.lSa = new LinkedList();
    GMTrace.o(3813394087936L, 28412);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3813528305664L, 28413);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tXx == null) {
        throw new b("Not all required fields were included: SearchID");
      }
      paramVarArgs.T(1, this.tXu);
      paramVarArgs.fk(2, this.tXv);
      if (this.eBt != null) {
        paramVarArgs.e(3, this.eBt);
      }
      paramVarArgs.d(4, 1, this.tXw);
      paramVarArgs.d(5, 8, this.lSa);
      paramVarArgs.fk(6, this.jhC);
      if (this.tXx != null) {
        paramVarArgs.e(7, this.tXx);
      }
      paramVarArgs.fk(8, this.tWu);
      GMTrace.o(3813528305664L, 28413);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.S(1, this.tXu) + 0 + b.a.a.a.fh(2, this.tXv);
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.eBt);
      }
      i = paramInt + b.a.a.a.c(4, 1, this.tXw) + b.a.a.a.c(5, 8, this.lSa) + b.a.a.a.fh(6, this.jhC);
      paramInt = i;
      if (this.tXx != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tXx);
      }
      i = b.a.a.a.fh(8, this.tWu);
      GMTrace.o(3813528305664L, 28413);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tXw.clear();
      this.lSa.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tXx == null) {
        throw new b("Not all required fields were included: SearchID");
      }
      GMTrace.o(3813528305664L, 28413);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      in localin = (in)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3813528305664L, 28413);
        return -1;
      case 1: 
        localin.tXu = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3813528305664L, 28413);
        return 0;
      case 2: 
        localin.tXv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3813528305664L, 28413);
        return 0;
      case 3: 
        localin.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3813528305664L, 28413);
        return 0;
      case 4: 
        localin.tXw.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3813528305664L, 28413);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new is();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((is)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localin.lSa.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3813528305664L, 28413);
        return 0;
      case 6: 
        localin.jhC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3813528305664L, 28413);
        return 0;
      case 7: 
        localin.tXx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3813528305664L, 28413);
        return 0;
      }
      localin.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3813528305664L, 28413);
      return 0;
    }
    GMTrace.o(3813528305664L, 28413);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\in.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */