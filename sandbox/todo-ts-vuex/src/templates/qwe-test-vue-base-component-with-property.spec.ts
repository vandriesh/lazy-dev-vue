import { mount, Wrapper } from '@vue/test-utils';
// local imports
import $COMPONENT_NAME$ from './$COMPONENT_NAME$.vue';


describe('$COMPONENT_NAME$', () => {
    let wrapper: Wrapper<$COMPONENT_NAME$>;
    const aProperty = '{some_value}';

    beforeEach(() => {
        // setup
        wrapper = mount($COMPONENT_NAME$, {
            propsData: {
                aProperty
            }
        });
    });

    it('should render', () => {
        const elementWrapper = wrapper.find('.aProperty');

        expect(elementWrapper.text()).toEqual(aProperty);
    });
});
