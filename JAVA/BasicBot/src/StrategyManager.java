public class StrategyManager extends Manager {

    StrategyBase strategy = null;

    @Override
    protected void onStart(GameStatus gameStatus) {
	super.onStart(gameStatus);

	// TODO 상대방의 종족이나 ID에 따라서 전략을 선택한다.
	strategy = new StrategyDefault();

	strategy.onStart(gameStatus);
    }

    @Override
    public void onFrame() {
	super.onFrame();

	strategy.onFrame();
    }

    @Override
    protected void onUnitComplete(Unit2 unit) {
	super.onUnitComplete(unit);

	strategy.onUnitComplete(unit);
    }

    @Override
    protected void onUnitDestroy(Unit2 unit) {
	super.onUnitDestroy(unit);

	strategy.onUnitDestroy(unit);
    }

    @Override
    protected void onUnitDiscover(Unit2 unit) {
	super.onUnitDiscover(unit);

	strategy.onUnitDiscover(unit);
    }

    @Override
    protected void onUnitEvade(Unit2 unit) {
	super.onUnitEvade(unit);

	strategy.onUnitEvade(unit);
    }
}