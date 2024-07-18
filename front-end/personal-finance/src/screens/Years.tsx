import { StyleSheet, Text, View } from 'react-native';

export default function Years() {
    return (
        <View style={styles.container}>
            <Text>Years</Text>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    },
});