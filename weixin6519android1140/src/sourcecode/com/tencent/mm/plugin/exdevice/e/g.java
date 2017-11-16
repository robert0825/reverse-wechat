package com.tencent.mm.plugin.exdevice.e;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class g
  extends j
{
  public String jhn;
  public int kBo;
  public int kBp;
  public int kBq;
  public int kBr;
  public int kBs;
  public String kBt;
  public int kBu;
  public String kBv;
  public int kBw;
  public int kBx;
  public String kBy;
  
  public g()
  {
    GMTrace.i(11111617265664L, 82788);
    GMTrace.o(11111617265664L, 82788);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(11111751483392L, 82789);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.kBB == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.kBB != null)
      {
        paramVarArgs.fm(1, this.kBB.aYq());
        this.kBB.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.kBo);
      paramVarArgs.fk(3, this.kBp);
      paramVarArgs.fk(4, this.kBq);
      paramVarArgs.fk(5, this.kBr);
      paramVarArgs.fk(6, this.kBs);
      if (this.kBt != null) {
        paramVarArgs.e(11, this.kBt);
      }
      paramVarArgs.fk(12, this.kBu);
      if (this.jhn != null) {
        paramVarArgs.e(13, this.jhn);
      }
      if (this.kBv != null) {
        paramVarArgs.e(14, this.kBv);
      }
      paramVarArgs.fk(15, this.kBw);
      paramVarArgs.fk(16, this.kBx);
      if (this.kBy != null) {
        paramVarArgs.e(17, this.kBy);
      }
      GMTrace.o(11111751483392L, 82789);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.kBB != null) {
        paramInt = b.a.a.a.fj(1, this.kBB.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.kBo) + b.a.a.a.fh(3, this.kBp) + b.a.a.a.fh(4, this.kBq) + b.a.a.a.fh(5, this.kBr) + b.a.a.a.fh(6, this.kBs);
      paramInt = i;
      if (this.kBt != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.kBt);
      }
      i = paramInt + b.a.a.a.fh(12, this.kBu);
      paramInt = i;
      if (this.jhn != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.jhn);
      }
      i = paramInt;
      if (this.kBv != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.kBv);
      }
      i = i + b.a.a.a.fh(15, this.kBw) + b.a.a.a.fh(16, this.kBx);
      paramInt = i;
      if (this.kBy != null) {
        paramInt = i + b.a.a.b.b.a.f(17, this.kBy);
      }
      GMTrace.o(11111751483392L, 82789);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = j.a(paramVarArgs); paramInt > 0; paramInt = j.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.kBB == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(11111751483392L, 82789);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      g localg = (g)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      default: 
        GMTrace.o(11111751483392L, 82789);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, j.a((b.a.a.a.a)localObject2))) {}
          localg.kBB = ((e)localObject1);
          paramInt += 1;
        }
        GMTrace.o(11111751483392L, 82789);
        return 0;
      case 2: 
        localg.kBo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(11111751483392L, 82789);
        return 0;
      case 3: 
        localg.kBp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(11111751483392L, 82789);
        return 0;
      case 4: 
        localg.kBq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(11111751483392L, 82789);
        return 0;
      case 5: 
        localg.kBr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(11111751483392L, 82789);
        return 0;
      case 6: 
        localg.kBs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(11111751483392L, 82789);
        return 0;
      case 11: 
        localg.kBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(11111751483392L, 82789);
        return 0;
      case 12: 
        localg.kBu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(11111751483392L, 82789);
        return 0;
      case 13: 
        localg.jhn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(11111751483392L, 82789);
        return 0;
      case 14: 
        localg.kBv = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(11111751483392L, 82789);
        return 0;
      case 15: 
        localg.kBw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(11111751483392L, 82789);
        return 0;
      case 16: 
        localg.kBx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(11111751483392L, 82789);
        return 0;
      }
      localg.kBy = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(11111751483392L, 82789);
      return 0;
    }
    GMTrace.o(11111751483392L, 82789);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\e\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */