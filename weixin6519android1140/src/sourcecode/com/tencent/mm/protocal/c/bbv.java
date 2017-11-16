package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbv
  extends com.tencent.mm.bm.a
{
  public String eDW;
  public int giH;
  public int giI;
  public String giJ;
  public int hbf;
  public int hcv;
  public String pzf;
  public LinkedList<bjg> uOQ;
  public int uOR;
  public String url;
  
  public bbv()
  {
    GMTrace.i(3954859573248L, 29466);
    this.uOQ = new LinkedList();
    GMTrace.o(3954859573248L, 29466);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3954993790976L, 29467);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.pzf == null) {
        throw new b("Not all required fields were included: clientID");
      }
      paramVarArgs.d(1, 8, this.uOQ);
      if (this.pzf != null) {
        paramVarArgs.e(2, this.pzf);
      }
      if (this.eDW != null) {
        paramVarArgs.e(3, this.eDW);
      }
      if (this.giJ != null) {
        paramVarArgs.e(4, this.giJ);
      }
      if (this.url != null) {
        paramVarArgs.e(5, this.url);
      }
      paramVarArgs.fk(6, this.hcv);
      paramVarArgs.fk(7, this.hbf);
      paramVarArgs.fk(8, this.uOR);
      paramVarArgs.fk(9, this.giH);
      paramVarArgs.fk(10, this.giI);
      GMTrace.o(3954993790976L, 29467);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.uOQ) + 0;
      paramInt = i;
      if (this.pzf != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.pzf);
      }
      i = paramInt;
      if (this.eDW != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eDW);
      }
      paramInt = i;
      if (this.giJ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.giJ);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.url);
      }
      paramInt = b.a.a.a.fh(6, this.hcv);
      int j = b.a.a.a.fh(7, this.hbf);
      int k = b.a.a.a.fh(8, this.uOR);
      int m = b.a.a.a.fh(9, this.giH);
      int n = b.a.a.a.fh(10, this.giI);
      GMTrace.o(3954993790976L, 29467);
      return i + paramInt + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uOQ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.pzf == null) {
        throw new b("Not all required fields were included: clientID");
      }
      GMTrace.o(3954993790976L, 29467);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbv localbbv = (bbv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3954993790976L, 29467);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bjg();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bjg)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbbv.uOQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3954993790976L, 29467);
        return 0;
      case 2: 
        localbbv.pzf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3954993790976L, 29467);
        return 0;
      case 3: 
        localbbv.eDW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3954993790976L, 29467);
        return 0;
      case 4: 
        localbbv.giJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3954993790976L, 29467);
        return 0;
      case 5: 
        localbbv.url = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3954993790976L, 29467);
        return 0;
      case 6: 
        localbbv.hcv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3954993790976L, 29467);
        return 0;
      case 7: 
        localbbv.hbf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3954993790976L, 29467);
        return 0;
      case 8: 
        localbbv.uOR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3954993790976L, 29467);
        return 0;
      case 9: 
        localbbv.giH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3954993790976L, 29467);
        return 0;
      }
      localbbv.giI = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3954993790976L, 29467);
      return 0;
    }
    GMTrace.o(3954993790976L, 29467);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */